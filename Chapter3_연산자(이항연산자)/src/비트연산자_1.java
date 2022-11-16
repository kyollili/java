/*
 * 		& (*) , | (+), ^
 * 
 * 		==>2진법으로 변환 후 연산 ==> 정수는 32bit
 * 		----------------------------------
 * 		------------------------------------
 *				&(*)	|(+)	^(다른 비트일 경우 1)
 *		------------------------------------
 *		0 0		 0		  0		 0
 *		------------------------------------
 *		0 1		 0		  1		 1
 *		-------------------------------------
 *		1 0		 0		  1		 1
 *		-------------------------------------
 *		1 1		 1		  1		 0
 *		-------------------------------------
 *
 *		25&10
 *		11001
 *		01010
 *		------&
 *		01000 ==>8
 *
 *		25|10
 *		11001
 *		01010
 *		-------|
 *		11011 ==>27
 *
 *		25^10
 *		11001
 *		01010
 *		-------^
 *		10011  ==>19
 *
 *		35&26
 *		100011
 *		011010
 *		--------&
 *		000010  ==>2
 *
 *		35|26
 *		100011
 *		011010
 *		--------|
 *		111011  ==>59
 *
 *		35^26
 *		100011
 *		011010
 *		---------^
 *		111001  ==>57
 */
public class 비트연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(25&10);
		System.out.println(25|10);
		System.out.println(25^10);
		
		System.out.println(35&26);
		System.out.println(35|26);
		System.out.println(35^26);
		
	}

}
