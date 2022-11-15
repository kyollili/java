/*
 * 	클래스 구성요소
 * 	-----------
 * 		1) 변수(멤버변수)***
 * 			인스턴스 변수 / 클래스 변수
 * 			각자 저장		공통 저장
 * 		2) 메소드 : 특정 작업을 수행하는 명령문의 집합
 * 				  -------사용자가 요청한 내용(로그인, 회원가입, 게시판 목록, 게시한 상세보기, 예매, 결제..)
 * 						----------------사용자가 보내준 값, 처리 결과값
 * 										-------------  -------
 * 										 매개변수			리턴형
 * 			유형
 * 			----------------------------
 * 				리턴형		매개변수
 * 			----------------------------
 * 				 O			  O
 * 			----------------------------
 * 				 O			  X
 * 			----------------------------
 * 				 X			  O		
 * 			----------------------------
 * 				 X			  X
 * 			----------------------------
 * 
 * 			메소드 종류
 * 			-----------
 * 			=> 인스턴스 메소드 : 다른 메모리에 저장 (각자 다르게 동작)
 * 				void display()
 * 				{
 * 				}
 * 			=> 클래스 메소드 : static => 메모리에 저장된다(공유) ==> 한글변환, 메뉴 클릭..
 * 				static void display()
 * 				{
 * 				}
 * 			=> 추상 메소드 : 선언부 / 구현부 중 선언부만 있음
 * 				abstract void display(); ==> 이벤트 처리, 데이터베이스 (설계)
 * 			메소드 사용 이유
 * 			-----------
 * 			=> 반복 제거 (코딩의 간소화)
 * 			=> 가독성(구조화된 프로그램)
 * 			메소드의 형식
 * 			-----------
 * 			리턴형 메소드명(매개변수..)
 * 			{
 * 				처리기능
 * 				return 값;
 * 			}
 * 
 * 			리턴형이 없는 경우 : 메소드 자체 처리(출력) 			
 * 			void 메소드명()
 * 			{
 * 				처리 후에
 * 				결과를 바로 출력
 * 				return; // 생략이 가능한데 ==> 컴파일러에 의해 자동 첨부
 * 			}
 * 			***return => 메소드 종료를 알려준다
 * 
 * 			자바에서 생략
 * 			---------자동으로 컴파일러가 추가
 * 			1. return
 * 			2. 생성자
 * 			3. import 생략
 * 			  --------------import java.lang.*;
 * 			class Card
 * 			{
 * 			}
 * 
 * 			Card card=new Card();
 * 						  -------
 * 
 * 			메소드 호출
 * 			---------
 * 			class ClassName
 * 			{
 * 				void aaa()
 * 				{
 * 					호출이 가능한 메소드
 * 					bbb()
 * 					ccc()
 * 					eee()
 * 				}
 * 				static void bbb()
 * 				{
 * 					ccc()
 * 					==> aaa(), eee() 호출을 원하는 경우
 * 						ClassName c=new ClassName();
 * 						c.aaa()
 * 						c.eee()
 * 				}
 * 				static void ccc()
 * 				{
 * 					bbb()
 * 				}
 * 				void eee()
 * 				{
 * 					static, instance 상관 없이 호출 가능
 * 					aaa()
 * 					bbb()
 * 					ccc()
 * 				}
 * 			}
 * 			
 * 			인스턴스 메소드
 * 				객체명.메소드명()
 * 			클래스 메소드 (static)
 * 				클래스명.메소드명()
 * 	
 * 		3) 생성자
 * 	-------------
 * 		OOP(객체지향의 특성)의 특성
 * 	-------------------------
 * 		변수 => 데이터를 가지고 가는 사람(해킹)
 * 				----------------------방지 (캡슐화)
 * 		메소드 => 추가, 수정 ====> 다형성(오버로딩,오버라이딩)
 * 		클래스 => 재사용 (상속, 포함)
 * 				상속(is-a) : 변경해서 사용 => 오버라이딩
 * 				포함(has-a) : 있는 그대로 사용
 */
public class 메소드_1 {
	void aaa()
	{
		bbb();
		ccc();
		eee();
	}
	static void bbb()
	{
		ccc();
		//aaa(); , eee();는 오류
		//static은 static만 호출 (인스턴스 호출이 어렵다) 인스턴스 호출 하려면 클래스를 저장하고 호출해야함
		메소드_1 a=new 메소드_1();
		a.aaa();
		a.eee();
	}
	static void ccc()
	{
		bbb();
		메소드_1 a=new 메소드_1();
		a.aaa();
		a.eee();
	}
	void eee()
	{
		aaa();
		bbb();
		ccc();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
