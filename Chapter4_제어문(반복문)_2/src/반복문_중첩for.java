/*
 * 	1) 조건문 중첩
 * 		if(조건문)
 * 		{
 * 			if(조건문)
 * 			{
 * 			}
 * 			else
 * 			{
 * 			}
 * 		}
 * 	2) 선택문 중첩
 * 		switch(변수)
 * 		{
 * 			case 값:
 * 				switch(변수)
 * 				{
 * 					case 값:
 * 				}
 * 		}
 * 
 * 	3) 반복문 중첩
 * 		for() ***
 * 		{
 * 			for()
 * 			{
 * 			}
 * 		}
 * 
 * 		for()
 * 		{
 * 			while()
 * 			{
 * 			}
 * 		}
 * 
 * 		while()
 * 		{
 * 			for()
 * 			{
 * 			}
 * 		}
 * 
 * 		while()
 * 		{
 * 			while()
 * 			{
 * 			}
 * 		}
 * 	===================================
 * 		이중 for문
 * 		for() =======> 줄 수
 * 		{
 * 			for()
 * 			{
 * 				실제 출력물
 * 			}
 * 		}
 */
public class 반복문_중첩for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("❤️❤️❤️❤️❤️");
		System.out.println("❤️❤️❤️❤️❤️");
		System.out.println("❤️❤️❤️❤️❤️");
		System.out.println("❤️❤️❤️❤️❤️");
		System.out.println("❤️❤️❤️❤️❤️");
		System.out.println();
		//1차 for
		for(int i=1;i<=5;i++)
			System.out.print("❤️");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("❤️");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("❤️");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("❤️");
		System.out.println();
		for(int i=1;i<=5;i++)
			System.out.print("❤️");
		System.out.println();
		
		System.out.println("2차 for문 이동");
		//줄 수 ==>5
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
				System.out.print("❤️");
			System.out.println();
		}

	}

}
