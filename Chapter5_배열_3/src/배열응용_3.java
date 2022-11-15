//숫자야구게임
/*
 * 세자리 정수 입력 => 같은 숫자 있으면 ball , 같은 자리 같은 숫자면 strike
 * 답 : 761 / 입력된 정수 : 167 => 1s-1b
 * =>3s가 되면 종료
 */
//사용자가 입력
import java.util.Arrays;
import java.util.Scanner;
public class 배열응용_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 1. 난수 => 정수 3개 ==> 중복 없는 난수 ==> int => 3
		 * 2. 사용자 입력
		 * 3. 비교
		 * 4. 힌트
		 * 	s:● 
		 * 	b:○○
		 * 5. 종료 여부 확인
		 */
		//변수 => 난수, 사용자 입력값 -> 변수 두 개 필요
		int[] com=new int[3];//게임에 필요한 난수 저장
		int[] user=new int[3]; // 사용자 입력값 저장
		
		for(int i=0;i<com.length;i++)
		{
			com[i]=(int)(Math.random()*9)+1;//1~9 사이의 난수 발생
			for(int j=0;j<i;j++)
			{
				if(com[i]==com[j])
				{
					i--;
					break;
				}
			}
		}
		
		int count=0;
		//System.out.println(Arrays.toString(com));
		Scanner scan=new Scanner(System.in);
		while(true) //맞출때까지 돌려야하니까 횟수를 모를때 쓰는 while 쓰기
		{
			//사용자 입력
			System.out.print("세 자리 정수를 입력하세요:");
			int input=scan.nextInt();
			//오류처리
			if(input<100 || input>999)
			{
				System.out.println("잘못된 입력입니다");
				continue; //조건식으로 이동 ==> 처음부터 다시 시작
			}
			//배열에 저장
			user[0]=input/100;
			user[1]=(input%100)/10;
			user[2]=input%10;
			
			//오류처리
			//1. 같은 수를 입력x, 0 입력 x
			if(user[0]==user[1] || user[1]==user[2] || user[0]==user[2])
			{
				System.out.println("같은 수는 사용할 수 없습니다");
				continue;
			}
			if(user[0]==0 || user[1]==0 || user[2]==0)
			{
				System.out.println("0은 사용할 수 없습니다");
				continue;
			}
			
			//여기부터 게임 시작
			count++;
			
			int s=0,b=0;
			//비교
			for(int i=0;i<3;i++) //com
			{
				for(int j=0;j<3;j++)//user
				{
					if(com[i]==user[j])
					{
						if(i==j)
							s++;
						else
							b++;
					}
				}
			}
			//System.out.printf("Input Number:%d,Result:%dS-%dB\n",input,s,b);
			System.out.println("============힌트============");
			System.out.print("S:");
			for(int i=0;i<s;i++)
			{
				System.out.print("●");
			}
			System.out.print("\nB:");
			for(int i=0;i<b;i++)
			{
				System.out.print("○");
			}
			System.out.println("\n===========================");
			if(s==3)
			{
				System.out.println("입력횟수:"+count);
				System.out.println("-------------정답-------------");
				break;
				
			}
		}
	}

}
