/*
Level: EASY
Have the function PowerSetCount(arr) take the array of integers stored in arr, and return the length of the power set (the number of all possible sets) that can be generated.
For example: if arr is [1, 2, 3], then the following sets form the power set:
[]
[1]
[2]
[3]
[1, 2]
[1, 3]
[2, 3]
[1, 2, 3]
You can see above all possible sets, along with the empty set, are generated. Therefore, for this input, your program should return 8.
Examples
Input: new int[] {1, 2, 3, 4}
Output: 16
Input: new int[] {5, 6}
Output: 4
*/

import java.util.*; 
import java.io.*;
import java.lang.Math;

class Main {

  public static int PowerSetCount(int[] arr) {
    
    return (int)Math.pow(2,arr.length);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PowerSetCount(s.nextLine())); 
  }

}
