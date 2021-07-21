package java101;

import java.util.Scanner;

public class PalindromeWordChecker {
	static boolean isPalindrome(String str) {
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

	// Another implementation way
	static boolean isPalindrome2(String str) {
		String reverse = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			reverse += str.charAt(i);
		}

		if (str.equals(reverse))
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		String word;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the word: ");
		word = scanner.nextLine();
		scanner.close();
		System.out.println(isPalindrome(word));
	}
}
