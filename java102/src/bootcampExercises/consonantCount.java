/*
Level: EASY
Consonant Count
Have the function ConsonantCount(str) take the str string parameter being passed and return the number of consonants the string contains.
Examples
Input: "Hello World"
Output: 7
Input: "Alphabets"
Output: 6

*/

import java.util.*; 
import java.io.*;

public class Main {

  public static String ConsonantCount(String str) {
    //Delete uppercase and lowercase vowels
    str= str.replaceAll("[aeiouAEIOU]","");
    //Delete non-alphanumeric
    str= str.replaceAll("[^a-zA-Z0-9]","");
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
