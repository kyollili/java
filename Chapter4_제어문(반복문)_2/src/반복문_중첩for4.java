/*
 * ❤️
 * ❤️❤️
 * ❤️❤️❤️
 * ❤️❤️❤️❤️
 * 
 * ❤️❤️❤️❤️
 * ❤️❤️❤️
 * ❤️❤️
 * ❤️
 * 
 * A
 * BC
 * DEF
 * GHIJ
 * 
 * A
 * AB
 * ABC
 * ABCD
 */
import java.util.Scanner;
public class 반복문_중첩for4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.print("정수 입력:");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=i;j++)
			{
					System.out.print("❤");
			}
			System.out.println();
			
		}
		System.out.println();
		for(int i=1;i<=4;i++)
		{
			
			for(int j=1;j<=n-i;j++)
			{
					System.out.print("❤");
			}
			System.out.println();
			
		}
		System.out.println();
		for(int i=1;i<=n;i++)
		{
			char c='A';
			for(int j=1;j<=i;j++)
			{
					System.out.print(c++);
			}
			System.out.println();
			
		}
	}

}
