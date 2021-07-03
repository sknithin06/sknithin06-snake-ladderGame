package Java;
import java.util.Scanner;
public class snakegame {
	public static void main(String[] args) { 
		System.out.println("Welcome to Snake & Ladder Game");
		
		Scanner num = new Scanner(System.in);
		System.out.print("Enter Starting position of the game: ");
		int  playerStartPosition = num.nextInt();
		System.out.println("Player Starting Position is:"+playerStartPosition);
	}
}
