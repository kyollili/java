package com.sist.regex;
import java.util.regex.*;
public class MainClass_Regex_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*String data="HP:010-1111-1111,OFFICE:02-2222-2222";
		String pattern="(0\\d{1,2})-(\\d{4})-(\\d{4})";
		//		0 뒤에 숫자 1개 아님 2개	  숫자 4개	숫자4개
		//System.out.println(pattern);
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(data);
		while(m.find()) //존재여부확인
		{
			System.out.println(m.group());
		}*/
		String ip="211.89.63.1,211.89.63.131,127.0.0.1,169.123.174.2,223.130.195.95,211.249.220.24,142.251.42.132,12345.123.11111.5555,676767676.567";
		String pattern="(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})\\.(\\d{1,3})";
		//				[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}\\.[0-9]{1,3}
		//				\\d <=>[0-9]
		Pattern p=Pattern.compile(pattern);
		Matcher m=p.matcher(ip);
		while(m.find())
		{
			if((m.group(1)+"."+m.group(2)+"."+m.group(3)).equals("211.89.63"))
			{
				System.out.println(m.group());
			}
		}
	}

}
