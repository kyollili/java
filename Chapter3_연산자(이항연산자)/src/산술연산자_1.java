/*
 *  이항연산자 (피연산자 2개인 경우)
 *  --------------------------
 *  	= 산술연산자 ( +, -, *, /, %) ==>page97
 *  		우선순위 : *, /, % ==> +, - 보다 우선순위 연산이 된댜
 *  		
 *  		주의점 : 1. 형변환 (자동 형변환) => 데이터형이 다른 경우 큰 데이터형으로 변경
 *  				int + char (int>char)
 *  					  ---->int로 변경
 *  				---------------------------
 *  				int + int = int
 *  				예)10+'A'
 *  					 ----->65로 변경
 *  				---------------------------
 *  					10+65=75
 *  				double + int (double>int)
 *  						------>double로 변경
 *  				----------------------------
 *  				double + double = double  **연산은 같은 데이터형만 가능하다
 *  				
 *  				***필요시 (int)double + int = int ==> 강제 형변환
 *  				*** int 이하 (byte, short, char)는 연산처리시에 결과값이 int
 *  					예)  byte + byte = int
 *  						char + char = int
 *  						byte + char = int
 *  						short + char + byte = int
 *  				-----------------------------
 *  				2. / 나누기 연산
 *  					1) 정수/정수 = 정수 10/3=3 ==> 소수점 이하를 지운다
 *  					2) 0으로 나누면 오류가 발생한다 ==> 오류체크 (예외처리)
 *  
 *  				3. % 나누고 나머지  ==>화폐 매수 구하기, 배수, 달력(요일 구하기, 윤년)
 *  					10%3 ==>1
 *  					부호 (-,+) ==> 결과값은 항상 왼쪽편 부호가 남는다
 *  					10%3=1   /   10%-3=1
 *						-10%3=-1   /   -10%-3=-1
 *						
 *		= 비트연산자 (&, |, ^)
 *		------------------------------------
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
 *		= 쉬프트 연산자 (비트 이동 연산자) <<(왼쪽 이동) , >>(오른쪽 이동)
 *		10<<3 ==> 80
 *		10*2^3 = 80
 *		X<<Y ==> X*2^Y
 *		------------------------------------
 *		_ _ _ 1 0 1 0 ==> 1 0 1 0 _ _ _ ==> 1 0 1 0 0 0 0 ==> 80
 *
 *		10>>3 ==> 1 ==> 1010 뒤에 비트 3개를 제거한다 ==> 1(010) ==> 1
 *		10/2^3 ==>1
 *		X>>Y ==> X/2^Y
 *
 *		12>>2 ==> 1100 뒤에 비트 2개 제거 ==> 11(00) ==> 3
 *		12/2^2 = 3
 */
// 두 개의 정수를 받아서 +, -, /, *, % 연산 후 출력
import java.util.Scanner;
public class 산술연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		Scanner scan=new Scanner(System.in);
		System.out.print("두 개의 정수를 입력(10 20):");
		a=scan.nextInt(); //입력된 정수값을 가지고 온다 ==> a라는 메모리에 저장
		b=scan.nextInt(); //b라는 메모리 공간에 저장
		//출력
		System.out.println("a="+a);
		System.out.println("b="+b);
		
		//연산처리
		System.out.printf("%d+%d=%d\n",a,b,a+b);
		//				  ------------출력 형식
		//							  ---------값을 대입
		// System.out.println(a+"+"+b+"="+(a+b));
		System.out.printf("%d-%d=%d\n",a,b,a-b);
		System.out.printf("%d*%d=%d\n",a,b,a*b);
		System.out.printf("%d/%d=%d\n",a,b,a/b);
		//System.out.printf("%d/%d=%.2f\n",a,b,a/b);//.2f는 소수점 이하 두 자리 표시해달라 했는데 입력된 값이 a/b로 정수라 오류가 뜸
		try
		{
			double d=a/(double)b;
			System.out.printf("%d/%d=%.2f\n",a,b,a/(double)b);//따라서 위에서 생긴 오류를 해결하기 위해서 a/(double)b로 강제 형변환
		}catch(Exception e)
		{
			System.out.println("0으로 나눌 수 없다");
		}
		 
		System.out.printf("%d%%%d=%d\n",a,b,a%b);//%기호를 사용중에 있 으니까 중간 연산자를 %% 두개로 표시

	}

}
