package java101;

import java.util.Scanner;

public class CombinationCalculator {
	public static void main(String[] args) {
		 
		int n,r,nMinusR;
		int nFactorial=1,rFactorial=1,nMinusRFactorial=1;
		int total=1;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the value n for  Combination: C(n,r) ");
		n=scanner.nextInt();
		System.out.println("Enter the value r for  Combination: C(n,r) ");
		r=scanner.nextInt();
		scanner.close();
		
		nMinusR=n-r;
		
		for(int i=1;i<=n;i++) {
			nFactorial=nFactorial*i;
		}
		for(int i=1;i<=r;i++) {
			rFactorial=rFactorial*i;
		}
		for(int i=1;i<=nMinusR;i++) {
			nMinusRFactorial=nMinusRFactorial*i;
		}
		
		total=nFactorial/(rFactorial*(nMinusRFactorial));
		
		
		System.out.println("Factorial: "+total);
		
		 
	}
}
