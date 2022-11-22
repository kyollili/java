/*
 * 	for/while
 * 	A~Z 출력
 */
public class 반복문_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(char a='A';a<='Z';a++)
		{
			System.out.print(a+" ");
		}
		System.out.println();
		char a='A';
		while(a<='Z')
		{
			System.out.print(a+" ");
			a++;
		}
	}

}
