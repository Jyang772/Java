
public class Cards {
	
	private int suit; 
	private int rank;
	
	
	public Cards(int r, int s)
	{
		rank = r;
		suit = s;
	}

	
	public String toString()
	{
		String value = "";
		switch(rank)
		{
		case 1: value = "ACE";
		break;
		case 2: value = "TWO";
		break;
		case 3: value = "THREE";
		break;
		case 4: value = "FOUR";
		break;
		case 5: value = "FIVE";
		break;
		case 6: value = "SIX";
		break;
		case 7: value = "SEVEN";
		break;
		case 8: value = "EIGHT";
		break;
		case 9: value = "NINE";
		break;
		case 10: value = "TEN";
		break;
		case 11: value = "JACK";
		break;
		case 12: value = "QUEEN";
		break;
		case 13: value = "KING";
		break;
		}
		value += " of ";
		
		switch(suit)
		{
		case 1: value += "SPADES";
		break;
		case 2: value += "HEARTS";
		break;
		case 3: value += "DIAMONDS";
		break;
		case 4: value += "CLUBS";
		break;
		}
		return value;
		
	}
		
		
	public int value()
	{
		if(rank > 10)
			rank = 10;
		return rank;
	}
	
	}
	

