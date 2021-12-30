/*
UNFINISHED
LEVEL:HARD
*/



import java.util.*; 
import java.io.*;

class Main {

  public static String Calculator(String str) {
    char operation=' ';
    int result=0;
    ArrayList<Integer> values = new ArrayList<Integer>();
    //TODO: Find values from string
    switch(operation){
      case'*':
      result=values.get(0)* values.get(1);
      break;
      case'/':
      result=values.get(0)/ values.get(1);
      break;
      case '+':
      result=values.get(0)+ values.get(1);
      break;
      case '-':
      result=values.get(0)- values.get(1);
      break;
    }  
    return Integer.toString(result);
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(Calculator(s.nextLine())); 
  }

}
