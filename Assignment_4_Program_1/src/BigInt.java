//Assignment #4 Program 1
//Justin Yang
//2/9/14
//Much troll. 
 
import java.util.*;
import java.lang.*;
import java.io.*;
 

class BigInt
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
		String output = "";
		BigInteger first = new BigInteger("2000");
		BigInteger second = new BigInteger("9000");
		
		//first.Input();
		//second.Input();
		
		output = first.Add(second);
		
		System.out.println(output);
		
		
		//комментарий!
		//Forkbombed my VM trying to rewrite this program in x86 ASM
		
	}
}