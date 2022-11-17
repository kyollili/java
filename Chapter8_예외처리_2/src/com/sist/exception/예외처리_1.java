package com.sist.exception;
/*
 * 		컴파일(이전 파일 변경), 인터프리터(한 줄씩 읽어서 출력)
 * 		---------------	  ---------------------
 * 			javac				java
 * 			  |					  |
 * 		프로그래머의 오류				사용자의 오류
 * 		---------------		-------------------
 * 		CheckException		UnCheckException
 * 		컴파일러가 예외처리가		확인하지 않음 
 * 		되었는지 여부 확인		=> 예외처리 생략 가능
 * 
 * 		CheckException
 * 			= IOException : 파일명, 경로명
 * 			= ClassNotFoundException : 클래스가 없는 경우 (리플랙션 => new없이 메모리 할당 가능)
 * 			= SQLException : 데이터베이스 연결(오라클, MySQL)
 * 			= InterruptedException : 쓰레드 충돌
 * 			= MalformedURLException : ip, url주소가 틀린 경우 ==> 크롤링
 * 		UNCheckException
 * 			= ArrayIndexOutOfBoundsException : 배열범위가 초과시에 (인덱스 번호 오류)
 * 												=> 12장 (컬렉션)
 * 			= NumberFormatException : 정수변환 ==> 웹/윈도우는 정수를 전송할 수 없다 (문자열)
 * 			= NullPointException : 객체 생성 없이 선언 후 사용
 * 					모든 클래스는 기본값 null => 메소드나 변수 사용이 안됨
 * 			= ClassCastException : 클래스 형변환 => 제네릭스(자동 형변환)
 * 			class A<T> ==> 임시클래스 ==> Object
 * 			{
 * 				T t;
 * 				public void setT(T t)
 * 				{
 * 				}
 * 				public T getT()
 * 				{
 * 				}
 * 			}
 * 			
 * 			----------------------------------------------------------------------
 * 			1) 처리방법
 * 				***1. 예외복구 (직접처리) try~catch~finally ==> 프로그래머가 처리
 * 				***2. 예외회피 (간접처리) throws ==> 시스템이 알려준다
 * 					  라이브러리에 많이 존재
 * 					  sleep() throws InterruptedException
 * 				3. 예외던지기 (임의로 발생) throw ==> 사용빈도는 거의 없다 (continue)
 * 				   ----------------- 사용자정의 예외처리
 * 			2) 사용법
 * 				try : 정상 수행이 가능한 코딩 (예외가 발생할 가능성) ==> 에러에 대비한 코딩
 * 					=> 프로그래머 실수
 * 					=> 사용자 입력 오류
 * 				catch : 오류 발생 시에 어떻게 처리할지 코딩(복구 => 에러확인)
 * 						=> 프로그래머 실수(복구) => 소스 수정
 * 						=> 사용자 실수 => 다시 입력 요청
 * 						=> 예상되는 에러만큼 catch를 사용할 수 있다 (멀티) => 통합
 * 						=> 전체 예외처리가 가능한 클래스 : Exception / Throwable
 * 				finally : 무조건 수행되는 문장
 * 						try에서만 수행 ===> 정상수행
 * 						try~catch ==> 오류 발생
 * 						finally : try/catch 수행 상관 없이 무조건 수행 (파일닫기, 서버연결 해제, 데이터베이스 닫기,,)
 * 				-------------------->생략 가능 (필요시에만 사용)
 * 				
 * 				예)
 * 					String num=10;
 * 					=> 정수변환
 * 					int i=Integer.parseInt(num); => 오류발생 (오류에 대한 대비가 없는 경우) => 프로그램 종료
 * 					1---
 * 					2---
 * 					3---
 * 					4---
 * 					-----------------정상수행시 5번까지 수행
 * 
 * 					에러발생에 대한 대비
 * 					-----------------
 * 					try
 * 					{
 * 						문장1		==> 정상수행
 * 						문장2		==> 정상수행
 * 						문장3		==> 정상수행 ==> try 종료 후 catch 수행하지 않고 문장7로 넘어감
 * 
 * 					}catch(A)
 * 					{
 * 						처리문장4
 * 					}
 * 					catch(B)
 * 					{
 * 						처리문장5
 * 					}
 * 					catch(C)
 * 					{
 * 						처리문장6
 * 					}
 * 					문장7
 * 				------------------------------------------------
 * 					try
 * 					{
 * 						문장1		==> 정상수행
 * 						문장2		==> 오류발생(B) ==> B라는 오류를 찾는다
 * 						문장3		==> 정상수행 
 * 
 * 					}catch(A) ==> 다중조건문(선택문)
 * 					{
 * 						처리문장4
 * 					}
 * 					catch(B)
 * 					{
 * 						처리문장5	==> 수행
 * 					}
 * 					catch(C)
 * 					{
 * 						처리문장6
 * 					}
 * 					문장7
 * 				----------------------------------------------------
 * 					try
 * 					{
 * 						문장1		==> 정상수행
 * 						문장2		==> 오류발생(B)
 * 						문장3		==> 정상수행 
 * 
 * 					}catch(A | B | C)
 * 					{
 * 						처리문장4
 * 					}
 * 					
 * 					문장7
 * 				-----------------------------------------------------
 * 					try
 * 					{
 * 						문장1		==> 정상수행
 * 						문장2		==> 오류발생(B)
 * 						문장3		==> 정상수행 
 * 
 * 					}catch(Exception) ==> Exception : 모든 예외처리가 가능
 * 					{
 * 						처리문장4
 * 					}
 * 					
 * 					문장7
 */
import java.util.Scanner;
public class 예외처리_1 {

	/*public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(100);
	}*/ //간접처리
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/ //직접처리
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// UnCheckException => 예외처리 생략 가능 => 정수변환, 배열, 나누기, Null
		try
		{
			Scanner scan=new Scanner(System.in);
			System.out.print("정수 두 개 입력(10 10):");
			int[] arr=new int[2];
			arr[0]=scan.nextInt();
			arr[2]=scan.nextInt(); //오류 발생 ==> 프로그램 비정상 종료
		
		int res=arr[0]/arr[1];
		System.out.println("res="+res);
		
		}catch(ArrayIndexOutOfBoundsException ex)
		{
			//에러 확인
			//System.out.println(ex.getMessage()); //처리
			ex.printStackTrace();//실행과정 출력==>p.442
		}
		System.out.println("프로그램 종료");
	}
}
