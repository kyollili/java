/*
 * 	다중 조건문 (해당 조건문 1개만 수행) =>p.141
 * 	1) 형식
 * 		if(조건문)
 * 		{
 * 			조건이 true일 때만 수행하는 문장 ↗ 종료
 * 				
 * 				↓ false
 * 		}
 * 		else if(조건문)
 * 		{
 * 			조건이 true일 때만 수행하는 문장 ↗ 종료
 * 				
 * 				↓ false
 * 		}
 * 		...
 * 		...
 * 		else
 * 		{
 * 			//생략이 가능
 * 			해당 조건이 없는 모든 내용을 수행
 * 		}
 * 
 * 		1~100까지의 정수 중 3의 배수, 5의 배수, 7의 배수 출력
 * 						---------------------------단일 조건문 => 중복적으로 처리해야 하는 것이 있기 떄문에 다중 말고 단일
 * 
 */
public class 제어문_다중조건문1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kor=(int)(Math.random()*51)+50; //0~100 
		// 			-----------------------0.0~100.0 ==> 0~100
		int eng=(int)(Math.random()*51)+50;
		int math=(int)(Math.random()*51)+50;
		
		int avg=(kor+eng+math)/3;
		
		char hakjum='A';
		if(avg>=90)
			hakjum = 'A';
		else if(avg>=80)
			hakjum='B';
		else if(avg>=70)
			hakjum='C';
		else if(avg>=60)
			hakjum='D';
		else
			hakjum='F';
		// if 여러 개 사용 ==> 여러번 수행(단일조건문) / 한 번만 수행(다중 조건문)
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("학점:"+hakjum);
	}

}
