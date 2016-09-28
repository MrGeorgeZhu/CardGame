
public class Play
	{
		public static void main(String[] args)
			{
				Setdeck.generateDeck();
				for(int i = 0; i < 52; i++)
					{
						System.out.println(i + " = " + Setdeck.deck.get(i).getFace() + " of " + Setdeck.deck.get(i).getSuit() + " rank = " + Setdeck.deck.get(i).getRank());
					}
			}
	}
