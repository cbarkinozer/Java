package java101;

import java.util.Scanner;

public class PasswordChecker {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String username,password,select,tempPassword;
		
		
		System.out.println("Please enter username: ");
		username=scanner.nextLine();
		
		System.out.println("Please enter password: ");
		password=scanner.nextLine();
		
		
		if( (username.equals("patika")) &&(password.equals("java")) ) {
			System.out.println("You are logged in ");
		}else {
			System.out.println("Incorrect info");
			System.out.println("Would you like to change your password? yes/no");
			select=scanner.nextLine();
			if(select.equals("yes")) {
				System.out.println("Please insert your new password");
				tempPassword=scanner.nextLine();
				if(tempPassword.equals(password)) {
					System.out.println("Your password can not be same with your previous password");
				}else {
					password= tempPassword;
					tempPassword="";
					System.out.println("You have successfully changed your password");
				}
			}
			
		}
		
		
		scanner.close();
		}
}
