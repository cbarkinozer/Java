package java101;

import java.util.Scanner;
public class HarmonicSeriesCalculator {
	
	    public static void main(String[] args) {
	    	double n,result=0;
	    	Scanner scanner = new Scanner(System.in);
	        System.out.println("N sayısını giriniz :");
	        n = scanner.nextDouble();
	        scanner.close();
	        
	        while (n > 0) {
	            result += (1 / n);
	            n--;
	        }

	        System.out.println(result);
	    }
	}
