/*
Level:MEDIUM
Have the function LetterCount(str) take the str parameter being passed and return the first word with the greatest number of repeated letters.
For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's) and it comes before ever which also has 2 e's.
If there are no words with repeating letters return -1. Words will be separated by spaces.
Examples
Input: "Hello apple pie"
Output: Hello
Input: "No words"
Output: -1

1. For input "Helo apple pie" the output was incorrect. The correct output is apple. Your output is Helo.
*/
import java.util.*; 
import java.io.*;

public class Main {

  public static String LetterCount(String str) {
    int count;
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    ArrayList<String> list = new ArrayList<String>();
    Character ch;
    String[] strArr =str.split(" ");
    for(int i=0;i<strArr.length;i++){
     for(int j=0;j<strArr[i].length();j++){
         count=0;
         ch=strArr[i].charAt(i);
         if(!map.containsKey(ch)){
             map.put(ch,1);
         }else{
             map.put(ch,map.get(ch)+1);
             if(map.get(ch)+1>count){    //if value is the new greatest
                count = map.get(ch)+1;   //save count
                list.add(strArr[i]);     //
                }
             
         }
     } 
     map.clear();
    }
    String result = new String();
    if(list.isEmpty()){
        result ="-1";
    }else{
        result = list.get(0);
    }
    
    return result;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCount(s.nextLine())); 
  }

}
