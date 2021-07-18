package java101;

import java.util.Scanner;

public class PerfectNumberChecker {
	public static void main(String[]args) {
	int number,sum=0;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Please enter the number: ");
	number= scanner.nextInt();
	for(int i=1;i<number;i++) {
			if(number%i==0) {
				sum+=i;
			}
		}
	scanner.close();
	if(sum==number) {
		System.out.println(number+" is a perfect number.");
	}else {
		System.out.println(number+" is NOT a perfect number.");
	}
	
	}
	
}
