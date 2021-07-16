package java101;

import java.util.Scanner;

public class CircleCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double r;
		double area;
		double perimeter;
		
		
		System.out.println("Please enter the r: ");
		r=scanner.nextInt();
		scanner.close();
		
		perimeter= Math.PI*r*r;
		area= 2*r*Math.PI;
		
		System.out.println("Perimeter: " + perimeter+"Area: "+area);
		
		}
	}
