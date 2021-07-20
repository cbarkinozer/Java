package java101;

import java.util.Scanner;

public class GcdLcmCalculator {
	public static void main(String[] args) {
		int n1,n2;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter n1");
		n1=scanner.nextInt();
		System.out.println("Enter n2");
		n2=scanner.nextInt();
		scanner.close();
		int ebob=1;
		for(int i=1;i<=n1;i++) {
			if(n1%i==0&&n2%2==0) {
				System.out.println(i);
			}
		}
		for(int k=n1;k>=1;k--) {
			if(n1%k==0&&n2%k==0) {
				ebob=k;
				System.out.println("Ebob: "+ ebob);
				break;
			}
		}
		System.out.println("Ekok: "+((n1*n2) / ebob));
		
		
	}
}
