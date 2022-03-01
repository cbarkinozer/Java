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

class Main {

  public static int ConsonantCount(String str) {
    str= str.replaceAll("[aeiouAEIOU 0-9]","");
    return str.length();
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ConsonantCount(s.nextLine())); 
  }

}
