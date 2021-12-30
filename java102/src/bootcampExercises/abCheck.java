/*
UNFINISHED
LEVEL:EASY
*/

/*
import java.util.*; 
import java.io.*;
import java.math.*;

class Main {

  public static String ABCheck(String str) {
    str=str.replace(" ","");
    int count=0;
    int count2=0;
    int index=str.indexOf('a');
    int index2=str.indexOf('b');
    count= Math.abs(str.indexOf('a',index+1)-str.indexOf('b'));
    count2=Math.abs(str.indexOf('b',index2+1)-str.indexOf('a'));
    if(count==3 || count2==3){
      return "true";
    }else if(count!=3 && count2 !=3){
      return "false";
    } else{
      return "error";
    }
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ABCheck(s.nextLine())); 
  }

}
*/
