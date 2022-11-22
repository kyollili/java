package com.sist.util;
import java.util.*;
public class MainClass_Calendar_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 사용자로부터 년 월
		Scanner scan=new Scanner(System.in);
		System.out.print("년도 월 입력(2022 11):");
		int year=scan.nextInt();
		int month=scan.nextInt();
		
		// ==> 1일의 요일 확인, 요청달의 마지막 날짜
		Calendar cal=Calendar.getInstance(); //객체 생성
		cal.set(Calendar.YEAR, year); //사용자가 요청한 날짜로 변경
		cal.set(Calendar.MONTH, month-1);
		cal.set(Calendar.DATE, 1);
		
		int week=cal.get(Calendar.DAY_OF_WEEK)-1;
		int lastday=cal.getActualMaximum(Calendar.DATE);
		
		String[] strWeek={"일","월","화","수","목","금","토"};
		//System.out.println("요청한 월 1일의 요일: "+strWeek[week]+"요일");
		System.out.println(year+"년 "+month+"월");
		System.out.println("\n");
		for(String s:strWeek)
		{
			System.out.print(s+"\t");
			
		}
		System.out.println();
		for(int i=1;i<=lastday;i++)
		{
			if(i==1)
			{
				for(int j=0;j<week;j++)
				{
					//1일 전까지 공백
					System.out.print("\t");
				}
			}
			System.out.printf("%2d\t",i);
			week++;
			if(week>6) //일요일이면
			{
				week=0;
				System.out.println();
			}
		}
	}

}
