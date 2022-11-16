//변수->초기값->변수를 사용하기 전에 처음으로 들어가는 값을 저장(초기화) ==21page
/*
 * 1. 선언과 동시에 초기화
 * int a=10;
 * 2. 선언 후에 나중에 초기화-->입력값을 받아서 저장할 때, 난수 저장시
 * int a;
 * a=100;
 * 
 * 단어
 * =>type->데이터형
 * =>리터럴->실제 값
 * 
 * int a =100
 * 
 * type : int
 * 리터럴 : 100
 * 변수명 : a
 * ------------------
 * 
 */
public class 변수초기화 {
	//변수-->멤버변수, 전역변수 -->자동초기화
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//변수-->지역변수-->반드시 초기화한 후에 사용 가능(출력, 연산처리)
		int a=10;
		int b=20;
		System.out.println("a="+a+",b="+b);
		
		int c=a;//a와b의 값을 교환하고 싶으면 임시변수 c를 선언하고 바꾸기
		a=b;
		b=c;
		System.out.println("a="+a+",b="+b);
	}

}
