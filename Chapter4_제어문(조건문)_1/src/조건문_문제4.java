/*
 * 문제4. 
 * 사용자로부터 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값,합계와 평균을 구해보자.
 */
import java.util.Scanner;
public class 조건문_문제4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("a,b,c입력(80 80 80)");
		int a=scan.nextInt();
		int b=scan.nextInt();
		int c=scan.nextInt();
		
		int max=0;
		if(max<a) max=10;
		if(max<b) max=20;
		if(max<c) max=30;
		
		int min=100;
		if(min>a) min=10;
		if(min>b) min=20;
		if(min>c) min=30;
		
		System.out.println("최대값:"+max);
		System.out.println("최솟값:"+min);
		
		int total=a+b+c;
		System.out.println("총합:"+total);
		
		double avg=total/3.0;
		System.out.printf("평균:%.2f\n",avg);

	}

}

/*
 * 임의의 세 개의 정수를 입력받아, 그 수들의 최대값과 최소값,합계와 평균을 구해보자.
 * public class 조건문_문제4
 * 		
 * 		public static void main(String[] args) {
 * 		int a=(int)(Math.random()*100)+1;
 * 		int b=(int)(Math.random()*100)+1;
 * 		int c=(int)(Math.random()*100)+1;
 * 
 * 		System.out.println("a="+a+",b="+b+",c="+c);
 * 
 * 		int max=a;
 * 		if(max<b) max=b;
		if(max<c) max=c;
		System.out.println("최댓값:"+max);
		
		int min=a;
		if(min>b) min=a;
		if(min>c) min=c;
		System.out.println("최솟값:"+min);
		
		int total=a+b+c;
		double avg=total/3.0;
		
		System.out.println("총합:"+total);
		System.out.printf("평균:%.2f\n",avg);
 */
