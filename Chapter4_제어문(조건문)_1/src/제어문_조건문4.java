/*
 * 	1.p.136
 *		if 형식
 * 	2. p.137
 * 		조건식 : 부정연산자, 비교연산자, 논리연산자 (true/false)
 * 	3. p.138
 *  //제어문은 바로 밑에 있는 문장 1개만 수행
 * 		if
 * 		{
 * 			//조건이 true일 때 수행되는 문장
 * 			// 수행 해야하는 문장이 여러 개일 경우에 사용
 * 		}
 * 	4. p.140
 * 		if~else
 * 		형식)
 * 			if(조건)
 * 				조건 true일 때 처리
 * 			else
 * 				조건 false일 때 처리
 * ----------------------------------------------------------
 * 	
 */
import java.util.Scanner;
public class 제어문_조건문4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("==========Menu========");
		System.out.println("1. 로그인");
		System.out.println("2. 회원가입");
		System.out.println("3. 영화목록");
		System.out.println("4. 영화상세보기");
		System.out.println("5. 예매요청");
		System.out.println("6. 종료");
		System.out.println("======================");
		// 단일 조건문, 다중 조건문
		Scanner scan=new Scanner(System.in);
		System.out.print("메뉴 선택(1~6):");
		int menu=scan.nextInt();
		if(menu==1)
			System.out.println("로그인을 요청하셨습니다!!");
		if(menu==2)
			System.out.println("회원가입을 요청하셨습니다!!");
		if(menu==3)
			System.out.println("영화 목록을 요청하셨습니다!!");
		if(menu==4)
			System.out.println("영화 상세 보기를 요청하셨습니다!!");
		if(menu==5)
			System.out.println("영화 예매를 요청하셨습니다!!");
		if(menu==6)
			System.exit(0); //프로그램 종료
	}

}
