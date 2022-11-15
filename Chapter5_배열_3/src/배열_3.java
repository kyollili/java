import java.util.Arrays;

public class 배열_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] lotto=new int[6];
		for(int i=0;i<lotto.length;i++)
		{
			lotto[i]=(int)(Math.random()*45)+1; //1~45
			for(int j=0;j<i;j++) // j<i로 맨 처음 발생된 난수는 제외하고 중복 비교
			{
				if(lotto[i]==lotto[j])
				{
					i--; //저장하지 않는다 -> --로 저장공간 없애버림
					break; // => 저장하지 않고 다시 일차for문으로 돌아가서 난수 발생 -> 중복 없음
				}
			}
		}
		
		System.out.println(Arrays.toString(lotto));
	}

}
