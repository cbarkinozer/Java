package adventureGame;

public class ToolStore extends NormalLocation {
	public ToolStore(Player player) {
		super(player, "ToolStore");
	}

	@Override
	public boolean onLocation() {
		System.out.println();
		System.out.println("-----TOOL STORE-----");

		System.out.println("Select: ");
		System.out.println("1_Weapons");
		System.out.println("2_Armours");
		System.out.println("Exit");
		int selectCase = Location.input.nextInt();
		while (selectCase < 1 || selectCase > 3) {
			System.out.println("Wrong input. Enter again.");
			selectCase = input.nextInt();
		}
		switch (selectCase) {
		case 1:

			printWeapon();
			break;
		case 2:
			printArmor();
			break;
		case 3:
			System.out.println("Come again!");
			return true;
		}
		return true;
	}

	public void printArmor() {
		System.out.println("-----Armors-----");
	}

	public void printWeapon() {
		System.out.println("-----Weapons-----");
		for(Weapon w:Weapon.weapons()) {
			System.out.println(w.getName()+": "+"Damage: "+w.getDamage()+"Price: "+w.getPrice());
		}
		System.out.println("Select a weapon:");
		int selectWeapon= input.nextInt();
		while (selectWeapon < 1 || selectWeapon > Weapon.weapons().length) {
			System.out.println("Wrong input. Enter again.");
			selectWeapon = input.nextInt();
		}
	}
}
