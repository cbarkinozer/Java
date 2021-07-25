package adventureGame;

public class ToolStore extends NormalLocation {
	public ToolStore(Player player) {
		super(player,"ToolStore");
	}
	@Override
	public boolean onLocation() {
		System.out.println();
		System.out.println("-----TOOL STORE-----");
		
		System.out.println("Select: ");
		System.out.println("1_Weapons");
		System.out.println("2_Armours");
		System.out.println("Exit");
		int selectCase=Location.input.nextInt();
		while(selectCase<1||selectCase>3) {
			System.out.println("Wrong input. Enter again.");
		}
		return true;
	}
}
