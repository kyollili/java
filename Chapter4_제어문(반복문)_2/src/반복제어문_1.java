/*
 * 	반복제어문
 * 		=> 반복문 종료 : break
 * 		=> 특정 부분을 제거 : continue
 * 		***주의점
 * 			break;
 * 			continue; ==> 바로 밑에는 소스 코딩을 할 수가 없다
 * 			
 * 			break ==> 반복문, 선택문에서만 사용이 가능 => 제어문을 종료
 * 			continue ==> 반복문에서만 사요이 가능 => 제외하고 다음 반복문을 수행
 * 
 * 			while()
 * 			{
 * 				break; ==> 중단
 * 			}
 * 
 * 			for()
 * 			{
 * 				break; ==> 중단
 * 			}
 * 
 * 			while(조건식)
 * 			{
 * 				continue; ==> 조건식으로 이동
 * 			}
 * 
 * 			for(초기값;조건식;증가식)
 * 			{
 * 				continue; ==> 증가식으로 이동
 * 			}
 */
//break; 1~100까지 출력 ==> 5까지 출력 후 for 중단
public class 반복제어문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=100;i++)
		{
			if(i==5)
				break;
			System.out.print(i+" ");
		}//5가 된 순간 출력 못하고 종료 => 1~4만 출력
		System.out.println();
		for(int i=1;i<=100;i++)
		{
			System.out.print(i+" ");
			if(i==5)
				break;	
		}//1~5까지 출력 후 종료
		System.out.println();
		int i=1;
		while(i<=100)
		{
			if(i==5)
				break;
			System.out.print(i+" ");
			i++;
		}//1~4만 출력
		System.out.println();
		i=1;
		while(i<=100)
		{
			System.out.print(i+" ");
			if(i==5)
				break;
			i++;
		}//1~5 출력
	}

}
