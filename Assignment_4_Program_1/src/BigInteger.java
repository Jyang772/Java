import java.util.ArrayList;
import java.util.Scanner;


public class BigInteger {

	private ArrayList<Integer> Lawl = new ArrayList<Integer>();
	String input = "";
	
	public void Input()

	{
		Scanner fooBar = new Scanner(System.in);
		System.out.println("Enter a large number: ");
		input = fooBar.next();
		
		int a = input.length()-1;
		for(int i=input.length(); i > 0; i--)
		{	Lawl.add(input.charAt(a) - '0');
			a--;
		}
		
	}
	
	
	
	public ArrayList<Integer> getNum()
	{
		return Lawl;
	}
	
	

	public String Add(BigInteger a)
	{
		
		String output = "";
		ArrayList<Integer> Lawl2 = new ArrayList<Integer>();
		ArrayList<Integer> Second = a.getNum();
		
		int z = 0;
		for(int i=0; i < input.length(); i++)
		{
			if((Second.get(i) + this.Lawl.get(i) + z) >= 10)
			{	
			
				Lawl2.add(Second.get(i) + this.Lawl.get(i) + z - 10);
				z = 1;
				if(i == input.length()-1)
				Lawl2.add(1);
			}
			else
			{ 
			 Lawl2.add(Second.get(i) + this.Lawl.get(i) + z);
			 z = 0;
			}
		}
		
		for(int i=Lawl2.size() - 1; i >=0; i--)
			output += Lawl2.get(i).toString();
		
		return output;

	}
}
