import java.util.Arrays;

/*
 * 7. 임의의 문자 5개를 저장하고 정렬해서 출력하시오 

 */
public class 문제_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] arr=new char[5];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(char)((Math.random()*26)+65);
		}
		System.out.print("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("오름차순 정렬 후 : ");
		System.out.println(Arrays.toString(arr));
		
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					char temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.print("내림차순 정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	}

}
