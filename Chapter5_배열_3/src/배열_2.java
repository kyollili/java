import java.util.Arrays;

// 1~100 사이의 정수를 10개 저장 후 최대값, 최소값을 구하고 차를 출력(최대값-최소값)
public class 배열_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[10]; //1. 배열 선언
		for(int i=0;i<arr.length;i++)//2. 배열에 값 대입
		{
			arr[i]=(int)(Math.random()*100)+1;
		}
		//출력
		System.out.println(Arrays.toString(arr));
		// 최대값, 최소값
		// 최대값 => 범위에서 가장 낮은 값 선택해서 비교
		int max=1; //arr[0]
		// 최소값 => 범위에서 가장 큰 값 선택해서 비교
		int min=100; //arr[1]
		
		for(int i:arr)
		{
			if(max<i)
				max=i;
			else if(min>i)
				min=i;
		}
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				index=i;
				break;
			}
		}
		int index1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==min)
			{
				index1=i;
				break;
			}
		}
		/*
		 * int index=0,index1=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==max)
			{
				index=i;
			}
			else if(arr[i]==min)
			{
				index=i;
			}
		}							======> 해도 가능하지만 이 경우 배열 개수만큼 무조건 다 돌기 때문에 배열 개수가 늘어나면 느려짐 => 따로 처리하는 것이 더 빠르다
		 */
		System.out.println("max="+max+", 저장 위치는 "+(index+1)+"입니다");
		System.out.println("min="+min+", 저장 위치는 "+(index1+1)+"입니다");
		System.out.println("max-min="+(max-min));
		
	}

}
