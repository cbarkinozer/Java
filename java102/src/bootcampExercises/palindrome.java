/*
LEVEL:EASY
Palindrome
Have the function Palindrome(str) take the str parameter being passed and return the string true if the parameter is a palindrome,
(the string is the same forward as it is backward) otherwise return the string false. For example: "racecar" is also "racecar" backwards.
Punctuation and numbers will not be part of the string.
Examples
Input: "never odd or even"
Output: true
Input: "eye"
Output: true
*/

import java.util.*;
import java.io.*;
public class Main {
    public static String palindrome(String str){
      str=str.replace(" ","");
      StringBuilder strBuilder = new StringBuilder(str);
      if(strBuilder.toString().equals(strBuilder.reverse().toString())){
        return "true";
      }else{
        return "false";
      }
    }
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println(palindrome(scanner.nextLine()));
    }
}

