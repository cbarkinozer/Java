package java101;
import java.util.Scanner;

public class KdvCalculator {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	double input=0;
	double output=0.0;
	double kdv;
	
	System.out.println("Please enter the cost of your product:");
	input=scanner.nextInt();
	scanner.close();
	
	if(input<=1000 & input>0 ) {
		kdv=input*0.18;
		output += input +kdv;
		
	}else {
		kdv=input*0.08;
		output += input +kdv;
	}
	System.out.println("You have to pay: " + output+"The kdv cost: "+kdv);
	
	}
}
