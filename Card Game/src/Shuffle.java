import java.util.Collections;
public class Shuffle
	{
		public static void shuffle(){
			Setdeck.generateDeck();
			Collections.shuffle(Setdeck.deck);		

		}	
//		for(int i = 0; i < 52; i++)
//			{
//				System.out.println(i + " = " + Setdeck.deck.get(i).getFace() + " of " + Setdeck.deck.get(i).getSuit() + " rank = " + Setdeck.deck.get(i).getRank());
//			}
//		for (Card c : Setdeck.deck)
//		{
//			System.out.println(c.getRank());
//		}
	}
