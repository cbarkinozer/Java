package adventureGame;

import java.util.Scanner;

public class Game {
	public Scanner input = new Scanner(System.in);

	public void start() {

		System.out.println("Welcome to the Adventure Game!");
		System.out.println("Enter your name:");

		// String playerName = input.nextLine();
		Player player = new Player("Barkýn");

		System.out.println("Welcome " + player.getName());
		System.out.println("Select a character:");
		player.selectCharacter();

		Location location = null;

		while (true) {
			System.out.println();
			System.out.println("-----AREA-----");
			System.out.println("Select the location you want to go: ");
			System.out.println("1_ SafeHouse: No enemies, you can heal. ");
			System.out.println("2_ ToolStore: You can buy armour and weapon. ");
			int selectLocaiton = input.nextInt();
			switch (selectLocaiton) {
			case 1:
				location = new SafeHouse(player);
				break;
			case 2:
				location = new ToolStore(player);
				break;
			default:
				location = new SafeHouse(player);
			}
			
			if(!location.onLocation()) {
				System.out.println("Game Over!");
				break;
			}
		}

	}
}
