package com.sist.exception;

import java.io.IOException;

/*
 * 		1. try~catch
 * 		2. throws
 * 		  --------
 * 			예외선언(예외회피) => 시스템에 예외 알려준다
 * 			형식)
 * 				public void display() throws NumverFormatException,RuntimeException,Exception
 * 											-------------------------------------------------
 * 													catch : 순서 , throws : 순서 없음
 * 				=> 라이브러리는 예상된 예외를 throws로 이용해서 등록
 * 									  -------------------처리하면서 사용 해야한다
 * 					==> 사용법 
 * 							1)try~catch : 직접 처리
 * 							2) throws : 선언만 처리
 * 
 * 				public void display() throws Exception ==> display 호출 시에 Exception 처리한 후 사용
 * 				{
 * 				}
 * 				
 * 				public void aaa()
 * 				{
 * 					display(); //오류 코드
 * 				}
 * 
 * 				1)
 * 					public void aaa()
 * 					{
 * 						try
 * 						{
 * 							display();
 * 						}catch(Exception e){}
 * 					}
 * 				2)
 * 					public void aaa() throws Exception
 * 					{
 * 						display();
 * 					}
 * 				----------------------------------------------------------
 * 				public void aaa() throws NumberFormatException,ArrayIndexOutOfBoundsException
 * 				{
 * 				}
 * 				main()
 * 				{
 * 					aaa(); //정상수행
 * 				}
 * 	
 * 				//Exception / Throwable : 모든 예외를 처리할 수 있는 클래스
 * 			
 * 				void aaa() throws IOException,ClassNotFoundException
 * 				
 * 				void bbb() throws IOException,ClassNotFoundException
 * 				void bbb() throws Exception ==> 확대
 * 				void bbb() throws Throwable ==> 확대
 * 				-------------------------------------------------------
 * 				void aaa() throws Throwable ==> 축소
 * 				
 * 				void bbb() throws Exception(x)
 * 				-------------------------------------------------------
 * 							Throwable
 * 								|
 * 						---------------------
 * 						|					|
 * 					Error				Exception	
 * 											RuntimeException ==> 예외처리를 생략할 수 있다
 * 												|
 * 											NumberFormatException,NullPointerException	
 * 						
 */
public class MainClass_예외처리_1 {
	//CheckException => 컴파이러가 예외처리가 되었는지 확인
	public static void aaa() throws InterruptedException,IOException
	{
		
	}
	//UnCheckException => 컴파일러가 예외처리 확인 안함 => 예외처리 생략할 수 있음
	public static void bbb() throws NumberFormatException, NullPointerException
	{
		
	}
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		/*bbb();
		//aaa(); //=> CheckException이라 오류
		try
		{
			aaa();
		}catch(Exception ex) {}*/
		aaa();
	}

}
