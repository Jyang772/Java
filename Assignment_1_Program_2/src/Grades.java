//Justin Yang
//Assignment_1_Program_2
//1/20/14

import java.util.Scanner;
import java.util.Arrays;


public class Grades {

	public static void main(String[] args) {
		
		double [] input = new double [10];
			
		System.out.println("Enter your 10 most recent grades");
		
		
		Scanner fooBar = new Scanner(System.in);
		
		for(int i=0; i < input.length; i++)
		{
			input[i] = fooBar.nextDouble();
		}
		
		Arrays.sort(input);
		
		System.out.println("Your lowest grade: " + input[0]);
		System.out.println("Your highest grade: " + input[input.length-1]);
		
		Average(input);
		
	}
	
	public static void Average(double [] input)
	{
		double total = 0;
		double average = 0;
		for(int i=0; i < input.length; i++)
		{
			total += input[i];
		}
		
		average = total / input.length;
		
		System.out.println("Your average grade: " + average);
		System.out.println("Grades above average: ");
		
		for(int i=0; i<input.length; i++)
		{
			if(input[i] > average)
				System.out.println(input[i]);
		}
	}

}
