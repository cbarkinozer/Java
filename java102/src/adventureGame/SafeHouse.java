package adventureGame;

public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player) {
		super(player,"SafeHouse");
	}
	
	@Override
	public boolean onLocation(){
		System.out.println();
		System.out.println("-----SAFE HOUSE-----");
		System.out.println("You are in the Safe House.");
		System.out.println("Your health is full now.");
		return true;
	}

}
