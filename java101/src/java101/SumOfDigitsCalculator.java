package java101;

import java.util.Scanner;

public class SumOfDigitsCalculator {
	public static void main(String[] args) {
		 
		int number;
		int digit,sum=0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number:  ");
		number=scanner.nextInt();
		scanner.close();
		
		while(number > 0)  
		{  
		//finds the last digit of the given number    
		digit = number % 10;  
		//adds last digit to the variable sum  
		sum = sum + digit;  
		//removes the last digit from the number  
		number = number / 10;  
		}  
		
		System.out.println("Result:  "+sum);
		
		 
	}
}
