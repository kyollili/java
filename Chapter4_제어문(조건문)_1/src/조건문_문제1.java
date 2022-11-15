/*
 * 문제1. if/else 문제
 * 정수 한 개를 입력받아서, 그 수가 50 이상의 수인지 50미만의 수인지 판단해보자.
 * 
 * 	형식)
 *		if(a>=50)
 *		{
 *			조건문이 true일 때 처리하는 영역
 *		}
 *		else
 *		{
 *			조건문이 false일 때 처리하는 영역
 *		}
 */
import java.util.Scanner;
public class 조건문_문제1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력");
		int num1=scan.nextInt();
		
		if(num1>=50)
		{
			System.out.println(num1+"는(은) 50 이상입니다");
		}
		else
		{
			System.out.println(num1+"는(은) 50 미만입니다");
		}
	}

}
