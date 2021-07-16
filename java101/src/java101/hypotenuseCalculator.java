package java101;
import java.util.Scanner;

public class hypotenuseCalculator {
	public static void main(String[] args) {
		int a,b;
		double c,u;
		double area;
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a");
		a= scanner.nextInt();
		
		System.out.println("Enter b");
		b= scanner.nextInt();
		scanner.close();
		
		c=Math.sqrt(a*a+b*b);
		System.out.println("Third side of your triangle: "+c);
		
		u=(a+b+c)/2;
		area=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		System.out.println("Area of your triangle: "+area);
	}
}
