//p.249
/*
 * 		클래스
 * 		-----
 * 		구성요소
 * 		1) 변수 => 기본형, 참조형(배열)
 * 		2) 메소드
 * 	----------------------------------+ 클래스(객체지향)
 * 		1. 메소드 : 특정작업을 수행하는 일련의 명령문을 모아서 관리
 * 					데이터 저장 : 변수, 배열
 * 					명령문(CPU) : 메소드 
 * 					예)
 * 						{
 * 							int a=10;
 * 							int b=20;
 * 							int c=a+b;
 * 						}
 *						==> 다른 클래스와 연결
 *							클래스	<===========>통신
 *									메소드
 *		2. 사용하는 이유
 *			=> 재사용
 *			=> 가독성 (소스를 관련된 내용으로 나눈다) => 문장의 단락을 나눠서 처리하는 것과 같다(구조적인 프로그램)
 *			=> 중복코드 제거
 *		3. 메소드 구조
 *			리턴형 메소드명(매개변수) => 선언부(인터페이스,추상클래스)
 *			{
 *				구현부
 *			}
 *
 *			리턴형=>사용요청 처리 결과 : 한 개 설정이 가능
 *								-----------------반드시 배열, 클래스로 묶어서 전송
 *			매개변수 => 사용자 처리할 데이터 전송
 *					 여러 개 사용 가능(,로 구분)
 *			구현부
 *			{
 *				return 값; ==> 리턴형에 지정된 데이터값이어야 한다
 *				------생략할 수 있음 (리턴형이 void일 경우) / void=>자체에서 결과값 출력
 *			}
 *	
 *			****return은 메소드 종료를 알려준다
 *				return은 항상 마지막에 추가되는 것은 아니다
 *		4. 메소드 유형
 *			---------------------
 *				리턴형		매개변수(지역변수의 일종) ==> 메소드 종료와 동시에 메모리에서 사라진다
 *						=> 메소드 안에서만 사용이 가능
 *			---------------------
 *				  O			O
 *			---------------------
 *				  O			X
 *			---------------------
 *				  X			O	==> 리턴형이 없는 경우에는 void를 사용한다
 *			---------------------
 * 				  X			X
 *
 */


import javax.swing.JOptionPane;

public class 메소드_1 {
	static boolean isLogin(String id, String pwd)
	{
		final String ID="admin";
		final String PWD="1234";
		
		/*if(id.equals(ID) && pwd.equals(PWD))
		{
			return true; // 메소드는 return이 있는 곳에서 종료
		}
		return false;*/
		boolean bCheck=false;
		/*
		 * equals : 대소문자 구분해서 비교(로그인)
		 * equalsIgnoreCase : 대소문자 구분 없이 비교 (검색)
		 */
		
		if(id.equalsIgnoreCase(ID) && pwd.equals(PWD))
			bCheck=true;
		/*else
			bCheck=false;*/
		
		return bCheck;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String id=JOptionPane.showInputDialog("ID입력:");
		String pwd=JOptionPane.showInputDialog("비밀번호 입력:");
		
		boolean bCheck=isLogin(id, pwd);
		if(bCheck==true)
		{
			System.out.println(id+"님 로그인 되었습니다");
		}
		else
		{
			System.out.println("ID 또는 Password가 틀립니다");
		}*/
	}

}
