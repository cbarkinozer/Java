/*
  level:MEDIUM
 Have the function FibonacciChecker(num) return the string yes if the number given is part of the Fibonacci sequence.
 This sequence is defined by: Fn = Fn-1 + Fn-2, which means to find Fn you add the previous two numbers up. The first two numbers are 0 and 1, then comes 1, 2, 3, 5 etc.
 If num is not in the Fibonacci sequence, return the string no.
Examples
Input: 34
Output: yes
Input: 54
Output: no
*/

import java.util.*; 
import java.io.*;

class Main {

 public static Boolean isFibonacci(int num) {
    //starts from second step
    int previous=1;
    int next=2;
    int temp;
    
    if(num ==1){ //Checks the first step
      return true;
    }
    while(next!=num){
      if(next>num){ //If next passes num it is not Fibonacci
        return false;
      }
    //Fibonacci rule
      temp=next; 
      next+=previous;
      previous=temp;
    }

    return true; //If next == num it is Fibonacci
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(isFibonacci(s.nextLine())); 
  }

}
