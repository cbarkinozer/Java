package insuranceManagementSystem;

import java.util.ArrayList;

public abstract class Account {
	private User user = new User();
	public ArrayList<Insurance>insuranceList;
	
	public Account(User user) {
		super();
		this.user = user;
	}
	
	public final void showUserInfo() {
		System.out.println(user.getName()+user.getSurname()+user.getAge()+user.getEmail()+user.getJob());
	}
	
}
