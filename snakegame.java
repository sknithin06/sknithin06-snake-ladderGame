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
		
	}
}
