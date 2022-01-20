/*
level:MEDIUM
Have the function SearchingChallange(str) take the str parameter, search for all the numbers in the string,
add them together , then return that final number divided by the total amount of letters in the string.
For example: if str is "Hello6 9World 2, Nic8e D7ay!" the output should be 2.
First if you add up all the numbers, 6+9+2+8+7 you get 32. Then there are 17 letters in the string.
32/17=1.882 , and the final answer should be rounded to the nearest whole number, so 2.
Only single digit numbers are seperated by spaces will be used.
*/

import java.util.*; 
import java.io.*;

class Main {

  public static int SearchingChallange(String str) {
    
    double len=str.replaceAll("[^a-zA-Z]","").length(); //Length of the letters
    double count=0;
    
    str=str.replaceAll("[^0-9]","" ); //Delete all non-numerics
    for(int i=0;i<str.length();i++){
      count+=Integer.parseInt(String.valueOf(str.charAt(i)));
    }
    return (int)Math.round(count/len);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SearchingChallange(s.nextLine())); 
  }

}
