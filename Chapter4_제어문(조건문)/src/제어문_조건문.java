/*
 * 	======> 1. 데이터 묶기 =>배열
 * 			2. 명령문 묶기 => 메소드
 * 			3. 전체 묶기	=> 클래스
 * 	자바 프로그램
 * 		= 평문
 * 		= 조건문
 * 		= 반복문
 * -----------------------
 * 	제어문 (프로그램 흐름 제어)
 * 	1. 제어문 종류
 * 		1) 조건문
 * 			= 단일 조건문 : 조건이 true일 경우에만 수행
 * 			= 선택 조건문 : 조건이 true, false일 경우 처리하는 문장 따로 만들어서 처리
 * 			= 다중 조건문 : 조건이 여러 개일 경우에 처리하는 문장
 * 		2) 선택문 : 게임(keyboard), 네트워크
 * 			= switch(값)
 * 		3) 반복문
 * 			= for : 반복 횟수가 지정된 경우
 * 			= while : 반복 횟수가 없는 경우 (무한루프) => 선조건
 * 			= dp~while : 한 번 이상 수행해야 되는 경우 => 후조건
 * 		4) 반복제어문
 * 			break ==> 반복 중지
 * 			continue ==> 특정 부분을 제외할 때 사용
 * 		-----------------------------------------------
 * 		제어문에 대한 형식
 * 		= 조건문
 * 			1) 단일 조건문 	
 * 				if(조건) ======> 부정연산자, 비교연산자, 논리연산자 중에 1개를 선택(true/false)
 * 					수행문장 (조건이 true일 경우에만 수행하는 문장)
 * 
 * 		문장 수행
 * 		
 * 		==> if (조건)
 * 			{	
 * 				수행문장 1
 * 				수행문장 2 ===> 무조건 수행하는 문장 (if문 소속문장이 아니다)
 *          }
 *             --------------> 조건 true ==> 수행문장 1, 수행문장 2
 *             --------------> 조건 false ==> 수행문장이 없다 
 *             
 *             기본은 if(){}
 *             
 *             가위바위보 = 컴퓨터 
 *             ===============
 *               컴퓨터   플레이어 
 *                가위    가위(0)
 *                       바위(1)
 *                       보(2)
 *                바위    가위
 *                       바위 
 *                       보
 *                보     가위
 *                      바위
 *                      보   ===> 9
 */
import java.util.Scanner;
public class 제어문_조건문 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        int com=(int)(Math.random()*3); //0~2
        Scanner scan=new Scanner(System.in);
        System.out.print("가위(0),바위(1),보(2):");
        int user=scan.nextInt();
        
        if(com==0)
        	System.out.println("컴퓨터:가위");
        if(com==1)
        	System.out.println("컴퓨터:바위");
        if(com==2)
        	System.out.println("컴퓨터:보");
        
        if(user==0)
        	System.out.println("Player:가위");
        if(user==1)
        	System.out.println("Player:바위");
        if(user==2)
        	System.out.println("Player:보");
	}

}
