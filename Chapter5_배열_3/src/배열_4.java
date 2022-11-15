import java.util.Arrays;
import java.util.Scanner;
/*
 * 1. 데이터 저장 : 변수 , 배열
 * 2. 초기화
 * 3. 제어 ( 사용자 요청에 따라 ) 
 * 4. 제어된 결과값 출력
 * 
 * 데이터 저장 == 데이터 가공 == 출력 (도스, 브라우저, 모바일)
 * 				  |
 * 				메소드화			
 */
// => O X ==> 10개 저장 , 난수로, 개수 확인
public class 배열_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] munje=new char[10];
		char[] user=new char[10];
		for(int i=0;i<munje.length;i++)
		{
			int a=(int)(Math.random()*2);
			if(a==0)
				munje[i]='O';
			else
				munje[i]='X';	
		}
		Scanner scan=new Scanner(System.in);
		for(int i=0;i<user.length;i++)
		{
			System.out.print((i+1)+"번째 O,X를 입력:");
			char dap=scan.next().charAt(0);
			if(!(dap=='O' || dap=='X'))
			{
				System.out.println("잘못된 입력입니다");
				i--; //1번째 잘못 입력시 다시 1번쨰 입력 할 수 있게 해줌
				continue; //증가식으로 올라간다
			}
			user[i]=dap;
		}
		System.out.println(Arrays.toString(munje));
		System.out.println(Arrays.toString(user));
		//확인
		int count=0;
		for(int i=0;i<user.length;i++)
		{
			if(munje[i]==user[i])
				count++;
		}
		System.out.println("정답:"+count+"개 입니다");
	}

}
