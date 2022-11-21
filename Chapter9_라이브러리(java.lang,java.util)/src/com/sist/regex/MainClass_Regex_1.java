package com.sist.regex;
// 패턴 => 형태를 만들어서 찾기
// 예) IP 전체를 가지고 온다 => [0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
//							숫자(1개~3개)
//							127.0.0.1	211.89.63.1
// 긍정 ==> 맛있+		맛없+ ==> 데이터 분석 (추천)
/*
 * 	패턴 사용 기호 (자바, 자바스크립트, 파이썬, 오라클)
 * 	----------
 * 		한글 : [가-힣]
 * 		영문 : [A-Za-z]
 * 		 - 대문자 : [A-Z]
 * 		 - 소문자 : [a-z]
 * 		숫자 : [0-9]
 * 		-------------------
 * 		[abc] => a|b|c => [a-c]
 * 
 * 		[] => 범위 
 * 		{} => 개수
 * 		---------->[A-Z]{3} ==> 대문자 알파벳 3개
 * 				   [가-힣]{3,5} ==> 한글 3~5개
 * 		
 * 		^ : 시작, 제외
 * 		======== startsWith		예) ^[가-힣]{3} :한글로 시작하는 3글자	/	[^가-힣] : 한글 제외
 * 		$ : 끝				
 * 		======= endsWith		예) [A-Z]$ : 대문자로 끝나는 문자열
 * 		. : 임의의 한 글자
 * 		.* : 모든 문자
 * 		+ : 한 글자 이상
 * 		* : 0 글자 이상
 * 		----------------------------------------
 * 		[0-9] ==> \\d	/	제외 \\D [^0-9]
 * 		\\s 공백문자 	\\S 공백문자 제외
 * 		\\w 알파벳,숫자		\\W 알파벳, 숫자 제외
 * 		[A-Za-z0-9]			[^A-Za-z0-9]
 */
import java.util.regex.*;
public class MainClass_Regex_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] data= {
			"bat","baby","bonus","c","cA",
			"ca","co","c.","c0","c#",
			"car","combat","count","date","disc",
			"홍길동","맛있다OK","시작12345"
		};
		//c[a-z]* c로 시작해서 뒤에 소문자가 붙는 모든 문자
				//==> c,ca,co,car,combat,count
		//c[a-z] c로 시작하고 뒤에 소문자 알파벳 한 개 붙음
				//==> ca, co
		//c[a-zA-Z0-9] c로 시작하고 뒤에 알파벳,숫자 붙은 두 글자 문자열
				//==> cA, ca, co, c0
		//c\\w c로 시작하고 뒤에 알파벳, 숫자 붙은 두 글자 문자열
		// .* 한 글자 이상 모든 문자 => 전체 읽기
		// .+ => 두 글자 이상
		// [bc].* b나 c로 시작하는 모든 글자
		//^[가-힣] : 한글로 시작하는 한 글자
		//^[가-힣]* 한글로 시작하는 모든 문자
		//Pattern p=Pattern.compile("[가-힣]{2}\\w+");//한글 두 글자에 뒤에 영어나숫자 한 개 이상
		Pattern p=Pattern.compile("^[b|c|d].{2}");//b나 c나 d로 시작하고 뒤에 임의의 문자 2개
		
		for(String s:data)
		{
			Matcher m=p.matcher(s);
			if(m.matches())
			{
				System.out.println(m.group());
			}
		}
	}

}
