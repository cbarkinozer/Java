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

  public static Boolean isHappyNumber(int num) {
    int total =0;
   while(num>0){
    total += (num%10)*(num%10);
    num /=10;
   }
   if(total %10==1||total%10==9){
    return true;
   }
   return false;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(isHappyNumber(s.nextLine())); 
  }

}
