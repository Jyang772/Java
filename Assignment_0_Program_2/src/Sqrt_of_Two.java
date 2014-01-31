//Justin Yang
//Assignment #0
//Program #2
// 1/15/14


public class Sqrt_of_Two {

	public static void main(String[] args) {
		
		final double TOLERANCE = 5e-8;
		double x = 2;
		
		do{
			x = (x + 2/x) / 2;
			
			System.out.println(x);
		}while(Math.abs(x*x - 2) > TOLERANCE);
	}

}
