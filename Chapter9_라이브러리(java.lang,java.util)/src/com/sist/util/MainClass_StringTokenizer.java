package com.sist.util;
//p.513
/*
 * 	StringTokenizer : 구분자별로 문자열을 나눠줄 때 사용 (데이터베이스 연결) => 서버
 * 		=> java.util
 * 		=> 생성자
 * 			new StringTokenizer(문자열,구분문자)
 * 		=> 주요메소드
 * 			countTokens() : 분리한 단어의 개수
 * 			hasMoreTokens() : 루프 사용시
 * 			nextToken() : 분리된 문자열을 읽을 때 사용
 * 		
 * 			*** 개수가 남으면 가능 / 모자라면 오류 발생
 */
import java.util.*;
public class MainClass_StringTokenizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String date="2022-11-21";
		StringTokenizer st=new StringTokenizer(date,"-");
		//StringTokenizer(date) ==> 공백에서 구분 ==> " "은 구분문자에서 생략 가능
		/*String year=st.nextToken();
		String month=st.nextToken();
		String day=st.nextToken();
		//String temp=st.nextToken(); 단어가 세개인데 nextToken 네개라서 오류
		*/
		System.out.println(st.countTokens());
		while(st.hasMoreTokens())
		{
			System.out.println(st.nextToken());
		}
	}

}
