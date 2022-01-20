/*
Level: EASY
Have the function SwapCase(str) take the str parameter and swap the case of each character. For example: 
if str is "Hello World" the output should be hELLO wORLD. Let numbers and symbols stay the way they are.
*/

import java.util.*; 
import java.io.*;

class Main {

  public static String SwapCase(String str) {
    StringBuffer sBuffer = new StringBuffer();
    Character c;
    for(int i=0;i<str.length();i++){
      c=str.charAt(i);
      if(Character.isUpperCase(c)){
        sBuffer.append(Character.toLowerCase(c));
      }else if(Character.isLowerCase(c)){
        sBuffer.append(Character.toUpperCase(c));
      }else{
        sBuffer.append(c);
      }
    } 
    return sBuffer.toString();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SwapCase(s.nextLine())); 
  }

}
