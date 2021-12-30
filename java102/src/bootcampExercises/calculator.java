/*
UNFINISHED
LEVEL:HARD
Calculator
Have the function Calculator(str) take the str parameter being passed and evaluate the mathematical expression within in.
For example, if str were "2+(3-1)*3" the output should be 8. Another example: if str were "(2-0)(6/2)" the output should be 6.
There can be parenthesis within the string so you must evaluate it properly according to the rules of arithmetic. The string will contain the operators:
+, -, /, *, (, and ). If you have a string like this: #/#*# or #+#(#)/#, then evaluate from left to right. So divide then multiply, and for the second one
multiply, divide, then add. The evaluations will be such that there will not be any decimal operations, so you do not need to account for rounding and whatnot.
Examples
Input: "6*(4/2)+3*1"
Output: 15
Input: "6/3-1"
Output: 1

1. For input "1+1+1+2" the output was incorrect. The correct output is 5

2. For input "7-2+(5-2)" the output was incorrect. The correct output is 8

3. For input "(4/2)(3-1)" the output was incorrect. The correct output is 4

4. For input "6-3/1" the output was incorrect. The correct output is 3

5. For input "45-10*2-1" the output was incorrect. The correct output is 24

6. For input "100*2" the output was incorrect. The correct output is 200

7. For input "812/2*(5-3)" the output was incorrect. The correct output is 812

8. For input "7-4-1+8(3)/2" the output was incorrect. The correct output is 14

9. For input "(5-2*0-9*0)*0" the output was incorrect. The correct output is 0

10. For input "8-7*(12+100/2)*9-2" the output was incorrect. The correct output is -3900
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
