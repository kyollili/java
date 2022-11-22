/*
 * 1~10 ==> 홀수만 출력
 */
public class 반복문_for3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=10;i+=2)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		int i=1;
		while(i<=10)
		{
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
		for(int k=2;k<=10;k+=2)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		int k=2;
		while(k<=10)
		{
			System.out.print(k+" ");
			k+=2;
		}
	}

}
