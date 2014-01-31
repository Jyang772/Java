
//LAWL


public class Fraction {
	
	private Double numerator;
	private Double denominator;
	private Double fraction;
	
	
	public Fraction(int i, int j) {
		
		numerator = (double) i;
		denominator = (double) j;
	
	}

	public Fraction() {
		numerator = 0.0;
		denominator = 1.0;
	
	}
	
	public double getValue()
	{
		fraction = numerator / denominator;
		return fraction;
	}
	
	public String toString()
	{
		String r = numerator + "/" + denominator;
		return  r;
	}
	
	public void setDenominator(double num)
	{
		denominator = num;
	}
	
	public void setNumerator(double num)
	{
		numerator = num;
	}
	
	public boolean equalTo(Fraction num)
	{
		return (fraction == num.fraction);
	}

	public void increment()
	{
		System.out.println("In increment");
		numerator += denominator;
	}
}
