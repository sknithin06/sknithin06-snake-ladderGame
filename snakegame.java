package Java;
import java.util.Random;
import java.util.Scanner;
public class snakegame {
	public static final int playerWinningPosition = 100;
	public static void main(String[] args) { 
		System.out.println("Welcome to Snake & Ladder Game");
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter Starting position of the game: ");
		int  playerStartPosition = num.nextInt();
		System.out.println("Player Starting Position is:"+playerStartPosition);
		
		Random dice = new Random();
		int low = 1;
		int high = 7;
		int p = dice.nextInt(high-low) + low;
		System.out.println("Rolling the dice we get:"+p);
		
		int noPlay = 1;
		int Ladder = 2;
		int snakes = 0;
		int Players = 0;
		int Dices = dice.nextInt(high-low) + low;
		double randomCheck = Math.floor(Math.random() * 10) % 3;
		if (randomCheck == noPlay) {
			System.out.println("Player is at Same Position");
		}
		else if (randomCheck == Ladder) {
			Players = Players + Dices;
			System.out.println("Player move ahead by the  number of position received in the Dices is:"+Players);
		}
		else {
			Players = Players - Dices;
			System.out.println("Player move behind by the  number of position received in the Dices is:"+Players);
		}
		
		int playerstartPosition = playerStartPosition ;
		while (playerstartPosition < playerWinningPosition) {
			int diceRoll = dice.nextInt(high-low) + low;
			playerstartPosition = playerstartPosition + diceRoll;
			if (playerstartPosition < 0) {
				playerstartPosition = 0;
				System.out.println( "Dice Value is:" +diceRoll +  "Player Position Value is:" +playerstartPosition);
			}
			else {
				System.out.println("Dice Value is:" +diceRoll +  "Player Position Value is:" +playerstartPosition);
			}
		}
		
		int m = 0;
		int PlayerStartPosition = playerStartPosition ;
		while (PlayerStartPosition < playerWinningPosition) {
			int diceRoll = dice.nextInt(high-low) + low;
			m = m + 1;
			PlayerStartPosition = PlayerStartPosition + diceRoll;
			if (PlayerStartPosition < 100) {
				System.out.println("Dice Value is:" +diceRoll +  "Player Position Value is:" +PlayerStartPosition);
			}
			else if (PlayerStartPosition > 100) {
				PlayerStartPosition = PlayerStartPosition - diceRoll;
				System.out.println("Dice Value is:" +diceRoll +  "Player Will be in the Same Position is:" +PlayerStartPosition);
			}
			else if (PlayerStartPosition == 100) {
				System.out.println("Dice Value is:" +diceRoll +  "Player As Reached the Winning Position is:" +PlayerStartPosition);
			}
		}
	}
}
