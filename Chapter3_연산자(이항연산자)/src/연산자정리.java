/*
 * 	1. 단항연산자
 * 		= 증감연산자 (++,--) : 반복문, 데이터베이스 값을 읽는 경우, 파일 읽기 
 * 			=>한 개를 증가, 한 개를 감소 (정수형, 문자형)
 * 			** 전치 연산자 ++a => 먼저 증가 후에 대입
 * 				int a=10;
 * 				int b=++a;
 * 					++a, b=a 
 * 			** 후치 연산자 a++ => 먼저 대입 후에 증가
 * 				int a=10;
 * 				int b=a++;
 * 					b=a , a++
 * 		= 부정연산자 (!) : 조건문, 예약일이 아닌 경우
 * 			=> boolean에서만 사용이 가능 (true/false)
 * 			=> 좌석 예메 => 영화, (맛집, 도서관),,
 * 
 * 		= 형변환 연산자 : 자동 처리, 필요시 강제 처리(숫자=>정수,문자,실수)
 * 			=> 클래스 형변환(***********)
 * 			=> (데이터형) 값 ===============> 큰데이터형, 작은 데이터형(강제)
 * 		= 음수/양수 (-,+)
 * 	1. 이항연산자
 * 		= 산술연산자 ( +,-,*,/,%) => 웹에서 가장 많이 사용되는 연산자
 * 			=> 다른 데이터형을 묶어서 연산 => 자동 형변환이 된다
 * 				(가장 큰 데이터형으로 변환)
 * 				int+int = int, long + long = long, double + double = double
 * 				int+long => long +long => long
 * 				(int)double + int = int =>강제형변환
 * 			=> / ==> 0으로 나눌 수 없다, 정수/정수=정수 ==> 소수점(정수/실수)
 * 			=> % ==> 결과값이 왼쪽 부호를 따른다
 * 		= 비교연산자 : 조건문, 반복문 => 응용 (제어문), 상황연산자 ==> 결과값이 항상 boolean(true,false)
 * 			==	같다 (정수, 실수, 문자, 논리) => 문자열은 비교가 불가능하다 (equals), 객체비교(instanceof)
 * 			!=	같지않다 (")
 * 			<	작다 (정수, 실수, 문자)
 * 			>	크다 (")
 * 			<=	작거나 같다 (")
 * 			>=	크거나 같다 (")
 * 			
 * 		= 논리연산자 : 조건문, 반복문 (제어문에서 주로 사용한다) ==> 결과값은 무조건 boolean (true/false)
 * 				*** && > || (연산 우선 순위 &&)
 * 					&& (범위 포함) ==> 두 개의 조건이 true일 경우에만 true
 * 					|| (범위 미포함) => 두 개의 조건 중에 한 개 이상 true일 경우에 true
 * 					(조건) && (조건)
 * 					(조건) || (조건)
 * 						==> 효율적인 연산
 * 							(조건) && (조건)
 * 							---false일 경우 뒤에 조건 수행하지 않음 ==> false일 확률이 높은 것을 앞에 배치
 * 							(조건) || (조건)
 * 							-----true일 경우 어차피 결과가 true기 때문에 뒤의 조건 수행하지 않음 ==> true일 확률이 높은 것을 앞에 배치
 * 
 * 		= 대입연산자
 * 			= 대입 (값)
 * 			int a=10;
 * 			+=  ========> a=a+5 =========> a+=5
 * 			-=  ========> a=a-5 =========> a-=5
 * 			*=  ========> a=a*5 =========> a*=5
 * 			/=  ========> a=a/5 =========> a/=5
 * 
 */
// 국어, 영어, 수학 점수를 받아서 총점, 평균을 구한 다음 60 이상 pass, 60 이하 fail
import java.util.Scanner;
public class 연산자정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in); //키보드 입력값을 받을 준비 => 클래스는 메모리에 저장시에 반드시 new
		//=>JVM에서 저장 메모리 크기를 확인 배치 ==> heap (관리는 GC)
		System.out.println("국어,영어,수학 점수 입력(90 90 90):");
		int kor=scan.nextInt();
		int eng=scan.nextInt();
		int math=scan.nextInt();
		
		int total=kor+eng+math;
		double avg=total/3.0;
		
		int temp=(int)avg;
		
		System.out.println("국어점수:"+kor);
		System.out.println("영어점수:"+eng);
		System.out.println("수학점수:"+math);
		System.out.println("총점:"+total);
		System.out.printf("평균:%.2f\n",avg);
		System.out.println(temp>60?"Pass":"Fail");

	}

}
