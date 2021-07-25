package adventureGame;

public class Player {
	private int damage;
	private int health;
	private int money;
	private String name;
	private String characterName;
	
	public void selectCharacter() {
		System.out.println();
		System.out.println("\t ID \t Damage Health Money");
		System.out.println("Samurai: 1 \t 5 \t 21 \t 15");
		System.out.println("Archer:\t 2 \t 7 \t 18 \t 20");
		System.out.println("Knight:\t 3 \t 8 \t 24 \t 5");
	}
	
	public Player(String name) {
		this.name = name;
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
