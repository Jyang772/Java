//Assignment #3 
//Program 2
//Deck.Java

//Justin Yang 


import java.util.ArrayList;
import java.util.Collections;


public class Deck {

	ArrayList<Cards> cardlist = new ArrayList <Cards>();
	int top = 0;
	
	
	public void populate()
	{
		for(int s=1; s<=4; s++)
		{
			for(int r = 1; r <= 13; r++)
			{
				Cards c = new Cards(r,s);
				cardlist.add(c);
				//System.out.println(c);
			}
		}
	}
	
	public void shuffle()


	{
		Collections.shuffle(cardlist);
		//System.out.println("\n\nShuffled deck: ");
		
		/**
		 * for(int i=0; i<52; i++)
			{
			System.out.println(cardlist.get(i));
			}**/
	}

	public Cards deal()
	{
		Cards c = cardlist.get(top);
		cardlist.remove(top);
		return c;
	}
}