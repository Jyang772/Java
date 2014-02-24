
public class Rectangle {

		private int width;
		private int length;
		
		public Rectangle()
		{
		  width = 1;
		  length = 1;
		}
		public Rectangle(int w, int l)
		{
			if(w == 0 || l == 0)
			{	w = 1;
				l = 1;
			}
			  
			  width = w;
			  length = l;
		}
		
		public double Area()
		{
			return	width * length;
		}
		
		public double Perim()
		{
			return	2* (width + length);
		}
	
	
}
