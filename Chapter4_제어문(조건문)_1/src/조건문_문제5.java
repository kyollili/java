/*
 * 문제5. if/else 문제
 * 사용자로 부터 정수를 입력받아서 양수인지 음수인지 확인하는 프로그램 작성
 */

import java.util.Scanner;
public class 조건문_문제5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int num1=scan.nextInt();
		
		if(num1>0)
			System.out.println(num1+"는(은) 양수입니다");
		else if(num1==0)
			System.out.println(num1+"는(은) 양수도 음수도 아닙니다");
		else
			System.out.println(num1+"는(은) 음수입니다.");

	}

}
/*
 * System.out.println(num<0?+"는 음수입니다":num+"는(은) 양수입니다")
 * 한줄 표현 if/else는 삼항연산자로 나타낼 수 있다
 */
