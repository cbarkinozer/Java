package java101;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MaxMinCalculator {
	
		public static void main(String[] args) {
			
			
			
			int number=0,tempValue;
			Scanner scanner = new Scanner(System.in);
			List<Integer> list=new ArrayList<Integer>();
			System.out.println("How many values will you enter?");
			number=scanner.nextInt();
			for(int i=1;i<=number;i++) {
				System.out.println("Enter the "+i+". value:");
				tempValue=scanner.nextInt();
				list.add(tempValue);
			}
			scanner.close();
			Collections.sort(list);
			
			//Note list.get(number) gives error because list starts from zero
			System.out.println("Max: "+list.get(number-1)+" Min: "+list.get(0));
			
		
		}
	}