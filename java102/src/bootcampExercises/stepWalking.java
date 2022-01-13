/*
level:HARD
Have the function StepWalking(num) take the num parameter being passed which will be an integer between 1 and 1,000 that represents the number of stairs you will have to climb.
You can climb the set of stairs by taking either 1 step or 2 steps, and you can combine these in any order. 
So for example, to climb 3 steps you can either do: (1 step, 1 step, 1 step) or (2, 1) or (1, 2). So for 3 steps we have 3 different ways to climb them,
so your program should return 3. Your program should return the number of combinations of climbing num steps.
Examples
Input: 1
Output: 1
Input: 3
Output: 3
*/
import java.util.*; 
import java.io.*;

class Main {

  public static int StepWalking(int num) {
    // code goes here  
    return num;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StepWalking(s.nextLine())); 
  }

}
