import java.util.ArrayList;
import java.util.Scanner;


public class BigInteger {

	private ArrayList<Integer> lawl;
	String input;



public BigInteger(String s) {
	lawl = new ArrayList<Integer>();
	input = s;
	
	
	int a = input.length()-1;
	for(int i=input.length(); i > 0; i--)
	{ lawl.add(input.charAt(a) - '0');
		a--;
	}
	}




	
	
	public ArrayList<Integer> getNum()
	{
		return lawl;
	}
	
	

	public String Add(BigInteger a)
	{
		
		String output = "";
		ArrayList<Integer> lawl2 = new ArrayList<Integer>();
		ArrayList<Integer> second = a.getNum();                 //Returns the BigInteger objects ArrayList
		
		int z = 0;
		for(int i=0; i < input.length(); i++)
		{
			if((second.get(i) + this.lawl.get(i) + z) >= 10)
			{	
			
				lawl2.add(second.get(i) + this.lawl.get(i) + z - 10);
				z = 1;
				if(i == input.length()-1)
				lawl2.add(1);
			}
			else
			{ 
			 lawl2.add(second.get(i) + this.lawl.get(i) + z);
			 z = 0;
			}
		}
		
		for(int i=lawl2.size() - 1; i >=0; i--)
			output += lawl2.get(i).toString();
		
		return output;

	}
}
