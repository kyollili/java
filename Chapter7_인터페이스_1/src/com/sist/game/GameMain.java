package com.sist.game;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.*;

public class GameMain extends JFrame implements KeyListener,MouseListener,MouseMotionListener,Runnable{
	
	private GameView gv=new GameView();
	public GameMain()
	{
		add("Center",gv);
		setSize(1024,900);
		setVisible(true);
		addKeyListener(this);
		gv.setFocusable(true);
		gv.addMouseListener(this);
		gv.addMouseMotionListener(this);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new GameMain();
	}
	public void change()
	{
		for(int i=0;i<=8;i++)
		{
			try
			{
				gv.setImage("my_0"+i);
				Thread.sleep(10);
			}catch(Exception ex) {}
		}
		gv.setImage("my_00");
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==this)
		{
			switch(e.getKeyCode())
			{
				case KeyEvent.VK_RIGHT:
				{
					new Thread(this).start();
					//change();
					gv.x+=5;
					if(gv.x>1024)
						gv.x=0;
					repaint();
				}
				break;
				case KeyEvent.VK_LEFT:
				{
					new Thread(this).start();
					//change();
					gv.x-=5;
					if(gv.x<0)
						gv.x=1024;
					repaint();
				}
				break;
				case KeyEvent.VK_UP:
				{
					new Thread(this).start();
					//change();
					gv.y-=5;
					if(gv.y<0)
						gv.y=900;
					repaint();
				}
				break;
				case KeyEvent.VK_DOWN:
				{
					new Thread(this).start();
					//change();
					gv.y+=5;
					if(gv.y>900)
						gv.y=0;
					repaint();
				}
				break;
			}
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==gv)
		{
			gv.x=e.getX();
			gv.y=e.getY();
			repaint();
		}
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		if(e.getSource()==gv)
		{
			gv.x=e.getX();
			gv.y=e.getY();
			repaint();
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<9;i++)
		{
			gv.setImage("my_0"+i);
			try
			{
				Thread.sleep(10);
			}catch(Exception ex) {}
			repaint();
		}
		gv.setImage("my_00");
	}
}
