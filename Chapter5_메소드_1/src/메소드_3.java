//사칙연산
import java.util.Scanner;
public class 메소드_3 {
	//+
	static int add(int a, int b)
	{
		return a+b;
	}
	//-
	static int minus(int a,int b)
	{
		return a-b;
	}
	//*
	static int gop(int a, int b)
	{
		return a*b;
	}
	// /
	static int div(int a, int b)
	{
		return a/b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("첫번째 정수 입력:");
		int a=scan.nextInt();
		System.out.print("두번째 정수 입력:");
		int b=scan.nextInt();
		
		//연산자
		System.out.print("연산자 입력(+,-,*,/):");
		String op=scan.next();
		
		int result=0; //long, double 가능
		switch(op)
		{
		case "+":
			result=add(a,b); //result=> a+b (return값을 받아서 적용)
			//호출 ==> 메소드명(매개변수값 지정 => 실제값만 전송)
			//호출 ==> 메소드{전체를 수행} ==> 끝나고 나면 호출한 위치로 돌아옴
			// 
			break;
		case "-":
			result=minus(a,b); 
			break;
		case "*":
			result=gop(a,b); 
			break;
		case "/":
			result=div(a,b); 
			break;
		}
		System.out.println("result:"+result);
	}

}
