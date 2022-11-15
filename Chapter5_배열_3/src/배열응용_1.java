import java.util.Arrays;

// 5개의 정수를 저장 후 총합과 평균을 구해서 출력
// 응용 ==> 3명의 학생 국어, 영어, 수학 점수 입력 => 총점, 평균, 학점 구하고 => 등수 출력
// 숫자야구게임

public class 배열응용_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] score=new int[5]; //선언
		for(int i=0;i<score.length;i++) //필요한 값 저장
		{
			score[i]=(int)(Math.random()*71)+30; //30~100
		}
		System.out.println(Arrays.toString(score));
		int sum=0;
		for(int i:score)
		{
			sum+=i;
		}
		System.out.println("sum="+sum);
		System.out.printf("avg=%.2f\n",sum/(double)score.length);
	}

}
