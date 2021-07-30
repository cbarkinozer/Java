package insuranceManagementSystem;

@SuppressWarnings("serial")
public class InvalidAuthenticationException extends Exception {
	public InvalidAuthenticationException(String message){
		super(message);
		System.out.println("Wrong email or/and password");
	}
}
