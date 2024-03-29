import java.util.Arrays;

/*
 * 	버블정렬
 * 
 *  20 30 10 50 40
 *  -- --
 *  20 30
 *     -- --
 *     10 30
 *     	  -- --
 *     	  30 50
 *     		 -- --
 *     		 40 50
 *  --------------------1round (for문 1회 실행) : 0-4
 *   20 10 30 40 50
 *   -- --
 *   10 20
 *   	-- --
 *   	20 30
 *   	   -- --
 *   	   30 40
 *   -------------------2round (for문 2회 실행) : 1-3
 *   10 20 30 40 50
 *   -- --
 *   10 20
 *   	-- --
 *   	20 30
 *   -------------------3round (for문 3회 실행) : 2-2
 *   10 20 30 40 50
 *   -- --
 *   10 20
 *   -------------------4round (for문 4회 실행) : 3-1
 *   										   i j
 *   										   i+j=4
 *   
 *   		========================================>뒤에서부터 고정
 */
public class 배열응용_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[5];
		// 초기화
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=(int)(Math.random()*100)+1;	
		}
		//출력
		System.out.print("정렬 전 : ");
		System.out.println(Arrays.toString(arr));
		//버블 정렬 시작
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if(arr[j]>arr[j+1]) //->올림차순 // if(arr[j]<arr[j+1]) -> 내림차순
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.print("정렬 후 : ");
		System.out.println(Arrays.toString(arr));
	}

}
