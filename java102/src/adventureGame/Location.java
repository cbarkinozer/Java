package adventureGame;

import java.util.Scanner;

public abstract class Location {
	private Player player;
	private String name;
	public static Scanner input = new Scanner(System.in);
	//We could use protected too.
	//By doing this, it only gets created for one time.
	
	public Location(Player player, String name) {
		this.player = player;
		this.name = name;
	}
	
	abstract boolean onLocation();
	
	public Player getPlayer() {
		return player;
	}
	public void setPlayer(Player player) {
		this.player = player;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
