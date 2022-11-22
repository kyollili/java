//page42~74( 형변환)
/*
 * 진법, 지수 ==>SQL =>임베디드
 * 
 * 1. 변수 설정
 * 2. 연산자 =>3장
 * 3. 제어문 =>4장
 * 4. 메소드 
 * 5. 클래스(객체지향) =>6ㅡ7장
 * 6. 예외처리 => 8장
 * 6. 라이브러리 (컬렉션, 제네릭스) =>11,12장
 * 8. IO => 15장
 * -------------------------------
 * 
 * 자바에서 정수 표현
 * 1) 10진법 : 10,20,30,,,
 * 2) 2진법 : 0,1
 * 3) 8진법 : 0~7===>0~~~
 * 4) 16진법 : 0~9 + 10(A),11(B),12(C),13(D),14(E),15(F)==>0x~~
 * 
 * 27==>2진법
 * 32 16 8 4 2 1
 *     1 1   1 1 ==>11011
 * 11011
 *   ---
 *    3
 * ---
 *  3			=>033
 * 11011
 *  ----
 *   11
 * -
 * 1			=>0x1B
 */
public class 진법출력 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(27));//11011
		System.out.println(Integer.toOctalString(27));//033
		System.out.println(Integer.toHexString(27));//0x1B

	}

}
