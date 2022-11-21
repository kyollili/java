package com.sist.spring;

import java.util.StringJoiner;

/*
 *  p.471
 *  --------11장 , 12장, 15장 => 2~8장(기본), 9장(String, Object) => web 관련
 *  	String
 *  	------
 *  	StringBuffer : append() : 문자열 결합
 *  					toString()
 *  	Math : random() / ceil() / round()
 *  	***Wrapper : Integer, Double, Boolean => 문자열을 해당 데이터형으로 변경
 *  				parseInt() parseDouble() parseBoolean()
 *  				=> 박싱 / 언박싱
 *  				=> List<int> (x) => List<Integer>
 *  	StringTokenizer : nextToken(), countToken() , hasMoreTokens
 *  	Pattern / Matcher
 *  	-------	  ------- find(), group(), compile()
 *  	---------------------------------------------------------------
 */
public class MainClass_String_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color="red,green,blue,black,white,yellow,magenta";
		// 컬러별로 분리
		String[] colors=color.split(",");
		for(String c:colors)
		{
			System.out.println(c);
		}
		System.out.println("=== 출력형식 (join) ===");
		String ss=String.join("-", colors);
		System.out.println(ss);
		System.out.println("=== 출력형식 (replace) ===");
		ss=color.replace(",", "-");
		System.out.println(ss);
		//이미지(여러 개를 동시에 묶어서 저장) => 구분자 사용해서 저장 => 데이터를 나눠서 출력
		// 오라클 => ^
		StringJoiner sj=new StringJoiner("/","{","}"); //{데이터/데이터/데이터/}
									//구분자,prefix,suffix
		for(String s:colors)
		{
			sj.add(s);
		}
		System.out.println(sj.toString());
	}

}
