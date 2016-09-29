import java.util.Calendar;
import java.util.Scanner;

public class Play
	{
		static String name;
		static int points = 0;
		public static void main(String[] args)
			{	
				Shuffle.shuffle();
				greeting();
				rules();
				keepPlaying();
			}
		public static void greeting(){
			Calendar cal = Calendar.getInstance();
			int hour = cal.get(Calendar.HOUR_OF_DAY);
			String phrase;
			if (hour < 12){
				phrase = "Good morning";
			} else if (hour < 17){
				phrase = "Good afternoon";
			} else {
				phrase = "Good evening";
			}
			Scanner userInput = new Scanner(System.in);
		    System.out.println(phrase + ", what is your name?");
		    name = userInput.nextLine();
		    System.out.println("Hello, " + name + "!");
		}
		public static void rules(){
			System.out.println("By typing \"Start\", " + name + ". You are demonstrating that you under stand the game rules and are ready to play!");
			Scanner userInput = new Scanner(System.in);
			String readyness = userInput.nextLine();
			if (readyness.equalsIgnoreCase("Start")){
				play();
			} else {
				System.out.println("");
			}
		}
		public static void play(){			
			System.out.println("Ok, " + name + ". Your card is " + Setdeck.deck.get(0).getFace() + " of " + Setdeck.deck.get(0).getSuit());
			int playerRank =  Setdeck.deck.get(0).getRank();
			Setdeck.deck.remove(0);
			System.out.println("You opponent's card is " + Setdeck.deck.get(0).getFace() + " of " + Setdeck.deck.get(0).getSuit());
			Setdeck.deck.remove(0);
			int computerRank =  Setdeck.deck.get(0).getRank();
			if (playerRank > computerRank){
				points++;
				System.out.println("Your card is bigger and you gain one point, " + name + ". :) You now have " + points + " points.");
			} else if (playerRank == computerRank){
				System.out.println("You and your opponent tied. Nothing happens to your points. You now have " + points + " points.");
			} else {
				points--;
				System.out.println("Your opponent's card is bigger, so you lose one point, " + name + ". :( You now have " + points + " points.");
			}									
		}
		public static void keepPlaying(){
			System.out.println(name + ", do you want to keep playing? (Type \"Yes\" or \"No\")");
			Scanner userInput = new Scanner(System.in);
			String keepPlaying = userInput.nextLine();
			if (keepPlaying.equalsIgnoreCase("Yes")){
				play();
			} else if (keepPlaying.equalsIgnoreCase("No")){
				System.out.println("Thanks for playing, " + name + ". Hope to see you soon, bye!");
				System.exit(0);
			} else {
				System.out.println("Illegal input! Please type \"Yes\" or \"No\", " + name + ".");
				keepPlaying();
			}
		}
	}
