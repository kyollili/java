package com.sist.exception;

public class MainClass_예외처리실행순서 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(4);
			System.out.println(5);
		}catch(RuntimeException ex)
		{
			System.out.println(6);// 오류 없어서 에러처리 제외
			
		}
		finally
		{
			System.out.println(7);
		}
		System.out.println(8);
		System.out.println(9);
		//1,2,3,4,5,7,8,9*/
		/*System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(10/0);//=>catch이동 =>5번 수행x
			System.out.println(5);
		}catch(RuntimeException ex)
		{
			System.out.println(6);
			
		}
		finally
		{
			System.out.println(7);
		}
		System.out.println(8);
		System.out.println(9);
		//1,2,3,6,7,8,9*/
		System.out.println(1);
		System.out.println(2);
		try
		{
			System.out.println(3);
			System.out.println(10/0);//=>catch이동 =>5번 수행x
			System.out.println(5);
		}/*catch(RuntimeException ex)
		{
			System.out.println(6);
			
		}*/
		finally
		{
			System.out.println(7);
		}
		System.out.println(8);
		System.out.println(9);
		//1,2,3,7,,비정상 종료
	}

}
