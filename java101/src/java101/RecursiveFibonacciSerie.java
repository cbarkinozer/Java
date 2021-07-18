package java101;

import java.util.Scanner;

public class RecursiveFibonacciSerie {
	static int fibonacci(int n) {
		if (n == 1 || n == 2) {
			return 1;
		}
		return fibonacci(n - 1) + fibonacci(n - 2);
	}

	public static void main(String[] args) {
		// 1 1 2 3 5 8 13 21
		// f(n) = f(n-1) + f(n-2)
		// f(6) = f(5) + f(4)
		// f(5) = f(4) + f(3)
		// f(4) = f(3) + f(2)
		// f(3) = f(2) + f(1)
		int num;
    	Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        num= scanner.nextInt();
        scanner.close();
		System.out.println(fibonacci(num));
	}
}
