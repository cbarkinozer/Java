/*
Level: EASY
Consonant Count
Have the function ConsonantCount(str) take the str string parameter being passed and return the number of consonants the string contains.
Examples
Input: "Hello World"
Output: 7
Input: "Alphabets"
Output: 6

1. For input "Hewlett-Packard" the output was incorrect. The correct output is 10

2. For input "zz*" the output was incorrect. The correct output is 2

*/

import java.util.*; 
import java.io.*;

class Main {

  public static String ConsonantCount(String str) {
    str= str.replaceAll("[aeiou AEIOU]","");
    StringBuffer strbuff = new StringBuffer(str);
    int len = strbuff.length();
    return String.valueOf(len);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ConsonantCount(s.nextLine())); 
  }

}
