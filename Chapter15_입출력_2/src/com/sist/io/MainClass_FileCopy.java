package com.sist.io;
import java.util.*;
import java.io.*;
// 업로드
public class MainClass_FileCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fis=new FileInputStream("c:\\javaDev\\movie.txt");
			FileOutputStream fos=new FileOutputStream("c:\\download\\movie.txt");
			/*int i=0;
			while((i=fis.read())!=-1)
			{
				fos.write(i);
			}
			fis.close();
			fos.close();*/
			byte[] buffer=new byte[1024]; //클라이언트에서 서버로 파일을 전송하는 방법
			//TCP(1024) / UDP(512)
			int i=0; //글자번호가 아니다(읽은 byte 수)
			while((i=fis.read(buffer,0,1024))!=-1)
			{
				fos.write(buffer,0,i); //서버로 전송 ==> 파일 업로드
			}
			fis.close();
			fos.close();
			
			System.out.println("파일 복사 완료");
		}catch(Exception ex) {}
	}

}
/*
 * 		1. Stream (Input/Output) p.868
 * 		*2. File에 대한 정보 p.915
 * 		*3. FileInputStream / FileOutputStream p.879
 * 		*4. BufferedInputStream / BufferedOutputStream p.882~883
 * 		---------------------------------------------------------Byte스트림(파일전송,다운로드에서 주로 사용)
 * 		*5. FileReader / FileWriter p.898
 * 		*6. BufferedReader / BufferedWriter p.904
 * 		--------------------------------------------------------- 문자 스트림 파일 제어(한글 저장, 한글 읽기)
 * 		7. 직렬화 / 역직렬화
 * 			ObjectInputStream / ObjectOutputStream p.934
 */
