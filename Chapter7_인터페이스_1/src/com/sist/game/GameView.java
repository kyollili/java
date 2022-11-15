package com.sist.game;

import java.awt.*;

import javax.swing.*;
/*
 * 		인터페이스의 장점
 * 		= 기능이 설정(설계) : 개발 기간을 단축할 수가 있다
 * 		= 모든 개발자가 같은 메소드를 이용해서 구현(표준화) => 라이브러리 (모든 개발자가 같은 형식으로 코딩)
 * 														  ---------------------- 스프링(프레임워크)
 * 		= 서로 관계 없는 클래스를 연결해서 사용이 가능하게 만든다
 * 		= 독립적으로 사용이 가능
 * 		= 다중 상속이 가능하기 때문에 소스 코딩이 간결해진다
 * 		단점
 * 		= 인터페이스 메소드 선언을 추가하면 연결 되어있는 모든 클래스가 에러 발생 => default로 해결
 */
public class GameView extends JPanel{
	private Image back;
	private Image avata;
	int x=150;
	int y=50;
	

	

	//초기화
	public GameView()
	{
		back=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\back.gif");
		avata=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\my_00.png");
	}
	public void setImage(String name)
	{
		avata=Toolkit.getDefaultToolkit().getImage("c:\\javaDev\\"+name+".png");
	}
	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		g.drawImage(back, 0, 0, getWidth(), getHeight(), this);
		g.drawImage(avata, x, y, this);
	}
	
}
