package java101;

import java.util.Locale;
import java.util.Scanner;

public class GroceryCalculator {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);
		double pear;
		double apple;
		double tomatoe;
		double banana;
		double eggplant;
		double total;
		
		
		System.out.println("Please enter the pear: ");
		pear=scanner.nextDouble();
		System.out.println("Please enter the apple: ");
		apple=scanner.nextDouble();
		System.out.println("Please enter the tomatoe: ");
		tomatoe=scanner.nextDouble();
		System.out.println("Please enter the banana: ");
		banana=scanner.nextDouble();
		System.out.println("Please enter the eggplant: ");
		eggplant=scanner.nextDouble();
		
		scanner.close();
		
		total=pear*2.14+apple*3.67+tomatoe*1.11+banana*0.95+eggplant*5.00;
		
		System.out.println("Toplam Tutar: " + total+" TL");
		
			}
	}
