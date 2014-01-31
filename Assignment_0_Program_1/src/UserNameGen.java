//Justin Yang
//Assignment 0 
//Program #1
// 1/14/14

//Hello

//Troll


import java.util.Scanner;
import java.util.Random; 


public class UserNameGen {

	public static void main(String[] args) {
		
		String firstName = "", lastName = "", userName="";
		boolean done = false;
		
		System.out.println("Enter your first name: ");
		
		Scanner fooBar = new Scanner(System.in);
		firstName = fooBar.next();
		
		System.out.println("Enter your last name: ");
		lastName = fooBar.next();
		
		do{
		
			if(lastName.length() < 5)
		{	
				System.out.println("Enter your last name: ");
				lastName = fooBar.next();
		}
			else
				done = true;
		
		}while(done == false);
			
			
		Random ran = new Random();
		int x = ran.nextInt(99) + 10;
		
		userName = firstName.substring(0,1) + lastName.substring(0,4) + x;
		
		
		
		
		System.out.println("Your username: " );
		System.out.println(userName);
		
		
		
		
		
		
		System.out.println("Done");
		

	}

}
