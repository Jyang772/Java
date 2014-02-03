import java.util.ArrayList;
import java.util.Scanner;


public class BlackJackEngine {

	Deck deck = new Deck();
	boolean playerWon = false;
	
	ArrayList<Cards> playerHand = new ArrayList<Cards>();
	ArrayList<Cards> dealerHand = new ArrayList<Cards>();
	
	
	
	public void playGame()
	{
		playerHand.clear();
		dealerHand.clear();
		deck.populate();
		deck.shuffle();
		int value = 0;
		int dealervalue = 0;
		int playercount = 0;  //Just counts the indices of card in hand
		int dealercount = 0;
		boolean done = false;
		
		System.out.println("\tPlayer Hand of 2 cards: ");
		//Deal two cards:
		playerHand.add(deck.deal());
		playerHand.add(deck.deal());
		playercount += 2;
		//Display the two cards:
		System.out.println("\t" + playerHand.get(0));
		System.out.println("\t" + playerHand.get(1));

		//Dealer's cards:
		System.out.println("\nDealer's 1st card: facedown");
		dealerHand.add(deck.deal());
		dealerHand.add(deck.deal());
		dealercount += 2;
		System.out.print("Dealer's 2nd card: ");
		System.out.println(dealerHand.get(1));
		dealervalue += dealerHand.get(0).value() + dealerHand.get(1).value();
		
		
		//Display Hand Value!
		System.out.println("Player, your hand value is ");
		value = playerHand.get(0).value() + playerHand.get(1).value();
		System.out.println(playerHand.get(0).value()+playerHand.get(1).value()); 
		
		while(value < 21 && !done)
		{
			String hitorstay;
			System.out.println("Would you like to hit or stay?");
			Scanner fooBar = new Scanner(System.in);
			hitorstay = fooBar.next();
			
			if(hitorstay.equals("hit"))
			{	
				playercount++;
				playerHand.add(deck.deal());
				System.out.println("Card added: " + playerHand.get(2));
				value += playerHand.get(playercount-1).value();
				
				System.out.println("Player, your hand value is now: " + value);
				 if(value == 21)
				 {
					 System.out.println("Congrats! You have got a BlackJack!");
					 done = true;
					 playerWon = true;
				 }
				 else if(value >21)
				 {	System.out.println("You exceeded 21. You lose. Nuuuub");
				 done = true;
				 }
				 
			}
			else if(hitorstay.equals("stay"))
			{
				System.out.println("Player: With a hand value of " + value + " , the cards in your hand are: ");
				for(int i=0; i<playercount; i++)
				{
					System.out.println(playerHand.get(i));
				}
				
				System.out.println("Dealer: Hand value of " + dealervalue + " with cards:");
				for(int i=0; i < dealercount; i++)
				{
					System.out.println(dealerHand.get(i));
				}
				
				if(dealervalue == value)
					System.out.println("Player, you have tied with the dealer. ");
				if(dealervalue < value)
					playerWon = true;
				
				done = true;
				
			}
			
		}
		
		System.out.println("------Card Play Over------");
		
		
	}
	
	public void callWinner()
	{
		if(playerWon)
			System.out.println("Congratulations, you have won!! YEAH YEAH YEAH TEAM FORTRESS 2");
		else
			System.out.println("You are a statistical loser. Better 'luck' next time.");
	}
	
	
}
