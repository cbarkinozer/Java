/*
LEVEL: EASY
First Reverse
Have the function FirstReverse(str) take the str parameter being passed and return the string in reversed order.
For example: if the input string is "Hello World and Coders" then your program should return the string sredoC dna dlroW olleH.
Examples
Input: "coderbyte"
Output: etybredoc
Input: "I Love Code"
Output: edoC evoL I
*/
import java.util.*;
import java.io.*;
public class Main {
    public static String firstReverse(String str){
      String reverse = new StringBuilder(str).reverse().toString();
      return reverse;
    }
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println(FirstReverse(scanner.nextLine()));
    }
}
