/*
 * 		삼항연산자 : 피연산자 3개인 경우 연산자
 * 		형식)
 * 			(조건)?값:값
 * 			조건 true ==> 값1
 * 			조건 false ==> 값2	===> if~else
 */
public class 삼항연산자_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char c='A';
		System.out.println(c>='A' && c<='Z'?"대문자":"소문자");
		System.out.println((c>='A' && c<='Z')||(c>='a' && c<='z')?"알파벳":"알파벳이 아니다");

	}

}
