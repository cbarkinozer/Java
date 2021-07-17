package java101;

import java.util.Scanner;

public class FlightTicketCalculator {

public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		double costPerKm=0.10;
		int flightType;
		int age;
		double distanceKm;
		double cost=0;
		
		System.out.println("Please enter the flight type km:");
		distanceKm=scanner.nextDouble();
		
		System.out.println("Please enter age:");
		age=scanner.nextInt();
		
		System.out.println("Please enter the distance km(1 => One-way , 2 => Two-way ):");
		flightType=scanner.nextInt();
		scanner.close();
		
		
		
		
		cost = distanceKm * costPerKm ;
		
			if(flightType==1) {
				if(age<12) {
					cost = cost *0.5;
				}else if(age>=12&&age<=24) {
					cost = cost *0.1;
				}else if(age>65) {
					cost = cost *0.3;
				}
			}else if(flightType==2) {
				if(age<12) {
					cost = cost *0.5;
				}else if(age>=12&&age<=24) {
					cost = cost *0.2;
				}else if(age>65) {
					cost = cost *0.3;
				}
				
			}
		
		
		
		
		
		if(age<=0 || distanceKm<= 0 || (flightType!=1 && flightType!=2) ) {
				System.out.println("Hatalý Veri Girdiniz !");
		}else {
			System.out.println("Toplam Tutar =  " + cost+ " TL");
		}
		
		
		
		}
}
