import java.util.Arrays;

/*
 * 		문자열 관련 데이터형(자바) ==> "" , char ''
 * 		---------------
 * 			String
 * 			------ 문자열을 저장하는 기능, 문자열 제어하는 기능(라이브러리)
 * 			1) 저장 방법
 * 				**String s=""; => 가장 많이 사용되는 방법(기본형처럼 사용) => 웹에 90%
 * 				String id="admin" => char[] c={'a','d','m','i','n'}
 * 				------char[]을 사용하기 쉽게 만든 클래스
 * 				String s=new String("");
 * 			2) String 기능
 * 				1. 문자 변환
 * 					1) toUpperCase : 대문자 변환
 * 					2) toLowerCase : 소문자 변환
 * 					*****3) valueOf : 모든 데이터형을 문자열로 변환
 * 							int a=10;
 * 							valueOf(a) ==>"10" ==> parseInt("10")==> 10
 * 							boolean b=true
 * 							valueOf(b) ==> "true" ==> parseBoolean("true") ==> true
 * 				2. 문자 제어
 * 					*x100001) substring() ==> 문자열 자를때 사용
 * 				3. 문자 변경
 * 					1) trim() => 좌우 공백을 제거 (입력할때)
 * 					2) replace() => 글자 변경 ===> 오라클(크롤링) ==> 이미지
 * 						replace('&','^')
 * 					3) replaceAll() ==> 정규식 (문자형식)
 * 						ip
 * 						replaceAll("[0~9]{1,3}\\.[0~9]{1,3}\\.[0~9]{1,3}\\.[0~9]{1,3}")
 * 					4) split() : 문자열을 배열로 변경
 * 						String s="red,blue,green";
 * 						String[] arr=se.split(",") ==> {"red","blue","green"}
 * 				4. 문자 비교
 * 					*****1) equals() : 대소문자 구분 후 비교(로그인,아이디중복체크,아이디찾기,..,상세보기
 * 					*****2) contains() : 포함(검색)
 * 					3) startsWith : 서제스트(시작단어)
 * 					4) endsWith : 끝나는 단어 찾을때
 * 					   ---------------------------------검색기
 * 				5. 문자 찾기
 * 					*****1) indexOf : 앞에서부터 데이터 찾기
 * 						String s="Hello Java"
 * 							s.indexOf("a"); ==> J<a>va
 * 					2) lastIndexOf : 뒤에서부터 데이터 찾기
 * 							s.lastIndexOf("a"); ==> Jav<a>
 * 				6. 기타
 * 					1) concat("a","b") => ab ==>+ 이용
 * 					"a"+"b"=>"ab"
 * 					*****2) charAt() : 문자 한 개를 가지고 올때
 * 					3) toCharArray() : 문자열을 char[]로 변경
 * 				-------------------------------------------------------------------------기능/용도/사용처
 */
public class 문자열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. 변수(문자열) 선언
		//String msg="Hello Java"; //보통 이렇게 선언과 동시에 초기화
		String msg;
		//char[] ==>
		/*
		 * 	"Hello Java" ==> {'H,'e','l','l','o',' ','J','a','v','a'}
		 * 					   0  1   2   3   4   5   6   7   8   9
		 * 	charAt(0) ==> 'H'
		 */
		//2. 초기화
		msg=" Hello Java "; //이렇게 선언을 먼저 하고 나중에 초기화 하는 경우는 입력값을 받아오거나 파일을 읽어오는 경우,,
		//3. 활용(요청처리)
		// 1) 문자의 개수 확인(length())
		System.out.println(msg.length()); //공백도 문자로 취급한다
		//2) 공백 제거
		System.out.println(msg.trim().length());
		//3) 변환 대문자로
		System.out.println(msg.toUpperCase());
		//4) 소문자
		System.out.println(msg.toLowerCase());
		//5) 자르기 substring()
		/*
		 * substring(int start) => 지정된 위치부터
		 * substring(int start, int end) => 중간부터, end는 제외
		 */
		System.out.println(msg.substring(6));
		System.out.println(msg.substring(0,5));
		String post="101-123";
		System.out.println(post.substring(0,3));
		System.out.println(post.substring(4));
		String fileName="문자열_1.java";
		System.out.println(fileName.substring(6));
		System.out.println(fileName.substring(0,6));
		// 파일명 ==> 문자열.1.java
		System.out.println(fileName.lastIndexOf(".")+1);
		System.out.println(msg.indexOf("a"));
		System.out.println(msg.lastIndexOf("a"));
		//4. 출력
		/*
		 * 
		 */
	}

}
