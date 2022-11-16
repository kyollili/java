/*
 * 		비교연산자 : 기본형만 비교가 가능하다
 * 				  -----정수 / 실수 / 문자 / 논리
 * 				  -----문자열 비교 (equals)
 * 
 * 		1) == 같다
 * 		2) != 같지않다
 * 		3) <  작다 ====> 기준 왼쪽
 * 		4) >  크다
 * 		5) <= 작거나 같다
 * 		6) >= 크거나 같다
 * 		---------------------------무조건 결과값 boolean(true/false)
 */
public class 비교연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 비교
		int a = (int)(Math.random()*5)+1;
		//				0.0~0.99 ==>*5 ==>0~4 ==>1~5
		int b=(int)(Math.random()*5)+1;
		
		System.out.println("a="+a+",b="+b);
		System.out.println("a==b:"+(a==b));
		System.out.println("a!=b:"+(a!=b));
		System.out.println("a<b:"+(a<b));
		System.out.println("a>b:"+(a>b));
		System.out.println("a<=b:"+(a<=b));
		System.out.println("a>=b:"+(a>=b));
	}

}
