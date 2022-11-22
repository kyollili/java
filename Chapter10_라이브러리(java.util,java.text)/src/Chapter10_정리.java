/*
 * 		날짜 / 시간 (10장)
 * 		
 * 		***Date ==> 저장용 (현재 시스템의 날짜, 시간 읽어옴) => 오라클 => 기능이 거의 없다
 * 		***Calendar ==> Date 클래스 확장 => 제어가 쉽게 만들어준 클래스(추상 클래스)
 * 		  ----------
 * 			생성 : Calendar cal=Calendar.getInstance() ==> p.528
 * 			읽기 : cal.get(Calendar.YEAR) ==> p.530
 * 				  cal.get(Calendar.MONTH)
 * 				  cal.get(Calendar.DATE)
 * 				  cal.get(Calendar.DAY_OF_WEEK)
 * 			쓰기
 * 				  cal.set(Calendar.YEAR,2022)
 *  			  cal.set(Calendar.MONTH,11-1)
 *   			  cal.set(Calendar.DATE,22)
 *    			***cal.getActualMaximum(Calendar.DATE) ==> 설정된 달의 마지막
 * 		***SimpleDateFormat p.544 => (Date를 변환해서 출력)
 * 			년도 : yyyy
 * 			월 : MM , M
 * 			일 : dd , d
 * 			시간 : hh 
 * 			분 : mm , m
 * 			초 : ss , s
 * 
 * 		***DecimalFormat p.541 ==> 1,000 ==> #,###,###
 * 			형식) DecimalFormat df=new DecimalFormat("##,###,###")
 * 				System.out.println(df.format(12345689)) ==> 123,456,789 => 쇼핑몰 상품, 예약
 * 		MessageFormat : 데이터베이스 : 출력 형식을 만든다
 * 			String pattern="{0},{1},{2}...";
 * 			Object[] obj={};
 * 			MessageFormat.format(pattern,obj);
 * 		LocalDate : 날짜
 * 			LocalDate.now() : 현재 날짜
 * 			LocalDate.of(년,월,일) : 날짜 설정
 * 		LocalTime : 시간
 * 			LocalTime.now(); : 현재 시간
 * 			LocalTime.of(시,분,초) : 시간 설정
 * 		LocalDateTime : 날짜 , 시간
 * 			LocalDate + LocalTime
 * 
 * 		=======> isAfter(), isBefore(), isEqual()
 * 		=======> between
 */
public class Chapter10_정리 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
