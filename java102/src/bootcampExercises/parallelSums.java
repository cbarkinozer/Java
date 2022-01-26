/*
level:HARD
 Have the function ParallelSums(arr) take the array of integers stored in arr which will always contain an even amount of integers, and determine how they can be
 split into two even sets of integers each so that both sets add up to the same number. If this is impossible return -1. If it's possible to split the array into two sets,
 then return a string representation of the first set followed by the second set with each integer separated by a comma and both sets sorted in ascending order.
 The set that goes first is the set with the smallest first integer.

For example: if arr is [16, 22, 35, 8, 20, 1, 21, 11], then your program should output 1,11,20,35,8,16,21,22
Examples
Input: new int[] {1,2,3,4}
Output: 1,4,2,3
Input: new int[] {1,2,1,5}
Output: -1
*/

import java.util.*; 
import java.io.*;

class Main {

  public static int ParallelSums(int[] arr) {
    // code goes here  
    return arr[0];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ParallelSums(s.nextLine())); 
  }

}
