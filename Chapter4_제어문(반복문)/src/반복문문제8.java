/*
 * 8. 3이상 4462 이하에서 짝수인 정수의 합을 구하여라.


 */
public class 반복문문제8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		for(int i=3;i<=4462;i++)
		{
			if(i%2==0)//짝수일때만
				sum+=i; //값을 누적해라
		}
		System.out.println("sum="+sum);
	}

}
