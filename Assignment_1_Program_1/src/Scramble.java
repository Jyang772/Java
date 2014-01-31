//Justin Yang
//Assignment_1_Program_1
//1/20/14

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;



public class Scramble {

	final static int SIZE = 5;
	public static void main(String[] args) {
		
		System.out.println("Welcome to Word Unscramble!");
		System.out.println("To win, you must successfully unscramble the letters to make a word.");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("\nAt anytime you may enter 'hint' for a hint or 'bye' to exit the game.");


		Play();

	}
	
	public static String scramble(String word) {
		String newword = "";
		int random;
		Random randGen = new Random();
		boolean letter[] = new boolean[word.length()];
		do {
			random = randGen.nextInt(word.length());
			if (letter[random] == false) {                    //Keeps track of which letters have already been selected
				newword = newword + word.charAt(random);
				letter[random] = true;
			}
		} while (newword.length() < word.length());
		return newword;
	}
	
	public static void Play()
	{
		boolean done = false;
		String [][] words =	{
				{"Penguin", "Bird"}, 
				{"Pizza", "Food"}, 
				{"LawL", "Troll"}
				};
		
		String [] scramble = new String [SIZE];
		

		for(int i=0; i < words.length; i++)
		{
			scramble[i] = words[i][0];
			scramble[i] = scramble(scramble[i]);
			System.out.println(words[i][0]);
		}
			
			
		
		do{
			int random;
			String guess;
			Random randGen = new Random();
			random = randGen.nextInt(words.length);
			
			boolean game = false;
			do{
				System.out.println("The scrambled word is: " + scramble[random]);
			
			Scanner fooBar = new Scanner(System.in);
			
			System.out.println("What is this word?: ");
			guess = fooBar.next();
			
			if(guess.toLowerCase().equals("hint"))
			{
				System.out.println(words[random][1]);
			}
			
			else if(guess.toLowerCase().equals("quit"))
			{
				System.out.println("Thanks for playing!");
				game = true;
				done = true;
			}
			else if(guess.equals(words[random][0]))
			{
				System.out.println("Congratulations, you have guessed correctly!");
				game = true;
			}
			else
				System.out.println("Sorry, that is not it.");
			
			
			
			}while(game == false);
			
			
			
		}while(done == false);
		
		
	}
}
