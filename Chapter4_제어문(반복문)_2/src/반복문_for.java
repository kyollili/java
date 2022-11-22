/*
 * for===============>p.157
 * ----반복문
 * ----반복 횟수를 알고있는 경우에 주로 사용(Front-End)
 * 		1) 초기값 => 처음 시작값 지정
 * 		2) 조건식 => 범위 (몇 번 수행) 10
 * 		3) 증감식 => i++, i+=2, i+=3...
 * 						--------------복합대입연산자
 * 
 * 	실행 순서
 * 	for(초기값;조건식;증가식)
 * 	{
 * 		실행문장
 * 	}
 * ==========================
 * while : 반복횟수를 모르는 경우
 * 
 * 초기값
 * while(조건식) =========>false면 종료
 * {
 * 		반복실행문장
 * 		증가식		=========>이동(증가한 다음=>조건)
 * }
 */
//1~10 ==>1씩 증가해서 출력 ==>for/while
public class 반복문_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i++)
		{
			System.out.print(i+" ");
		}
		System.out.println(); //다음줄에 출력
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i++;
		}
	}

}
