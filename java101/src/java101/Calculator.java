package java101;

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double input1=0,input2=0;
		int select;
		
		
		System.out.println("Please enter number 1:");
		input1=scanner.nextDouble();
		
		System.out.println("Please enter number 2:");
		input1=scanner.nextDouble();
		
		System.out.println("Please select operation:");
		System.out.println("1:ADD\n2:DELETE\n3:MULTIPLY\n4:DIVIDE\n");
		select=scanner.nextInt();
		
		scanner.close();
		
		switch(select) {
		case 1:
			System.out.println(input1+input2);
			break;
		case 2:
			System.out.println(input1-input2);
			break;
		case 3:
			System.out.println(input1*input2);
			break;
		case 4:
			if(input2!=0) {
				System.out.println(input1/input2);
			}else {
				System.out.println("You can not divide a value with zero");
			}
			break;
		default:
			System.out.println("You have select an invalid operation");
		}
		
		}
}
