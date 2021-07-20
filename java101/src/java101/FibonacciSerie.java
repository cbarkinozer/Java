package java101;

import java.util.Scanner;

public class FibonacciSerie {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int n1 = 0, n2 = 1, n3, i, n;
		
		System.out.print("N Sayýsýný Girin:");
		n = scanner.nextInt();
		scanner.close();
		System.out.print(n1 + " " + n2);
		
		// Döngü 2 den baþlýyor çünkü ilk 2 terim 0 ve 1 her zaman yazýlacak
		for (i = 2; i < n; ++i) {
			n3 = n1 + n2;
			System.out.print(" " + n3);
			n1 = n2;
			n2 = n3;
		}
		System.out.println();
	}
}
