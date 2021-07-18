package java101;

import java.util.Scanner;

public class PalindromeChecker {
	 static boolean isPalindrom(int number) {
	        int temp = number, reverseNumber = 0, mod;
	        
	        while (temp != 0) {
	            mod = temp % 10;
	            reverseNumber = (reverseNumber * 10) + mod;
	            temp /= 10;
	        }
	        return number == reverseNumber;
	    }

	    public static void main(String[] args) {
	        // 121 % 10 = 1, reverseNumber = 1, 121/10 = 12
	        // 12 % 10 = 2, reverseNumber = reverseNumber * 10 + 2 = 12, 12/10 = 1
	        // 1 % 10 = 1, reverseNumber = reverseNumber * 10 + 1= 121 , 1 / 10 = 0.1 = 0
	        int num;
	    	Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number: ");
	        num= scanner.nextInt();
	        scanner.close();
	        System.out.println(isPalindrom(num));
	    }
}
