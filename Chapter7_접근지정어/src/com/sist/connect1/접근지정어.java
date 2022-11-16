package com.sist.connect1;
//다른 클래스에서 접근 시에는  ==> import
//import 
/*
 * 다른 패키지에 존재하는 클래스를 사용할 때 ==> import
 * 	=> 라이브러리 / 사용자정의 클래스
 * 
 * 		import 패키지명.클래스명 => 클래스 한 개만 가지고 올 때
 * 		import 패키지명.* ==> 패키지에 있는 모든 클래스를 가지고 올 때
 * 		import static 패키지명.클래스명.메소드명 ==> 메소드 한 개
 * 		import static 패키지명.클래스명.* ==> 모든 메소드
 */
// Math, String, StringBuffer, Integer, Object => 자동으로 import를 처리
/*
 *  생략 => 자동 컴파일러가 처리
 *  1) 메소드
 *  	void display()
 *  	{
 *  		return; ==> 생략을 해도 자동 추가
 *  	}
 *  2) 생성자
 *  	class A
 *  	{
 *  		A() ==> 생략시에 자동 추가 (기본 생성자만)
 *  		{
 *  		}
 *  	}
 *  3) import문
 *  	import java.lang.* ==> 자동으로 추가
 */
//import java.util.Scanner; //권장 (메모리가 더 적어서 속도 더 빠름)
//import java.util.*;
import static java.lang.Math.random;
import static java.lang.System.out;
import static java.lang.String.valueOf;
//Math.random()
//static일 때만 가능
/*
 * 패키지 선언
 * 	package 패키지명; ==> 분류(폴더)
 * ----------------------------
 * 	import
 * 	= 패키지명.클래스명
 * 	= 패키지명.*
 * 
 * 		java 코딩
 * 		package ==> 한 번만 사용
 * 		import	==> 여러 개 사용 가능
 * 		class 선언
 * 
 * 		**static
 * 		import static 패키지명.클래스명.메소드명;
 * 		import static 패키지명.클래스명.*;
 * 
 * 		static
 * 		클래스명. 메소드명
 * 		------생략
 * 
 * 		import는 라이브러리만 사용하는 것이 아니라 사용자 정의 클래스도 사용한다
 * 		---------------------------------------------------
 * 		주의점)
 * 			import 사용이 필요없는 경우
 * 			---------------------
 * 				같은 패키지에 있는 클래스를 사용할 때는 import를 사용하지 않는다
 * 				다른 패키지에 있는 클래스를 사용할 때는 반드시 import를 사용한다
 * 
 * 		패키지명 설정
 * 		com.회사명.분류명
 * 		---------------폴더명(키워드 사용 불가)
 * 		알파벳, 한글 가능, 숫자 가능, 키워드 불가능, 특수문자 가능
 * 		-----권장(소문자)
 * 		
 * 		com.sist.분류명
 */
public class 접근지정어 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)(random()*10)+1;
		out.println(valueOf(a));
	}

}
