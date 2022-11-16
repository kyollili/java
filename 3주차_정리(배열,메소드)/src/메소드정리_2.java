/*
 * 슷자야구게임
 * 	1) 난수 발생 (중복 없이)
 * 	2) 사용자 입력
 * 	3) 비교
 * 	4) 힌트
 * 	5) 종료여부 확인
 * ---------------->5개 기능
 */
import java.util.Arrays;
import java.util.Scanner;
public class 메소드정리_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 난수 발생
		int[] com=new int[3]; //난수 저장
		int[] user=new int[3]; // 사용자 입력값 저장
		/// ====>1 개의 기능(메소드 처리)
		for(int i=0;i<3;i++)
		{
			com[i]=(int)(Math.random()*9)+1; //1~9사이의 난수 발생 => 중복 없이
			for(int j=0;j<i;j++) //첫번째 난수는 중복 비교 제외
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		//확인
		System.out.println(Arrays.toString(com));
		//2. 사용자 입력 유도
		Scanner scan=new Scanner(System.in);
		while(true) //무한루프 => 횟수 지정 안됨
		{
			//사용자 입력 유도
			System.out.print("세 자리 정수 입력:");
			//입력한 정수값을 받는다
			int input=scan.nextInt();
			
			//오류 처리 ==> 1. 세자리 정수를 입력하지 않은 경우
			if(input<100 || input>999)
			{
				System.out.println("세 자리 정수를 입력하세요");
				continue; //while 처음으로 다시 돌아간다
			}
			//비교하기 위해서 배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//오류처리 ==>1. 같은 정수 입력여부 확인
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;//처음 입력으로 다시 돌아간다
			}
			//		==>2. 0 입력 여부 확인
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			// 웹 => 유효성 검사
			//3. 비교
			//같은 자리에 숫자가 동일할 경우 ==>S
			//다른 자리에 같은 숫자 ==>B
			int s=0,b=0;
			for(int i=0;i<3;i++)//com ==> 0일때 user ==> 0,1,2
								//com ==> 1일때 user ==> 0,1,2
								//com ==> 2일때 user ==> 0,1,2
			{
				for(int j=0;j<3;j++)//user
				{
					if(com[i]==user[j]) //9번 검색 ==> 같은 수 있다면
					{
						if(i==j) //같은 자리에 존재
							s++;
						else // 다른 자리에 존재
							b++;
					}
				}
			}
			//4.힌트
			System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			//5.종료여부 확인
			if(s==3)
			{
				System.out.println("WIN");
				break;
			}
		}
	}

}
