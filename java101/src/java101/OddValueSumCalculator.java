package java101;

import java.util.Scanner;

public class OddValueSumCalculator {
	public static void main(String[] args) {
		 
		int num,sum=0;
		
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("Please enter an number: ");
			num=scanner.nextInt();
			if(num%4==0&&num%2==0) {
				sum+=num;
			}
		}while(num%2==1);
		
		 
		 scanner.close();
		 System.out.println("Result: "+sum);
	}
}
