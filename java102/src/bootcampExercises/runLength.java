/*
-UNFINISHED-
LEVEL:MEDIUM
Run Length
Have the function RunLength(str) take the str parameter being passed and return a compressed version of the string using the Run-length encoding algorithm.
This algorithm works by taking the occurrence of each repeating character and outputting that number along with a single character of the repeating sequence.
For example: "wwwggopp" would return 3w2g1o2p. The string will not contain any numbers, punctuation, or symbols.
Examples
Input: "aabbcde"
Output: 2a2b1c1d1e
Input: "wwwbbbw"
Output: 3w3b1w
*/
import java.util.*;
import java.io.*;
public class Main {
    public static String runLength(String str){
      int count=1;
      ArrayList<Character> ch = new ArrayList<Character>();
      for(char c: str.toCharArray()){
        ch.add(c);
      }
      ArrayList<Character> ch2 = new ArrayList<Character>();
      for(int i=0;i<ch.size();i++){
        count=1;
        for(int j=i;j<ch.size();j++){
          if(ch.get(i).equals(ch.get(j))){
            count++;
          }else{
            ch2.add(String.valueOf(count)).charAt(0));
            ch2.add(ch.get(i));
            break;
          }
        }
      }
    StringBuilder sb= new StringBuilder();
    for(Character c:ch2){
      sb.append(c);
    }
    return sb.toString();
    }
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      System.out.println(runLength(scanner.nextLine()));
    }
}
