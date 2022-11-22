/*
 * 	1. 컴퓨터 가위바위보
 * -----------------계속 진행 ==>q/Q 종료
 */
import java.util.Scanner;
public class 반복제어문_3 {
	//종료 => break, 잘못된 입력 (경고)==> continue
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int win=0, lose=0, draw=0;
		int count=0; //게임 횟수
		Scanner scan=new Scanner(System.in);
		System.out.println(scan);
		
		while(true)
		{
			//난수 발생 ==> 게임 시점 ==>0(가위) 1(바위) 2(보)
			int com=(int)(Math.random()*3); //0~2
			System.out.print("가위(0), 바위(1), 보(2):");
			int user=scan.nextInt();
			if(user<0 || user>2)//잘못된 입력
			{
				System.out.println("가위(0), 바위(1), 보(2)를 입력하세요");
				continue; // 처음부터 다시 실행 ==> while문의 조건문으로 이동
			}
			count++; //게임 횟수
			//결과값 출력
			if(com==0)
				System.out.println("컴퓨터:가위");
			else if(com==1)
				System.out.println("컴퓨터:바위");
			else if(com==2)
				System.out.println("컴퓨터:보");
			if(user==0)
				System.out.println("사용자:가위");
			else if(user==1)
				System.out.println("사용자:바위");
			else if(user==2)
				System.out.println("사용자:보");
			
			//확인
			/*
			 * 	com			user		com-user
			 * 	 0(가위)		0(가위)		0(d)
			 * 				1(바위)		-1(u)
			 * 				2(보)		-2(c)
			 *  com			user
			 * 	 1(바위)		0(가위)		1(c)
			 * 				1(바위)		0(d)
			 * 				2(보)		-1(u)
			 *  com			user
			 * 	 2(보)		0(가위)		2(u)
			 * 				1(바위)		1(c)
			 * 				2(보)		0(d)
			 * ------------------------------------>(u) -1,2
			 * ------------------------------------>(c) -2,1
			 */
			switch(com-user)
			{
			case -1: case 2:
				System.out.println("USER WIN");
				win++; //이긴 횟수
				break;
			case -2: case 1:
				System.out.println("COM WIN");
				lose++; //진 횟수
				break;
			case 0:
				System.out.println("DRAW");
				draw++; //비긴 횟수
			}
			//종료 확인
			System.out.println("게임을 종료할까요?(Y/N)");
			char c=scan.next().charAt(0); //scanner로 문자 한 개 받기
			if(c=='Y' || c=='y')
			{
				System.out.println("GAME OVER");
				break; //while 종료
			}
				
		}
		//게임 종료 여부 확인
		System.out.printf("%d전 %d승 %d무 %d패\n",count,win,draw,lose);
	}
}


