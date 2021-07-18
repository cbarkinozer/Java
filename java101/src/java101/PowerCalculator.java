package java101;

import java.util.Scanner;

public class PowerCalculator {
	public static void main(String[] args) {
		 
		int num;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the edge value: ");
		num=scanner.nextInt();
		for(int i=1;i<=num;i*=4) {
			System.out.println(i);
		}
		for(int j=1;j<=num;j*=5) {
			System.out.println(j);
		}
		scanner.close();
		 
	}
}
