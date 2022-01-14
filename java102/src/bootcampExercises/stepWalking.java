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

1. For input 1 the output was incorrect. The correct output is 1
2. For input 2 the output was incorrect. The correct output is 2
3. For input 3 the output was incorrect. The correct output is 3
4. For input 4 the output was incorrect. The correct output is 5
5. For input 5 the output was incorrect. The correct output is 8
6. For input 6 the output was incorrect. The correct output is 13
7. For input 7 the output was incorrect. The correct output is 21
8. For input 8 the output was incorrect. The correct output is 34
9. For input 9 the output was incorrect. The correct output is 55
10. For input 13 the output was incorrect. The correct output is 377

*/
import java.util.*; 
import java.io.*;

class Main {

   public static int StepWalking(int num){
        if(num == 1) return 1;
        if(num == 2) return 2;

        return StepWalking(num-1) + StepWalking(num-2);
    }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(StepWalking(s.nextLine())); 
  }

}
