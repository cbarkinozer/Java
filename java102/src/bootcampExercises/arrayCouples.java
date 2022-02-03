/*
level:Hard
Have the function ArrayCouples(arr) take the arr parameter being passed which will be an array of an even number of positive integers, and determine if each pair of integers, [k, k+1], [k+2, k+3], etc. in the array has a corresponding reversed pair somewhere else in the array. For example: if arr is [4, 5, 1, 4, 5, 4, 4, 1] then your program should output the string yes because the first pair 4, 5 has the reversed pair 5, 4 in the array, and the next pair, 1, 4 has the reversed pair 4, 1 in the array as well. But if the array doesn't contain all pairs with their reversed pairs, then your program should output a string of the integer pairs that are incorrect, in the order that they appear in the array.
For example: if arr is [6, 2, 2, 6, 5, 14, 14, 1] then your program should output the string 5,14,14,1 with only a comma separating the integers.
Examples
Input: new int[] {2,1,1,2,3,3}
Output: 3,3
Input: new int[] {5,4,6,7,7,6,4,5}
Output: yes
*/
import java.util.*; 
import java.io.*;

class Main {

  public static int ArrayCouples(int[] arr) {
    // code goes here  
    return arr[0];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ArrayCouples(s.nextLine())); 
  }

}
