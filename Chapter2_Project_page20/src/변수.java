/*
 * page 20
 * 변수
 * 1. 변수 설정 / 초기값->변경이 가능한 값, 상수 : 변경할 수 없는 값
 *   final int a=10;
 *   1) 변수 설정
 *      데이터형(자료형) 변수명 = 값
 *      ------------메모리 크기
 *   데이터형
 *   ---------------------------
 *   종류/크기		1byte(8bit)	2byte(16bit)	4byte(32bit)	8byte(64bit)
 *   -------------------------------------------------------------------
 *   논리형		**boolean
 *   (조건문)
 *   --------------------------------------------------------------------
 *   정수형		**byte		short			***int(default)	***long
 *                                          ---------------
 *                                          구분(L,l)
 *   --------------------------------------------------------------------
 *   실수형									float			***double
 *                                          ------------
 *                                          구분(F,f)
 *   --------------------------------------------------------------------
 *   문자형					***char
 *   --------------------------------------------------------------------
 *   
 *   데이터형의 크기 비교 -> 형변환
 *   boolean은 제외
 *   byte<short<int<long<float<double
 *        char(연산처리->정수형으로 변경)
 *   ***byte 크기로 결정되는 것이 아니고 숫표현이 많은 순서로 결정
 *      long(8byte)<float(4byte)
 *      1			1.000000(소수점6자리), double(8byte)(소수점15자리)
 *      
 *      double d = 'A'-->65.0 저장
 *      int a=10.5(오류)->큰 데이터를 저장하면 오류 발생
 *      
 *      ***사용처에 따라서 쓰임이 다르기 떄문에 사례연구 중요
 *      
 *    *** 25 page 식별자 (메모리의 이름->중복이 있으면 안된다)
 *        1) 알파벳, 한글 시작 (단 알파펫은 대소문자 구분)
 *        2) 숫자 사용이 가능 ( 앞에 사용 금지)
 *        3) 특수문자 (_)
 *        4) 키워드는 사용 금지
 *        888변수는 소문자로 시작한다 (26page)
 *        
 *    프로그램 순서
 *    1) 변수설정
 *    2) 제어문
 *    3) 연산처리
 *    4) 결과값
 *    
 *    ***데이터 표현법
 *    1) 정수 --> 10,20,30(byte,int,short),40L(40l)->long
 *    2) 문자 --> 'A','B',,,
 *    3) 실수 --> 10.5, 10.7(long), 108F(f)=float
 *    -------------------------------------------범위
 *    			범위를 벗어나면 오버플로우 발생
 *    4) 논리 --> true/false
 *    
 *    byte b1=100
 *    byte b2=100
 *    int b3=b1+b2 -->오류
 *        
 */
public class 변수 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
