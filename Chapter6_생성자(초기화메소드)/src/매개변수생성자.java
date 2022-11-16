import java.util.Scanner;
class Student
{
	String name; //null
	int kor,eng,math;//0,0,0
	/*Student(String n,int k,int e, int m)
	{
		name=n;
		kor=k;
		eng=e;
		math=m;
	}*/
	Student(String name,int kor,int eng,int math)
	{
		this.name=name;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	void print()
	{
		System.out.println("이름:"+name);
		System.out.println("국어:"+kor);
		System.out.println("영어:"+eng);
		System.out.println("수학:"+math);
		System.out.println("총점:"+(kor+eng+math));
		System.out.printf("평균:%.2f\n",(kor+eng+math)/3.0);
	}
	//this() (자신의 생성자) this(자신의 객체) p.295
	
}
public class 매개변수생성자 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("이름 입력:");
		String name=scan.next();
		System.out.print("국어 입력:");
		int kor=scan.nextInt();
		System.out.print("영어 입력:");
		int eng=scan.nextInt();
		System.out.print("수학 입력:");
		int math=scan.nextInt();
		
		//학생 한 명 설정
		//Student s=new Student(); =>오류 / 디폴트생성자 없어서
		Student hong=new Student(name,kor,eng,math);
		//인스턴스명.메소드명() ==> 메소드 호출 과정
		hong.print();
	}
}
