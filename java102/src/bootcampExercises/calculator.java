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

public class Main {
  //In stacks hold numbers and operations
  Stack<Integer> number = new Stack<Integer>();
  Stack<Character> operation = new Stack<Character>();
  StringBuilder string = new StringBuilder();

  //Has to be non-static to reach global Stacks
  public String MathChallenge(String str) {

    for(int i=0;i<str.length();i++){ //Do following for each char in str
      char c=str.charAt(i);          //c is the char in str

      if(Character.isDigit(c)){      //If c is number
        
        if(i==str.length()-1){       //if i is the last char
          string.append(c);          //Add number to StringBuilder
          number.push(Integer.parseInt(string.toString())); //add number to numbers
        
        }else{                       //If i is not the last char
          string.append(c);          // Add number to StringBuilder
        }
      
      
      }else{                         //If c is not number
        
        if(string.length()>0){       //If string is not empty
          number.push(Integer.parseInt(string.toString())); //Add number to numbers
        }
        
        string= new StringBuilder("");     //stringBuilder string now empty

        if(c==')'){                   //If char is close paranthesis

          while(operation.peek()!='('){      //Calculate operations until see new paranthesis
            calculate();
            }
          
          operation.pop();                   //Delete last operation
          
          
          if(i<str.length()-1 &&              //If i is not the last element and
          (str.charAt(i+1)=='(' ||           //Next char is open paranthesis or
          Character.isDigit(str.charAt(i+1)) ) ){ //Next char is digit
            operation.push('*');                  // push * to operation
          }

        }
        //If there are operations and priority is at the lowest
      else if(operation.size()>0 && hasLowProcessPriority(c,operation.peek())){ 
        //While there are operations and priority is at the lowest
        while(operation.size()>0 && hasLowProcessPriority(c,operation.peek())){
          calculate();                       //Do the calculation
        }
        operation.push(c);                   //push to operation
      }else{              
          //Character open paranthesis and i is positive and previous char is digit                   
          if(c=='(' && i>0 && Character.isDigit(str.charAt(i-1))){ 
            operation.push('*');                 //push * to operaiton
            operation.push(c);                  //push char to operations
          }else{
            operation.push(c);                 //else push char to operation
          }
        }



      }//else

      
    }//for
      
    while(operation.size()!=0){calculate();} //While operaiton size is not empty calculate
    int finalAnswer =number.pop();           //Final answer is the last element on number
    return String.valueOf(finalAnswer);  
  
  }//MatchChallange
  
  
  //The other 2 methods are private because we are reaching from outside
  
  //Check process priority if lowest
  private boolean hasLowProcessPriority(char c, char peek){
    if(c=='+'||c=='-'){
      if(peek=='*'||peek=='/'||peek=='+'||peek=='-'){
        return true;
      }else{
        return false;
      }
    }
    return false;
  }
  //Do the calculation
  private void calculate(){
    int num1= number.pop();
    int num2= number.pop();
    int result=0;

    char c= operation.pop();
    switch(c){
      case'+':
        result=num2+num1;
        break;
      case '-':
        result = num2-num1;
        break;
      case '*':
        result = num2*num1;
        break;
      case '/':
        result = num2/num1;
        break;  
    }
    number.push(result);
  }

  public static void main (String[] args) {  
         
    Scanner s = new Scanner(System.in);
    Main main = new Main(); //Create object of Main because methods are not static
    System.out.print(main.MathChallenge(s.nextLine())); 
  }

}
