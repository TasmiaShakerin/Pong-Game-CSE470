package View;

import Model.*;
import Controller.*;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

public class PongView {
	int Wid=0;
	int Hei=0;
	int ballx=0;
	int bally=0;
	int Paddle1y=0;
	int Paddle2y=0;
	Image backbuffer;
	int sc=0;
	
	
	public PongView(int w,int h,int x,int y, int paddle1y, int paddle2y, int score,Image backbuff){
		Wid=w;
		Hei=h;
		ballx=x;
		bally=y;
		Paddle1y=paddle1y;
		Paddle2y=paddle2y;
		sc=score;
		backbuffer=backbuff;
	}
	 public Image paint(Graphics g)
	    {
	        
	        Graphics bg = backbuffer.getGraphics();
	        bg.setColor(Color.blue);
	        bg.fillOval(ballx, bally, 10, 10);                    

	        Graphics gg = backbuffer.getGraphics();
	        gg.setColor(Color.red);
	        gg.fillRect(75, Paddle1y, 10, 100);     
	        gg.fillRect(725, Paddle2y, 10, 100);

	        Graphics fg = backbuffer.getGraphics();
	        fg.setColor(new Color(0, 255, 0) );
	        fg.drawString("" + sc, 400, 50);

	        return backbuffer;
	    }

}
