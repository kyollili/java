/*
 * 	관련된 클래스를 묶어서 한 개 폴더에 저장 관리
 * 	자바에서 지원하는 패키지
 * 	-----------------
 * 	java.util	===>jdk1.0
 * 	java.io
 * 	java.net
 * 	java.sq
 * 	javax		===> jdk1.2
 * 	javax.xml
 * 	javax.servlet => 웹
 * 	--------------
 * 	폴더명	 (패키지) com/org => 회사명 => 기능명
 * 	게시판
 * 		com.sist.board
 * 		com.sist.reserve
 * 		com.sist.recommand
 * 		com.sist.member
 * 		com.sist.admin
 * 		
 * 		com.sist.board
 * 		=>Board
 * 		public class Board
 * 		{
 *			int bno;
 *			String name;
 *			String subject;
 *			String content;
 *			...
 *			...
 *		}
 *		com.sist.member
 *		=> Member
 *		=> 사용이 불가능하다
 *		public class Member
 *		{
 *			int mno;
 *			String name;
 *		} 
 * 	
 * 		1) 패키지란 (폴더명)
 * 			클래스의 묶음( 관련된 클래스를 그룹단위로 묶어서 관리)
 * 			폴더.폴더....
 * 		2) 패키지를 사용하는 목적 : 찾기, 다른 클래스에 불러서 사용하기 편하게 작업
 * 		3) 패키지 단위로 라이브러리 제작이 가능 --> .jar(재사용)
 * 			기본 : 데이터형 클래스 ==>
 * 				  ---------- , 활용하는 메소드
 * 		4) 패키지 선언
 * 			자바 소스 구조
 */
public class 패키지_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
