package java101;

import java.util.Scanner;

public class LeapYearCalculator {
	public static void main(String[] args) {
		 
		int year;
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Please enter a year: ");
		 year=scanner.nextInt();
		
		 scanner.close();
		if(year%4==0 && year%100!=0) {
			System.out.println("It is a leap year. ");
		} else if(year%100==0 && year%400==0) {
			System.out.println("It is a leap year. ");
		}else {
			System.out.println("It is not a leap year. ");
		}
		 
	}
}
