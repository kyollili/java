class Food{
	int fno;
	String poster;
	String name;
	double score;
	String address;
	String tel;
	String type;
	String price;
	String time;
	String[] menu;
}
public class 문제_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Food food1=new Food();
		food1.fno=1;
		food1.poster="image";
		food1.address="전라북도 전주시 완산구 풍남문2길 39 남부시장";
		food1.type="탕/찌개/전골";
		food1.price="만원 미만";
		food1.time="06:00-24:00";
		
		
		System.out.println(food1.fno+".");
		System.out.println(food1.poster);
		System.out.println("주소 "+food1.address);
		System.out.println("음식 종류 "+food1.type);
		System.out.println("가격대 "+food1.price);
		System.out.println("영업 시간 "+food1.time);
	}

}
