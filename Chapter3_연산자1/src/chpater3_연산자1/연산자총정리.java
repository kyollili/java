package chpater3_연산자1;
/*
 * 1. 변수(page20-21). 데이터형(page27)
 * 2. 연산자
 * ---------------------\
 * 
 * 1. 데이터형
 * 		정수형(int, long, byte), 실수형(double), 논리형(boolean), 문자형(char)
 * 2. 변수 : 한 개의 데이터만 저장이 가능한 공간
 * 		= 초기화
 * 		  char ==> '값'
 * 		  int, byte ==> 10, 20...
 * 		  long ==> 10L(l)
 * 		  double ==> 0.0
 * 		  ---------------------ㅡ---다른 데이터형의 값을 지정할 수 있다
 * 		  boolean ==> true/false
 * 		= 변수의 장점 : 필요시마다 값을 변경이 가능
 * 		  int a=10;
 * 		  a=20;
 * 		  a=30;
 * 		  a=50; ...
 * 		= 변수 설정하는 방법
 * 			1) 문장을 보고 변수 찾기
 * 			2) 실제 출력된 화면 보고 찾기
 * 			3) 실제 동작하는 화면 보고 찾기
 * 3. 출력하는 기능 / 입력하는 기능
 * 		System.out.println() ==> 한줄씩 출력
 * 		System.out.print() ==>옆에 붙여서 출력
 * 		System.out.printf() ==> 서식
 * 
 * 		Scanner scan=new Scanner(System.in)
 * 					-----클래스를 저장할 때 사용한다
 * 		*Integer.toOctalString(0) : 정수를 8진법으로 변경
 * 		*Integer.toHexString(0) : 정수를 16진법으로 변경
 * 		*Integer.toBinaryString(0) : 정수를 2진법으로 변경
 * 
 * 4. 연산자 (page87)
 * 		단항연산자
 * 			= 증감연산자 (++,--), 전치연산자(++a), 후치연산자(a++) (page93)
 * 		***	= 부정연산자 (!) => boolean (반복문, 조건문) (page119)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                           
 * 		***	= 형변환 연산자 : (type) ==> (int), (char), (double), (byte) (page82)
 * 				***작은 데이터형으로 변환 : 오버플로우
 * 					byte b=(byte)300;
 * 			= 음수, 양수 (-,+)
 * 		이항연산자
 * 		***	= 산술연산자 (+, -, *, /, %)==>형변환
 * 			= 비트연산자 (&, |, ^) =>내일만
 * 			= 쉬프트연산자 (<< , >>) =>내일만
 * 		***	= 비교연산자 (==, !=, <, >, <=, >=) ==> 결과값(boolean) =>조건문
 * 		***	= 논리연산자 (&&, ||) ==> 효율적인 연산
 * 		***	= 대입연산자 =, +=, -=, *=, /=, %=, &=, \=, ^=
 * 					 -----------
 * 		삼항연산자
 * 			(조건)?값1:값2 ==> 페이징
 * 			if()
 * 			{
 * 			}
 * 			else()
 * 			{
 * 			}
 * 
 */
public class 연산자총정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
