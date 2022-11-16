/*
 * p.163
 * 
 * 2*1=2	----	9*1=9
 * -
 * -
 * -
 * 2*9=18	----	9*9=81
 * 
 * 줄 수 (i) ==>9줄
 * 한 줄에 출력하는 개수 ==> 8개
 */
public class 반복문_중첩for5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=1;i<=9;i++)
		{
			for(int j=2;j<=9;j++)
			{
				System.out.printf("%2d*%2d=%2d\t",j,i,j*i);
			}
			System.out.println();
		}
	}

}
