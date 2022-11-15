/*
 * 배열 생성, 초기화, for
 * 데이터값 제어 : 일반 for, 데이터 출력 : forEach
 * 			   -------back		  --------front
 * 
 * 1) 데이터 저장
 * 2) 연산자,제어문
 * 3) 결과값 출력
 */
public class 배열_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 알파벳을 저장 => 출력 26개
		char[] alpha=new char[26]; //'\u0000'
		/*
		 * new를 이용해서 메모리 저장공간을 확보하면
		 * 2byte씩 26개 -> 52byte
		 * int => 0
		 * long => 0L
		 * float => 0.0F
		 * double => 0.0
		 * char => \u0000'
		 * boolean => false
		 * =>초기값
		 */
		// 배열에 값을 첨부
		// 배열 ==>for문 인덱스를 이용 => int를 이용 char(x)
		char c='A';
		for(int i=0;i<alpha.length;i++) //배열 범위를 초과하면 오류가 나기 때문에 length를 이용해서 범위 지정하여 에러 방지
		{
			alpha[i]=c++;
		}
		//중간에 제어 가능
		//출력
		for(char ch:alpha) //배열(고정), 컬렉션(가변)만 사용 가능
		{
			System.out.print(ch+" ");
		}
	}

}
