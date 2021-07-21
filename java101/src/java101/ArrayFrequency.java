package java101;

import java.util.Arrays;

public class ArrayFrequency {
	public static void main(String[] args) {
		int[]intArray= {10,20,20,10,10,20,5,20};
		System.out.print("Array: "+Arrays.toString(intArray));
		
		
		 int [] frequency = new int [intArray.length];
		 int visited = -1;
		 for(int i = 0; i < intArray.length; i++){  
	            int count = 1;  
	            for(int j = i+1; j < intArray.length; j++){  
	                if(intArray[i] == intArray[j]){  
	                    count++;  
	                    //To avoid counting same element again  
	                    frequency[j] = visited;  
	                }  
	            }  
	            if(frequency[i] != visited)  
	                frequency[i] = count;  
	        }  
		 
		 System.out.println("\nFrequency: ");
		 for(int i = 0; i < frequency.length; i++){  
	            if(frequency[i] != visited)  
	                System.out.println(intArray[i]+" sayýsý "+ frequency[i]+" kere tekrar edildi. ");  
	        }  
	}
}
