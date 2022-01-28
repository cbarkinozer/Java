/*
 Level: EASY
Have the function TwoSum(arr) take the array of integers stored in arr, and determine if any two numbers (excluding the first element) in the array can sum up to the 
first element in the array. For example: if arr is [7, 3, 5, 2, -4, 8, 11], then there are actually two pairs that sum to the number 7: [5, 2] and [-4, 11].
Your program should return all pairs, with the numbers separated by a comma, in the order the first number appears in the array. Pairs should be separated by a space.
So for the example above, your program would return: 5,2 -4,11

If there are no two numbers that sum to the first element in the array, return -1
Examples
Input: new int[] {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}
Output: 6,11 10,7 15,2
Input: new int[] {7, 6, 4, 1, 7, -2, 3, 12}
Output: 6,1 4,3

Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 13 out of bounds for length 13
	at Main.TwoSum(Main.java:12)
	at Main.main(Main.java:33)

*/
import java.util.*; 
import java.io.*;

public class Main {

    public static String TwoSum(int[] arr) {
    int firstNum= arr[0];
    StringBuffer sBuffer = new StringBuffer();
    for(int i=1;i<arr.length-1;i++){
      for(int j=i+1;j<arr.length;j++){
        if(firstNum==(arr[i]+arr[j]) ){
          sBuffer.append(arr[i]);
          sBuffer.append(",");
          sBuffer.append(arr[j]);
          sBuffer.append(" ");
        }
      }
    }
    
    if(sBuffer.length()==0){
      return "-1";
    }else{
      return sBuffer.toString();
    }


  }
  public static void main (String[] args) {  
    // keep this function call here     
    int[] x= new int[] {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
    System.out.print(TwoSum(x)); 
  }

}
