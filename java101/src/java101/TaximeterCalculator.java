package java101;

import java.util.Scanner;

public class TaximeterCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double perKm=2.20;
		double distanceKm=0.0;
		double minimumCost=10.0;
		double cost;
		
		System.out.println("Please enter the the distance km:");
		distanceKm=scanner.nextInt();
		scanner.close();
		
		cost= minimumCost+distanceKm*perKm;
		
		cost=(cost<=20 )? 20:cost;
		
		System.out.println("You have to pay: " + cost);
		
		}
	}
