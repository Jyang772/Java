//Assignment 5 Program 2
//Justin Yang
// 2-24-2014


import java.applet.*;
import java.awt.*;


public class TehOPTrianglez extends Applet{
	
	final static int serialversionint = 1;


	//Graphics window 'g'
	public void paint(Graphics g)
	{
		
	setBackground(Color.gray);
		
		int xmiddl = getSize().width / 2;
		int ymiddl = getSize().height / 2;
		
		
		;
		
		g.drawLine(0, 0, xmiddl, getSize().height);
	     for(int i=0; i < getSize().width; i+=15)
		{
	    	 g.setColor(Color.yellow);
			g.drawLine(i,0,xmiddl,getSize().height);
		}
		g.drawLine(0, 15, xmiddl, getSize().height);
		g.drawLine(getSize().width, 0, xmiddl, getSize().height);
		
		
				
	}
	
	

}