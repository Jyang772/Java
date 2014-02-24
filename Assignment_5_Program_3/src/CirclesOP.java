//Assignment 5 Program 3
//Justin Yang
// 2-24-2014


import java.applet.Applet;
import java.awt.*;


public class CirclesOP extends Applet {


	public void paint(Graphics g)
	{

		int xmiddle = getSize().width;
		int ymiddle = getSize().height;
		int x = 0;
		int y = 0;
		
		
		Color Blue = new Color(0,0,255);    //Blue : 0-0-255
		Color Yellow = new Color(255,255,0);  //Yellow : 255-255-0
		
		
		for(int i=0; i <= 5; i++)
		{
			
			if(i % 2 == 0)
				g.setColor(Blue);
			else
				g.setColor(Yellow);
			
			g.fillOval(x, x, getSize().width-(2*x), getSize().height-(2*y));
			
			x += 25;
			y += 25;
		}
		
	

		
		
	}
	
	
	

}
