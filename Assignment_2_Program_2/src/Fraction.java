//Justin Yang 
//Assignment #2 Program 2
//Updated for Assignment #3 Program 1
//1/20/14
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
	
	public Double getNum()
	{
		return numerator;
	}
	
	public Double getDen()
	{
		return denominator;
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

	public void reduce()
	{
		/**
		 while(numerator != 0) {
		      Double old_numerator = numerator;
		      numerator = denominator % numerator;
		      denominator = old_numerator;
		  }**/
		
		if(denominator % numerator == 0)
		{	
			denominator /= numerator;
			numerator /= numerator;
		}
		 
	}

	public Fraction add(Fraction x2) {
		
		Fraction n = new Fraction();
		n.numerator = numerator * x2.getDen() + denominator * x2.getNum();
		n.denominator = denominator * x2.getDen();
		return n;
		
		
	}

	public Fraction subtract(Fraction x2)
	{
		Fraction n = new Fraction();
		n.numerator = numerator * x2.getDen() - denominator * x2.getNum();
		n.denominator = denominator * x2.getDen();
		return n;
	}

	public Fraction multiply(Fraction x2)
	{
		Fraction n = new Fraction();
		n.numerator = numerator * x2.numerator;
		n.denominator = denominator * x2.denominator;
		return n;
	}

	public Fraction divide(Fraction x2)
	{
		Fraction n = new Fraction();
		if(getValue() > x2.getValue())
		{n.numerator = numerator * x2.denominator;
		n.denominator = denominator * x2.numerator;
		}
		return n;
	}
}
