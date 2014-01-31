import java.util.Arrays;


public class RomanNumeral {

	private int decimal;
	private String roman;
	
	public RomanNumeral(String string) {
		setRoman(string);
	
	}

	public RomanNumeral() {
		decimal = 1;
		roman = "I";
		
	}

	public void setRoman(String r)
	{
		decimal = 0;
	roman = r;
	}
	
	public int decimalValue()
	{
		decimal = 0;
		for(int i=0; i<roman.length(); i++)
		{
			if(roman.charAt(i) == 'I' && roman.length() > 1)
			decimal++;
			else if(roman.charAt(i) == 'V')
				decimal += 5;
			else if(roman.charAt(i) == 'X')
				decimal += 10;
			else if(roman.charAt(i) == 'L')
				decimal += 50;
			else if(roman.charAt(i) == 'C')
				decimal += 100;
			else if(roman.charAt(i) == 'D')
				decimal += 500;
			else if(roman.charAt(i) == 'M')
				decimal += 1000;
		}
		return decimal;
	}
	
	public String romanValue()
	{
		return roman;
	}
	
	public boolean equalTo(String r)
	{
		    char[] arr = r.toCharArray();
		    char[] arr1 = roman.toCharArray();
		    Arrays.sort(arr);
		    Arrays.sort(arr1);
		  
		    
		return (Arrays.equals(arr, arr1));
		
	}
	
	public void increment()
	{
		decimal++;
		roman += "I";
	}
}





