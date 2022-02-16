/*
 Level:easy
 Have the function HappyNumbers(num) determine if a number is Happy, which is a number whose sum of the square of the digits eventually converges to 1.
 Return true if it's a Happy number, otherwise return false.

For example: the number 10 is Happy because 1^2 + 0^2 converges to 1.
Examples
Input: 1
Output: true
Input: 101
Output: false

1. For input 5525 the output was incorrect. The correct output is true

2. For input 5255 the output was incorrect. The correct output is true

3. For input 2555 the output was incorrect. The correct output is true

4. For input 5552 the output was incorrect. The correct output is true

*/
import java.util.*; 
import java.io.*;

class Main {

  public static Boolean HappyNumbers(int num) {
    int count=0;
    int tempInt=0;
    String temp = String.valueOf(num);
    for(int i=0;i<temp.length();i++){
      tempInt= Integer.parseInt(String.valueOf(temp.charAt(i)));
      count += Math.pow(tempInt,2);
      tempInt=0;
    }
    if(count==1){
      return true;
    }  
    return false;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(HappyNumbers(s.nextLine())); 
  }

}
