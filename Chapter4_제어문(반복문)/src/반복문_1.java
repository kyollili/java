//1~100 합을 구한다
public class 반복문_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("=== for문 ===");
		// 변수 => 1~100 합을 누적하는 변수
		int sum=0;
		for(int i=1;i<=100;i++)
		{
			sum=sum+i;
			System.out.println("i="+1+",sum="+sum);
			//sum+=1
		}
		System.out.println("1~100까지의 합:"+sum);
		
		System.out.println("=== while문 ===");
		sum=0;
		int i=1;
		while(i<=100)
		{
			sum=sum+i;
			System.out.println("i="+1+",sum="+sum);
			i++;
		}
		System.out.println("1~100까지의 합:"+sum);
		
		System.out.println("=== do~while문 ===");
		sum=0;
		i=1;
		do {
			sum=sum+i;
			System.out.println("i="+1+",sum="+sum);
			i++;
		}while(i<=100);
		System.out.println("1~100까지의 합:"+sum);
		}
	}

