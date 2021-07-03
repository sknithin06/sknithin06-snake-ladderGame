package Java;
import java.util.Random;
import java.util.Scanner;
public class snakegame {
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
	}
}
