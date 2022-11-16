/*
 * 2진법 : 0,1
 * 8진법 : 012,011
 * 16진법 : 0x~~
 * 
 * 165
 *  128	64	32	16	8	4	2	1
 *   1		 1			1		1 ==>10100101
 *  
 *  10100101(2)
 *       ---
 *        5
 *    ---
 *     4
 *  --
 *   2===============================>0245
 *   
 *  10100101(2)
 *      ----
 *       5
 *  ----
 *  10->a=============================>0xa5
 *  
 *  음수표현 ==>1~~
 *  10
 *   2진법 :		 00001010
 *   	1의 보수 : 11110101
 *   	2의 보수 : 	   +1
 *   			-----------
 *   			 11110110
 *   -----------------------------------정보처리, 코테
 *   형변환 : int =>double
 *   		double=>int
 *   		char =>int, double
 *   		=>자동 형변환, 강제 형변환 (데이터형, 클래스)
 *   		---------------------------------------
 *   		int + double==>double+double=double 자동형변환
 *   			=> 연산시에는 항상 큰 데이터형으로 변경되어 연산됨
 *   		
 *   		char + int => int + int = int
 *   		---------------------------------------------
 *   		변수에 값을 입력할 때
 *   		int a = 'A'
 *   				----int로 변환 (65) ==> a=65
 *   		변수 = 값
 *   		---크거나 같다
 *   
 *   		int a = (int)10.5-->오류
 *   				 ----double
 *   		double d=10; ==>d=10.0
 *   		double d='A' ==> d=65.0 ==>자동으로 변환
 *   		----------------------------------------------
 *   		byte + char = int
 *   		byte + byte = int
 *   		int 이하 데이터형이 연산될 시 -> int로 변환
 */
public class 진법출력2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Integer.toBinaryString(165));
		System.out.println(Integer.toOctalString(165));
		System.out.println(Integer.toHexString(165));
		System.out.println(~165);//165의 음수표현
		
		byte b1 = 10;
		byte b2 = 20;
		//byte b3 = b1+b2; ->오류
		int b3 = b1+b2; //int, long, double, float 가능
	}

}
