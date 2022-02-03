/*
level:medium
Have the function EvenPairs(str) take the str parameter being passed and determine if a pair of adjacent even numbers exists anywhere in the string. If a pair exists, return the string true, otherwise return false. For example: if str is "f178svg3k19k46" then there are two even numbers at the end of the string, "46" so your program should return the string true. Another example: if str is "7r5gg812" then the pair is "812" (8 and 12) so your program should return the string true.
Examples
Input: "3gy41d216"
Output: true
Input: "f09r27i8e67"
Output: false
*/
import java.util.*; 
import java.io.*;

class Main {

  public static String EvenPairs(String str) {
    StringBuffer sBuffer = new StringBuffer();
    str= str.replaceAll("[^0-9]",".");
    for(int i=0;i<str.length();i++){
      if(str.charAt(i)!='.'){
        sBuffer.append(str.charAt(i));
      }else{
        if( sBuffer.length()!=0 && Integer.parseInt(sBuffer.toString())%2==0){
          System.out.println(Integer.parseInt(sBuffer.toString()));
          return "true";
        }
        sBuffer.setLength(0); //Clear
      }
    }

    return "false";
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(EvenPairs(s.nextLine())); 
  }

}
