package adventureGame;

public class SafeHouse extends NormalLocation{

	public SafeHouse(Player player, String name) {
		super(player, "Safe House");
	}
	
	@Override
	public boolean onLocation(){
		System.out.println("You are in the Safe House.");
		System.out.println("Your health is full now.");
		return true;
	}

}
