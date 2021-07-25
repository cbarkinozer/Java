package adventureGame;

import java.util.Scanner;

public class Game {
	public Scanner input = new Scanner(System.in);
	public void start() {
		System.out.println("Welcome to the Adventure Game!");
		System.out.println("Enter your name:");
		//String playerName = input.nextLine();
		Player player = new Player("Barkýn");
		System.out.println("Welcome "+player.getName());
		System.out.println("Select a character:");
		player.selectCharacter();
	}
}
