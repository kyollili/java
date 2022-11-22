/*
 *  1) 변수
 *  	기본형, 배열
 *  2) 메소드
 *  	기능=>연산자/제어문
 *  	메소드
 *  	1) 재사용성 => System.out.println()
 *  				scan.nextInt()
 *  				Math.random()
 *  	2) 중복 코드 제거
 *  	3) 구조화 된 프로그램
 *  	4) 다른 클래스와 통신 : 메세지
 *  
 *  	구성요소
 *  	처리결과값(리턴값)		사용자 요청값(매개변수)
 *  	예) 정수 두 개를 보내주고 ==> 더한 값을 달라
 *  		-------매개변수	  --------리턴값
 *  
 *  	메소드 제작
 *  	---------------------------------------
 *  		결과값(리턴형)			매개변수
 *  	---------------------------------------
 *  			O				   O 			===>String substring(int s)
 *  	---------------------------------------
 *  			O				   X			===>String trim()
 *  	---------------------------------------
 *  			X				   O			===>System.out.println("A")
 *  												void println(String a)
 *  	---------------------------------------
 *  			X				   X			===>System.out.println();
 *  	---------------------------------------
 *  	호출
 *  
 *  	기존에 있는 프로그램을 기능별로 나눠서 작업 (분업화)
 *  	**메소드는 반드시 한 개의 기능만 수행할 수 있게 만든다 (재사용이 편하다)
 *  		입력기능
 *  		처리기능 ==> 세분화
 *  		출력기능
 *  
 *  	메소드
 *  	= 선언부(원형)
 *  		리턴형(결과값) 메소드형(매개변수)
 *  	= 구현부
 *  		리턴형(결과값) 메소드형(매개변수)
 *  		{
 *  			//구현
 *  		}
 *  	= 더하기 기능
 *  		int add(int a,int b)
 *  		----long, double ==> 권장 : 가급적이면 동일하게
 *  		{
 *  			//맨 마지막 줄에
 *  			return a+b; // 메소드 종료 시점
 *  		}
 *  		
 *  		void insert()
 *  		-----메소드 자체 처리(데이터베이스 ==> insert,update,delete)
 *  		{
 *  			return; // 생략 가능
 *  		}
 *  	
 *  		1) 구성요소
 *  			1. 매개변수 => 사용자가 요청한 값
 *  						= 로그인 요청(id, pwd)
 *  						= 아이디 중복 체크 (id)
 *  						***여러개 => ,로 구분
 *  							---3개 이상일 때는 배열, 클리스를 이용해서 전송
 *  			2. 메소드명 => 변수(식별자)
 *  						1) 알파벳, 한글(알파벳->대소문자 구분)
 *  						2) 숫자 (맨 앞 사용x)
 *  						3) 특수문자 _,$만 사용 가능
 *  						4) 키워드는 사용 금지
 *  						약속사항 ===> 소문자로 시작
 *  									단어가 2개 이상인 경우 두 번째 단어 첫글자는 대문자
 *  									getFileName , nextInt()
 *  			3. 리턴형(결과값) => 사용자 요청을 처리한 결과값
 *  							메소드
 *  								=> 자체 처리
 *  								=> 결과값을 넘겨준다 => 로그인 여부 확인 => 해당 데이터형을 설정
 *  								  ------ 반드시 1개만 설정이 가능 / 결과값이 여러개일경우 배열이나 클래스 사용
 *  			4. 매개변수
 *  				-----1) 사용자가 입력(명시적인 초기화, Scanner, random())
 *  				-----2) 반복 제어 ==> 틀린문장
 *  
 */
// ==> 년도 , 월 , 일을 입력
import java.util.Scanner;
public class 메소드_1 {
	/*
	 * int userInput()
	 * {
	 * }
	 * ========================> 메소드_1 a=new 메소드_1();
	 * 							a.userInput()
	 * Static int userInput()
	 * {
	 * }
	 * ==> 자동 메모리 할당
	 */
	static int userInput(String msg) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.print(msg);
		int value=scan.nextInt();
		
		return value;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Scanner scan=new Scanner(System.in);
		System.out.print("년도 입력:");
		int year=scan.nextInt();
		
		System.out.print("월 입력:");
		int month=scan.nextInt();
		
		System.out.print("일 입력:");
		int day=scan.nextInt();
		
		System.out.println(year+"년도 "+month+"월 "+day+"일");*/
		int year=userInput("년도 입력:");
		int month=userInput("월 입력:");
		int day=userInput("일 입력:");
	}

}
