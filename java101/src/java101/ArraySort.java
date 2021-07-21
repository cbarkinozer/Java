package java101;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort {
	public static void main(String[] args) {
		int n;
		int input;
		Scanner scanner= new Scanner(System.in);
		System.out.print("Enter the length of the array: ");
		n=scanner.nextInt();
		int[]intArray= new int[n];
		System.out.println("Enter the elements of the array: ");
		for(int i=0;i<n;i++) {
			System.out.print("Enter the "+(i+1)+". element: ");
			input=scanner.nextInt();
			intArray[i]=input;
		}
		scanner.close();
		Arrays.sort(intArray);
		System.out.println("Sorted order: ");
		System.out.println(Arrays.toString(intArray));
	}
}
