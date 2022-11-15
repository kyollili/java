//문제6. 임의의 문자를 추출하여 대문자인지 소문자인지 확인하는 프로그램 작성

public class 조건문_문제6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=(int)(Math.random()*2);//0,1
		int no=(int)(Math.random()*26)+65;
		char c=' ';
		if(i==0)
		{	
			c= (char)no; //i가 0이 나오면 대문자 출력
		}
		else
		{
			c=(char)(no+32); //i가 1이 나오면 소문자 출력
		}
		System.out.println("c="+c);
		if(c>='A' && c<='Z')
			System.out.println(c+"는(은) 대문자입니다");
		else
			System.out.println(c+"는(은) 소문자입니다");
	}

}
