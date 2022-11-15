import java.util.Arrays;

/*
 * 6. 0~9사이의 난수를 100개 발생해서 
   빈도를 구해서 출력하시오 

		=======> 같은 용도
		10개(int) 평균(double), 총점(int), 순위(int)
 */
public class 문제_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*9);
		}
		System.out.println(Arrays.toString(arr));
		
		int[] result=new int[10];
		for(int i=0;i<arr.length;i++)
		{
			result[arr[i]]++;
		}
		for(int i=0;i<result.length;i++)
		{
			System.out.println(i+"의 개수 : "+result[i]);
		}
	}

}
