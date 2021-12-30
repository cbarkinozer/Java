/*
UNFINISHED
LEVEL:EASY
AB Check
Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters a and b are separated by exactly 3 places anywhere
in the string at least once (ie. "lane borrowed" would result in true because there is exactly three characters between a and b). Otherwise return the string false.
Examples
Input: "after badly"
Output: false
Input: "Laura sobs"
Output: true
TEST CASES
1. For input "after it" the output was incorrect. The correct output is false

2. For input "Laura sobs" the output was incorrect. The correct output is true

3. For input "away obe" the output was incorrect. The correct output is true

4. For input "noah obe" the output was incorrect. The correct output is true

5. For input "far ebs" the output was incorrect. The correct output is true

6. For input "aaaaddddd" the output was incorrect. The correct output is false

7. For input "123advb" the output was incorrect. The correct output is false

8. For input "123adzvb" the output was incorrect. The correct output is true

9. For input "abccccazzzb" the output was incorrect. The correct output is true

10. For input "bzzza" the output was incorrect. The correct output is true
*/


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
