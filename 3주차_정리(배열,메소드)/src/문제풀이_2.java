//4. 문자열을 거꾸로 출력하는 메소드를 구현하시오
//6. 년도를 입력받아서 윤년인지 여부를 확인하는 메소드를 구현하시오
//7. 두수를 입력받아 큰 수를 출력하는 메소드를 구현하시오.
//8. 입력 받은 값이 짝수인지 홀수인지 판별하는 메소드를 구현하시오
//9. 3의 배수를 판별하는 메소드를 구현하시오
public class 문제풀이_2 {
	//4.
	static void reverse(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
	}
	//6.
	static boolean isYear(int year)
	{
		if((year%4==0 && year%100!=0)|| year%400==0)
			return true;
		return false;
	}
	//7.
	static int max(int a, int b)
	{
		/*int max=0;
		if(a<b)
			max=b;
		else
			max=a;*/
		//return Math.max(a, b);
		return a<b?b:a;
	}
	//8.
	static String method1(int a)
	{
		if(a%2==0)
			return "짝수입니다";
		return "홀수입니다";
		//return a%2==0?"짝수입니다":"홀수입니다"
	}
	//9.
	static void method3(int a)
	{
		if(a%3==0)
			System.out.println("3의 배수입니다");
		else
			System.out.println("3의 배수가 아닙니다");
		//return a%3==0?"3의 배수입니다":"3의 배수가 아닙니다"
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse("기러기토마토스위스인도인별똥별우영우역삼역");
		System.out.println();
		boolean bCheck=isYear(2022);
		if(bCheck==true)
			System.out.println("윤년입니다");
		else
			System.out.println("윤년이 아닙니다");
		
		int m=max(50,60);
		System.out.println(m);
		String s=method1(10);
		System.out.println(s);
		
		method3(12);
	}

}
