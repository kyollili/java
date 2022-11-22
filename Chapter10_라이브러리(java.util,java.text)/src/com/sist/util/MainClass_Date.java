package com.sist.util;
//Date : 시스템의 현재 날짜/시간을 읽어온다 ==> 오라클 데이터형과 연결(DATE)
//Date 클래스의 단점 : 기능 빈약하다 => 보완(Calendar) =>Date는 날짜 저장용으로 사용이 많다
import java.util.*;
import java.text.*;
public class MainClass_Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 생성하는 과정
		/*
		 * 	Format => 변환
		 * 	-----------
		 * 	년도	: yyyy (대소문자 구분) 
		 * 	월	: MM , M => 01,02,,09 / 1,2,3,,
		 * 	일 	: dd , d
		 * 	----------------------------------------> 실제 날짜를 계산(dd,MM => d,M)
		 * 		08, 09 -> 8진법으로 계산이 되기 때문에 출력할 때는 상관 없지만 계싼할 때는 그냥 8,9로 해야하기 때문
		 * 	시간	: hh , h
		 * 	분	: mm , m
		 * 	초	: ss , s
		 * 	
		 */
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분 ss초");
		while(true)
		{
			Date date=new Date();
			String today=sdf.format(date); //스케줄러
			System.out.println("지금은 "+today+" 입니다");
			try
			{
				Thread.sleep(1000);
			}catch(Exception ex) {}
			
		}
		
		
	}

}
