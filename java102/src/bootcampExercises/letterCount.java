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

1. For input "Hello apple pie" the output was incorrect. The correct output is Hello. Your output is apple.
2. For input "yellow and red" the output was incorrect. The correct output is yellow. Your output is red.
*/
import java.util.*; 
import java.io.*;

public class Main {

  public static String LetterCount(String str) {
    int count=0;
    str +=" "; //adding space at the end to get each word witg "ch !=' '" expression
    int length= str.length();
    Map<Character,Integer> map = new HashMap<Character,Integer>();
    ArrayList<Integer> list = new ArrayList<Integer>();
    Character ch;
    for(int i=0;i<length;i++){
      ch=str.charAt(i); // character in str
      if(ch !=' '){ //for each word
        
        if(map.get(ch)==null){ //if character is new add 1
          map.put(ch,1);
        }else{                 //if character already exist
          
          map.put(ch,map.get(ch)+1); //increase its value
          if(map.get(ch)+1>count){   //if value is the new greatest
            count = map.get(ch)+1;   //save count
          }
        }

      }else{
        if(count==0){
          count=-1;
        }
        System.out.println(map.toString());
        list.add(count); //save count for that word
        map.clear();     //empty the map
        count=0;
      } 
    }
    
    ArrayList<Integer> newList = new ArrayList<Integer>();
    newList=list;
    Collections.sort(list);
    int wordIndex= newList.indexOf(list.get(list.size()-1)); //Show the max word's index
    String[] words = str.split(" "); //split words by word
    if(list.get(list.size()-1)==-1){ //If list's greates number is -1 (means all -1)
      return "-1";
    }
    return words[wordIndex];
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LetterCount(s.nextLine())); 
  }

}
