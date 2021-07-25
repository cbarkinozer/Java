package adventureGame;

import java.util.Scanner;

import adventureGame.GameCharacters.*;

public class Player {
	private int damage;
	private int health;
	private int money;
	private String name;
	private String characterName;
	private Scanner input = new Scanner(System.in);

	public Player(String name) {
		this.name = name;
	}

	public void selectCharacter() {

		GameCharacter[] characterList = { new Samurai(), new Archer(), new Knight() };

		System.out.println("----------------------");
		System.out.println("ID \t Name \t Damage Health Money");

		for (GameCharacter gameCharacter : characterList) {
			System.out.println(gameCharacter.getId()+
					"\t"+gameCharacter.getName() + ":   " +
					gameCharacter.getDamage() + "\t"+ 
					gameCharacter.getHealth() + "\t" +
					gameCharacter.getMoney());
		}
		System.out.println("----------------------");
		System.out.println("Enter a character: ");
		int selectCharacter = input.nextInt();
		switch (selectCharacter) {
		case 1:
			initializePlayer(new Samurai());
			break;
		case 2:
			initializePlayer(new Archer());
			break;
		case 3:
			initializePlayer(new Knight());
			break;
		default:
			initializePlayer(new Samurai());
		}

	}

	public void initializePlayer(GameCharacter gameCharacter) {
		this.setDamage(gameCharacter.getDamage());
		this.setHealth(gameCharacter.getHealth());
		this.setMoney(gameCharacter.getMoney());
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCharacterName() {
		return characterName;
	}

	public void setCharacterName(String characterName) {
		this.characterName = characterName;
	}

}
