package com.sist.io;
/*
 * 		자바/오라클 => 웹(80%)
 * 		-------------------
 * 		IO (InputStream,OutputStream)
 * 		=> 입출력
 * 			= 메모리 입출력
 * 				System.in / System.out
 * 				BufferedReader
 * 			= 파일 입출력 (가장 많이 사용되는 입출력) => 웹
 * 				FileInputStream / FileOutputStream
 * 				FileReader / FileWriter
 * 				ObjectInputStream / ObjectOutputStream
 * 				=> 보조 스트림
 * 					BufferedInputStream / BufferedOuputStream
 * 					BufferedReader		/ BufferedWriter
 * 					*** InputStream / OutputStream ==> 바이트 스트림(읽기/쓰기 => 1byte씩) => 한글 제어가 아니라
 * 																					=> 파일 복사 / 업로드 / 다운로드
 * 																					=> zip, mpg ...
 * 																					=> 그림파일, 동영상..
 * 					*** Reader / Writer ==> 문자 스트림 (읽기/쓰기 => 2byte씩) => 한글 출력 / 한글 읽기
 * 						---------------
 * 					
 * 			= 네트워크 입출력 : 네트워크 => 전송할 때 1byte(OutputStream) , 받을 때 2byte(Reader)
 * 									=> Stream(1byte) =======> Reader(2byte)
 * 														|
 * 												InputStreamReader
 * 			= 객체 단위 데이터 입출력
 * 			-------------------
 * 				입력 => ObjectInputStream
 * 				출력 => ObjectOutputStream
 * 				직렬화 / 역직렬화
 * 				-------------
 * 				직렬화 : 객체를 데이터 스트림으로 만든 것
 * 							--------- 읽기/쓰기를 하기 위해서 연속적으로 구성한 메모리
 * 				역직렬화 : 연속적인 메모리 구조를 객체 형태로 변경
 * 				==> 저장되는 데이터를 Serializable로 ->(interface)
 * 				class Sawon implements Serializable
 * 				{
 * 				}
 * 				=> 객체단위 저장
 *  			=> readObject()
 *  			=> writeObject()
 *  			=> close()
 */
import java.util.*;
import java.io.*;
class Sawon implements Serializable
{
	private int sabun;
	private String name;
	private String dept;
	private String loc;
	private String job;
	
	//sabun name dept loc job 일자로 배열해서 stream에서 처리할 수 있게 함
	public int getSabun() {
		return sabun;
	}
	public void setSabun(int sabun) {
		this.sabun = sabun;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getLoc() {
		return loc;
	}
	public void setLoc(String loc) {
		this.loc = loc;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	 public Sawon(int sabun, String name, String dept, String loc, String job) {
	      this.sabun = sabun;
	      this.name = name;
	      this.dept = dept;
	      this.loc = loc;
	      this.job = job;
	   }
	 public Sawon() {}

}
public class MainClass_ObjectInputString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*ArrayList<Sawon> list=new ArrayList<Sawon>();
		list.add(new Sawon(1,"홍길동","개발부","서울","대리"));
		list.add(new Sawon(2,"김두한","기획부","부산","사원"));
		list.add(new Sawon(3,"이순신","자재부","제주","과장"));
		list.add(new Sawon(4,"강감찬","총무부","인천","사원"));
		list.add(new Sawon(5,"박지성","개발부","서울","부장"));
		//ArrayList 자체를 저장
		try
		{
			ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("c:\\java_data\\sawon.txt"));
			oos.writeObject(list);
			oos.close();
			System.out.println("저장 완료");
		}catch(Exception ex) {}*/
		//데이터 읽기 => 화면 출력
		ArrayList<Sawon> list=new ArrayList<Sawon>();
		try
		{
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream("c:\\java_data\\sawon.txt"));
			list=(ArrayList<Sawon>)ois.readObject();
			ois.close();
			
			//출력
			for(Sawon s:list)
			{
				System.out.println(s.getSabun()+" "+s.getName()+" "+s.getDept()
				+" "+s.getLoc()+" "+s.getJob());
			}
		}catch(Exception ex) {}
	}

}
