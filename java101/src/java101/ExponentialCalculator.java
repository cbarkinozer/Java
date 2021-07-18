package java101;

import java.util.Scanner;

public class ExponentialCalculator {
	public static void main(String[] args) {
		 
		int number,power;
		int result=1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number:  ");
		number=scanner.nextInt();
		System.out.println("Enter the power:  ");
		power=scanner.nextInt();
		scanner.close();
		
		
		
		for(int i=0;i<power;i++) {
			result*=number;
		}
		
		
		if(number<0||power<0||(number==0&&power==0)) {
			System.out.println("Error");
		}else {
			System.out.println("Factorial: "+result);
		}
		
		
		
		 
	}
}
