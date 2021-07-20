package java101;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayMinMaxCalculator {
	public static void main(String[] args) {
		
		int value;
		
		Scanner scanner= new Scanner(System.in);
		System.out.println("Please enter a value: ");
		value=scanner.nextInt();
		scanner.close();
		
		int[] list = { 56, 34, 1, 8, 101, -2, -33 };

		int min = list[0];
		int max = list[0];

		for (int i : list) {
			if (value < min) {
				min = i;
			}
			if (value > max) {
				max = i;
			}
		}

		System.out.println("Dizi: " + Arrays.toString(list));
		System.out.println("Girilen Say�:  " + value);
		System.out.println("Girilen say�dan k���k en yak�n say� :" + min);
		System.out.println("Girilen say�dan b�y�k en yak�n say� :" + max);

	}
}
