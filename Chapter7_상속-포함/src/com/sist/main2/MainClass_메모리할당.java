package com.sist.main2;
/*
 * 		상속
 * 		=> 메모리 할당
 * 			자신 객체 = 자신의 생성자
 * 			-------------------
 * 			A a=new A()
 * 			--		---
 * 		
 * 			자신의 객체 = 상위클래스 생성자
 * 			A가 B로부터 상속을 받는다
 * 			class A extends B
 * 
 * 			B b=new A();  //변수는 B, 메소드는 A
 * 			--		---
 * 			A a=new B();  // 변수는 A, 메소드는 B
 * 			--		---
 */
class A
{
	int a=10;
	public void display()
	{
		System.out.println("A:display Call...");
	}
}
class B extends A
{
	int a=100;
	public void display()
	{
		System.out.println("B:display Call...");
	}
}
public class MainClass_메모리할당 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B b=new B();
		//b.a=100; , 메소드는 B:display Call...
		System.out.println(b.a);
		b.display();
		
		A c=new B();
		System.out.println(c.a); //10
		c.display(); //B:display Call...
		
		B d=(B)c; //형변환 => B
		System.out.println(d.a);//100
		d.display();//B:display Call...
		
		//형변환 => 상속 내리는 클래스 > 상속 받는 클래스
		// 자바에서 지원하는 라이브러리 ==> return Object
	
	}

}
