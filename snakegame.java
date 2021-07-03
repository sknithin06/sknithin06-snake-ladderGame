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
		System.out.println("Number of Times the Dice is Rolled:" +m);
		
		int Player1 = playerStartPosition ;
		int Player2 = playerStartPosition ;
		int countPlayer = 0;
		while (Player1 < playerWinningPosition && Player2 < playerWinningPosition ) {
			int dicePlayer1 = dice.nextInt(high-low) + low;
			int dicePlayer2 = dice.nextInt(high-low) + low;
			countPlayer = countPlayer + 1;
			Player1 = Player1 + dicePlayer1;
			Player2 = Player2 + dicePlayer2;
			if (Player1 < 100 && Player2 < 100) {
				System.out.println("Dice Value of the Player1:" +dicePlayer1 +  "Position of the Player1 is:" +Player1);
				System.out.println("Dice Value of the Player2:" +dicePlayer2 +  "Position of the Player2 is:" +Player2);
			}
			else if (Player1 > 100) {
				Player1 = Player1 - dicePlayer1;
				System.out.println("Dice Value of the Player1 is:" +dicePlayer1 +  "Player1 Will be in the Same Position is:" +Player1);
			}
			else if (Player2 > 100) {
				Player2 = Player2 - dicePlayer2;
				System.out.println("Dice Value of the Player2 is:" +dicePlayer2 +  "Player1 Will be in the Same Position is:" +Player2);
			}	
			else if (Player1 == 100 || Player2 == 100) {
				if (Player1 == 100) {
				System.out.println("Dice Value of the Player1 is:" +dicePlayer1 +  "Player1 is Winner  is:" +Player1);
				}
				else {
				System.out.println("Dice Value of the Player2 is:" +dicePlayer2 +  "Player2 is  Winner is:" +Player2);
				}
			}
		}
	}
}
