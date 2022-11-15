/*
 * 2. 1월달 사원(1번부터 5번사원)의 실적이 50 45 35 12 70 이다.(실적 0~100)
 *
 * 1) 사번별 실적을 출력하시오.사원(1) 50
 * 2) 1월 실적의 총점과 평균을 출력하시오
 * 3) 실적이 제일 큰 사원의 사번과 실적, 작은 사원의 사번과 실적을 출력하시오.

 */
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {50, 45, 35, 12, 70};
		for(int i=0;i<arr.length;i++)
		{
			System.out.println((i+1)+"번 사원 실적:"+arr[i]);
		}
		int sum=0;
		for(int i:arr)
		{
			sum+=i;
		}
		System.out.println("총점 : "+sum);
		System.out.printf("평균 : %.2f\n",sum/(double)arr.length);
		int max=arr[0],sabun1=0;
		int min=arr[0],sabun2=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				sabun1=i;
				break;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				sabun2=i;
				break;
			}
		}
			System.out.println("최고 : "+(sabun1+1)+"번 사원 ("+max+")");
			System.out.println("최저 : "+(sabun2+1)+"번 사원 ("+min+")");
		
		
		
		
	}

}
