/*
level:MEDIUM
Have the function PalindromeTwo(str) take the str parameter being passed and return the string true if the parameter is a palindrome,
(the string is the same forward as it is backward) otherwise return the string false.
The parameter entered may have punctuation and symbols but they should not affect whether the string is in fact a palindrome. For example:
"Anne, I vote more cars race Rome-to-Vienna" should return true.
Examples
Input: "Noel - sees Leon"
Output: true
Input: "A war at Tarawa!"
Output: true
*/
import java.util.*; 
import java.io.*;

class Main {

  public static String PalindromeTwo(String str) {
    // code goes here  
    return str;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(PalindromeTwo(s.nextLine())); 
  }

}
