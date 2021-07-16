package java101;

import java.util.Locale;
import java.util.Scanner;

public class BMICalculator {
public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.FRANCE);
		double height;
		double weight;
		double BMI;
		
		
		System.out.println("Please enter the height: ");
		height=scanner.nextDouble();
		System.out.println("Please enter the weight: ");
		weight=scanner.nextDouble();
		
		scanner.close();
		
		BMI=weight/(height*height);
		
		System.out.println("Your Body Mass Index: " + BMI);
		
		}
	}
