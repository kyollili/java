/*
 * 
 * 1) 변수 설정		2) 변수 사용법		3) 범위
 * ----------지역변수(멤버변수=전역변수), 매개변수(사용자의 입력값을 받는 경우)
 * 				  -------객체변수, 공유변수
 * 1) 연산자		2) 처리방법(결과값 예측)		3) 응용=>사용처
 * 											---------조건(부정,논리,비교),산술연산자,대입연산자
 * 1) 제어문의 종류	2) 형식	3) 동작순서		4)응용(배열)	===>코테(80%)
 * 
 * 1. 제어문의 종류
 * 		= 조건문(조건문, 선택문)
 * 			=> 단일 조건문 (독립적으로 수행)
 * 				형식) if(조건문)
 * 					{
 * 						조건이 true일때 수행하는 문장
 * 					}
 * 			=> 선택 조건문 : true,false를 나눠서 처리 ==> 삼항연산자
 * 				형식) if(조건문)
 * 					{
 * 						조건이 true일때
 * 					}
 * 					else
 * 					{ 	
 * 						조건이 false일때
 * 					}
 * 			=> 다중 조건문 : 해당 조건에 맞는 조건문만 실행(1개만 실행) ==> switch~case
 * 				형식) if(조건문)
 * 					{
 * 						조건 true ===> 수행문장 ==> 종료
 * 						조건 false
 * 							↓
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건 true ===> 수행문장 ==> 종료
 * 						조건 false
 * 							↓
 * 					}
 * 					else if(조건문)
 * 					{
 * 						조건 true ===> 수행문장 ==> 종료
 * 						조건 false
 * 							↓
 * 					}
 * 					else => 해당 조건이 없는 경우 처리 (생략이 가능)
 * 					{
 * 						해당 조건이 없는 경우 => 경고
 * 					}
 * 			=> 선택문 : 1개만 실행이 가능하게 만든다
 * 				----다중조건문(범위 지정이 가능), 한개 데이터값
 * 				switch(사용자가 보내준 값) ==>정수, 문자, 문자열
 * 				{
 * 					case 정수:
 * 						location.href="/movie/list";
 * 						break;
 * 					case 정수:
 * 						location.href="/movie/detail";
 * 						break;
 * 					default:
 * 						location.href="/main";
 * 				}
 * 
 * 		= 반복문
 * 			=> for  ======> 반복 횟수를 알고 있는 경우 => 이중 for
 * 				형식)
 * 						1	2		4
 * 					for(초기값;범위;ㅣ증감값)
 * 						반복실행문장3
 * 			=> while =====> 반복 횟수를 모르는 경우 => 무한루프
 * 				형식)
 * 					초기값			======>1
 * 					while(조건식)	======>2 ==>false 종료 ==> 수행이 안될 수도 있음
 * 					{
 * 									| true
 * 						반복수행문장	======>3
 * 						증감식		======>4 ===> 증가된 값 ====> 조건식
 * 					}
 * 			=> do~while ==> 후조건( -> 반드시 한 번 이상 수행이 가능) ==> 웹에서 거의 사용빈도가 없다
 * 				
 * 		= 반복제어문
 * 			=> 반복 중단 : break
 * 			=> 반복에서 특정 부분을 제외 : continue
 */
public class 이중_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~10 출력
		System.out.println("1 2 3 4 5 6 7 8 9 10");
		System.out.println("=== for문 ===");
		for(int i=1;i<=10;i++)
			System.out.print(i+" ");
		System.out.println("\n=== while문 ===");
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
		System.out.println("\n=== do~while문 ===");
		i=1;
		do {
			System.out.print(i+" ");
			i++;
		}while(i<=10);
	}

}
