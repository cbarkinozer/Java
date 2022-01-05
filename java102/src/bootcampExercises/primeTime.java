/*
Level: Medium
Prime Time
Have the function PrimeTime(num) take the num parameter being passed and return the string true if the parameter is a prime number, otherwise return the string false. 
The range will be between 1 and 2^16(65536).
Examples
Input: 19
Output: true
Input: 110
Output: false
*/

import java.util.*; 
import java.io.*;

class Main {

  public static String PrimeTime(int num) {
    for(int i=2;i<num/2;i++){
      if(num % i==0){
        return "false";
      }
    }  
    return "true";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PrimeTime(s.nextLine())); 
  }

}
