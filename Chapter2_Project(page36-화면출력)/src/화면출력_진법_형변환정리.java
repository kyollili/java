/*
 * =>page41~84
 * -----------------------
 * 화면 출력 / 키보드 입력값 / 형변환
 * -------
 * System.out.println() =>가장 많이 사용되는 화면 출력 기능 (출력을 하고 다음 줄로 이동해서 출력)
 * System.out.print() => 다음 줄로 이동하지 않고 옆으로 출력
 * System.out.printf() => 출력 형식을 만들어서 출력 (서식이 있는 출력)
 * 		=> 데이터형 출력 종류 (%d =>정수출력, %f=>실수, %c=>문자, %s=>문자열)
 * 		=> %5d ==> 출력 시 5칸 확보
 * 					300
 * 					()()(3)(0)(0) => 오른쪽 정렬
 * 		   %-5d ==> (3)(0)(0)()() => 왼쪽 정렬
 * 화면 입력
 *  Scanner => 사용방법 (page40) ==> 도스에서만 사용 (문법)
 *   1) 클래스 ==> 메모리 저장
 *   	Scanner scan=new Scanner(System.in) ==> System.in(키보드 입력값)
 *   				 --- 클래스를 메모리에 저장시에 반드시 사용 (동적메모리 할당)
 *   					 malloc() ==> new
 *   					 free() ==> delete : GC
 *   2) 클래스가 가지고 있는 기능을 활용
 *   	Scanner가 가지고 있는 기능
 *   	정수값 받을 경우 : nextInt() (메소드 : 한 가지 기능을 가지고 있다)
 *   	문자열 받는 경우 : next()
 *   	논리형 받기 : nextBoolean()
 *   	실수형 받기 : nextDouble()
 *   ------------------------------------java.io (BufferedReader) ==> 예외처리
 * 진법
 * 	표현법 : 8진법(0~), 16진법(0x~)
 * 	=> 2진법 : 0,1
 * 	   8진법 : 0~7
 * 	   16진법 : 0~15 => 10(a)~15(f)  => color 지정  0xFF ==>255(white)
 * 
 * *****형변환(UpCasting, DouwnCasting)
 * 			----------	-------------
 * 			데이터형을 크게  데이터형을 작게-> int->char
 * 			1) UpCasting (자동 형 변환)
 * 				변수 초기값
 * 				double d = 10 =>10을 실수로 변경해서 저장 10.0
 * 						  ---int d=10.0
 * 				int a='A';
 * 					  ---int로 변경한 다음 대입==> int a =65
 * 				------------->변수의 데이터형 > =값
 * 				'A'
 * 				 => char, int, long, float, double : 가급적같은 데이터형으로 받는 것이 좋다
 * 					
 * 					10.5f
 * 					=> float, double
 * 						10.5f	10.5
 * 					10.5
 * 					=> double
 * 						10.5
 * 					10
 * 					-> int, float, long, double
 * 						10	10.0f	10L	10.0
 * 					65
 * 					=> int, char(예외)
 * 						65	'A'
 * 				연산자 
 * 		= 자동 형변환
 * 		= 강제 형변환
 * 			-----------int -> double
 */
public class 화면출력_진법_형변환정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=(int)10.5; // int로 강제 형변환 ->소수점을 지운다 ==>10
		a = (int)10.5F; //10
		System.out.println(a);
		a = (int)10L; //10----------->오버플로우
		System.out.println(a);
		byte b=(byte)300;//->오버플로우
		System.out.println(b);
		

	}

}
