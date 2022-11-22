/*
 * 난수 6개 추출 합
 * ---1~100
 */
public class 반복문_while2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		/*int a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
		sum+=a;
		a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
		sum+=a;
		a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
		sum+=a;
		a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
		sum+=a;
		a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
		sum+=a;
		a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
		sum+=a;
		
		System.out.println("sum="+sum);*/
		int i=1;
		while(i<=6)
		{
			int a=(int)(Math.random()*100)+1;//1~100 사이의 정수 한 개 추출
			//a 변수는 while 한번 수행시마다 ==> 새로운 변수다
			System.out.println(i+". "+a);
			sum+=a;
			i++;
		}//a는 메모리에 의해서 자동 삭제 -> 아래 문장을 {} 안으로 넣어야함
		//System.out.println("a="+a);
		System.out.println("sum="+sum);
	}

}
