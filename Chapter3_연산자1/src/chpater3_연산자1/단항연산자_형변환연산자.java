package chpater3_연산자1;
/*
 *  형변환 연산자 : (type)
 *  			------데이터형
 *  			(int), (double), (char)...
 *  			------2byte
 *  
 *  			크기
 *  			byte < char < int < long < double
 *  			-----------------------------------boolean은 형변환 할 수 없다 ==> 사용자 정의 데이터형 (class)
 *  			1) 실수 ==> 정수로 변환
 *  				(int)10.5=>10
 *  			2) 정수 ===> 문자로 변환
 *  				(char)65 ==>'A'
 *  			3) 10 ==> 10.0 ------->자동 형변환이 가능
 *  				(double)10 ==> double d=10; ==> d=10.0
 *  
 *  			4) 10.5+10.5 ==> 21.0
 *  				(int)10.5+(int)10.5 ==> 20
 *  				(int)(10.5+10.5) ==>21
 */
public class 단항연산자_형변환연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수 선언
		int a;
		//난수
		a=(int)(Math.random()*100)+1; //==>데이터 값을 넘겨줄 때 
	//   		-----------------1번 ==>Math.random() =>0.0~0.99*100==>0.0~99.0
	//  ------2번 ==>0~99
	//  						  --3번 ==>1~100사이의 숫자
		System.out.println(a);
		// greaterthan or equal to 0.0 and less than 1.0
		
		char c;
		c=(char)((Math.random()*25)+65);
	//			  --------------------0~24+65=>65~89
		System.out.println(c);
		
		char d= 'A';
		char d1=(char)(d+32);
		System.out.println(d1);
		
		// 자동 형변환
		// 다른 데이터형에 값을 대입
		int i='A'; // 'A'=>65
		long l=100; //long<-int (int는 long 변경) ==> l=100L
		int i2=(int)10.5;
		/*
		 * 변수=값
		 * --  --
		 * 큰  작은 값 ==> 자동 변환
		 * 
		 * 변수=값	
		 * --  --
		 * 작은 큰 값 ==> 자동 변환이 불가능 (강제변환)
		 * 
		 * 프로그램에서 피료시에 의해서 데이터형ㄹ 변경 해서 사용할 수 있다
		 * ====================================================
		 * 형변환 : 외부에서 데이터 가지고 올 때 (파일, 오라클, 라이브러리)
		 * int a = 'A'; ==> int a=65;
		 */
		int m=10;
		int n=3;
		System.out.println(m/n);//정수/정수=정수(실수x)
		System.out.println(m/(double)n);
		System.out.printf("%.2f",m/(double)n);
		
		// 음수/양수 (-/+)
		int k=10;
		System.out.println(-k); //.(주소 접근

	}

}
