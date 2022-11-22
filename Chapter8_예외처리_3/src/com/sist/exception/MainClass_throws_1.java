package com.sist.exception;
/*
 * 		throws
 * 		------
 * 			이미 만들어진 메소드에서 예외에 대한 예측이 어렵다
 * 			==> 다른 언어(선언) ==> 코딩 에러처리를 할 수 없다
 * 			==> 자바에는 어떤 에러가 발생할 지를 선언 하고 있다(대비) => 견고한 프로그램을 만들 수 있다
 * 			==> 가독성
 * 		-----------------------------------------------------------------
 * 		aaa() : 기능 리턴형
 */
public class MainClass_throws_1 {
	
	public static void method1() throws Exception
	{
		method2();
	}
	public static void method2() throws Exception
	{
		throw new Exception();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
