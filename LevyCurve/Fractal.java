

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JOptionPane;

public class Fractal extends JPanel{

	private double length;

	private static final long serialVersionUID = 1L;
public int numLevels;

 public void paintComponent(Graphics g) {
	 
	 g.setColor(Color.black);
	  System.out.println("Drawing");
	  Point from = new Point(150,200);
	  Point to = new Point(450,200);
	  length = 0;
	
  drawFractalLine(g,from,to,numLevels);
  
 }
 
 
 
 public void drawFractalLine(Graphics g, Point from, Point to, int level) {
	 if (level == 0) {
		  System.out.println("In level 0");
	   g.drawLine(from.getX(), from.getY(), to.getX(), to.getY());
	  // length += from.getVectorTo(to).getMagnitude();
	      System.out.println("Line: " + from + "  " + to);
	   return;
	  }
	  System.out.println("Level: " + level);
	  Point mid = from.getMidPoint(to);
	  System.out.println("Mid: " + mid);
	  Vector delta = from.getVectorTo(to);
	  System.out.println("delta: " + delta);
	  delta = delta.getPerpendicularRight();
	  System.out.println("delta: " + delta);
	  delta = delta.multiplyBy(0.5); //half its magnitude
	  System.out.println("delta: " + delta);

	  mid = mid.addVector(delta);
	  System.out.println("mid: " + mid);
	  System.out.println("Before:");
	  drawFractalLine(g,from,mid,level-1);        //1st draw function
	  System.out.println("Returned to 1st(" + level + "): ");
	  System.out.println("Entering Second: ");
	  drawFractalLine(g,mid,to,level-1);          //2nd draw function
	  System.out.println("Returned to 2nd(" + level + "): ");
	 // System.out.println("After: "); 
	 }
 
 /**
  * @param args
  */
 public static void main(String[] args) {
  JFrame frame = new JFrame("Fractal Curve");
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  Fractal panel = new Fractal();

  frame.add(panel);
  frame.setSize(600,600);
  frame.setVisible(true);
  try {
   do {
   String userInput = JOptionPane.showInputDialog("How Many Levels?");

    panel.numLevels = Integer.parseInt(userInput);
    frame.repaint(); //don't forget to re-paint it !
   } while (true);
  } catch (NumberFormatException e) {
   //ignore it, just exit program
   //System.exit(0);
  }
 }
}

