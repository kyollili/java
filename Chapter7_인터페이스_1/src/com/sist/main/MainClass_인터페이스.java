package com.sist.main;
/*
 * 		1. 클래스의 종류
 * 			***1) 일반 클래스
 * 					[접근지정어] class ClassName
 * 					{
 * 						----------------
 * 							변수(멤버변수)
 * 						----------------
 * 							메소드
 * 						----------------
 *  						생성자
 * 						----------------
 * 					}
 * 			2) 추상 클래스 => 관련된 클래스가 여러 개일 경우(한 개의 이름으로 전체 클래스를 제어)
 * 				==> Model (웹에서 데이터베이스 <==> 자바 <==> 브라우저)
 * 				[접근지정어] abstract class ClassName
 * 				{
 * 					--------------------------
 * 						멤버변수(인스턴스 변수)
 * 					--------------------------
 * 						메소드(구현이 안된 메소드) ==> 공통적으로 적용(구현 내용이 틀릴 경우)
 * 						public abstract 리턴형 메소드(매개변수);
 *  				--------------------------
 *  					메소드(구현이 된 메소드)  ==> 선택적으로 적용
 *   				--------------------------
 *   			}
 * 			***3) 인터페이스 : 추상클래스의 일종 => 추상클래스의 단점을 보완(다중 상속)***** 모든 프로그램의 중심
 * 							***스프링, 마이바티스, JPA : 인터페이스 기반
 * 					JDK 1.5 이하에서는 모든 메소드가 구현이 안된 추상메소드만 갖고 있다 (무조건 구현)
 * 					JDK 1.5 이상에서는 구현된 메소드가 등장 : 필요한 클래스에서만 오버라이딩 
 * 
 *        			public interface Interface명
 *        			{
 *        				---------------------------------
 *        					변수(인스턴스 변수는 사용하지 않는다)
 *        					---상수형 변수
 *        					int a; ==> 오류
 *        					int a=10; => 값을 지정한다
 *        					public final static int a=10;
 *        					-------------------
 *              		---------------------------------
 *              			추상 메소드(선언만 가능)
 *              			void display();
 *              			public abstract void display();
 *              			---------------
 *                    	---------------------------------
 *                    		구현된 메소드(default)
 *                    		default void display()
 *                    		{
 *                    		}
 *                    
 *                    		public default void display()
 *                    		------
 *                    		{
 *                    		}
 *                      ---------------------------------
 *                          구현된 메소드(static)
 *                          static void display()
 *                          {
 *                          }
 *                          
 *                          public static void display()
 *                          ------
 *                          {
 *                          }
 *                      ---------------------------------
 *        			}
 *        			=> 메소드가 미완성 => 메모리 저장 불가능 => 상속을 받아서 구현 후 사용
 *        			
 *        			class ==========> class
 *        					extends
 *        			interface =============> class
 *        						implements
 *        			interface ===========> interface
 *        						extends
 *        			class =============> interface (error)
 *        
 *        			=> 다중 상속이 가능하다 (interface도 클래스다) ==> 서로 다른 클래스를 연결해서 사용
 *        													-------------------리모콘
 *        				자바는 리모콘의 기능이 뛰어나다 (통합리모콘)
 *        
 *        			interface A 
 *        			interface B extends A
 *        			interface C extends B ==> A,B,C의 기능
 *        													//단일상속
 *        			interface A
 *        			interface B
 *        			interface C extends B,A
 *        													
 *        			interface A
 *        			interface B
 *        			class C
 *        			class D extends C implements A,B
 *       													//다중상속
 *        					
 * 			4) 내부 클래스
 * 				= 멤버클래스
 * 				= ***익명의 클래스
 * 				= 지역 클래스
 * 			5) 종단 클래스
 */
public class MainClass_인터페이스 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
