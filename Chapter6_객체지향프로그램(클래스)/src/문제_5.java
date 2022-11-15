class Goods{
	String poster;
	String title;
	String story;
	int percent;
	int price;
	int price2;
	double score;
	String deliver;
}
public class 문제_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Goods goods1=new Goods();
		goods1.poster="image";
		goods1.title="[美친특가]닥터키 종아리 공기압 마사지기";
		goods1.story="오늘도 수고한 나를 위한 공기압 마사지기!";
		goods1.percent=60;
		goods1.price=39900;
		goods1.price2=37905;
		goods1.score=4.8;
		goods1.deliver="무료배송";
		
		System.out.println(goods1.poster);
		System.out.println(goods1.title);
		System.out.println(goods1.story);
		System.out.print(goods1.percent+"% ");
		System.out.println(goods1.price+"원");
		System.out.println("첫구매할인가 "+goods1.price2+"원");
		System.out.println("★★★★★ "+goods1.score);
		System.out.println("배송 "+goods1.deliver);
		
	}

}
