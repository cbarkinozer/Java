/*
LEVEL:MEDIUM
Distinct List
Have the function DistinctList(arr) take the array of numbers stored in arr and determine the total number of duplicate entries. 
For example if the input is [1, 2, 2, 2, 3] then your program should output 2 because there are two duplicates of one of the elements.
Examples
Input: new int[] {0,-2,-2,5,5,5}
Output: 3
Input: new int[] {100,2,101,4}
Output: 0

1. For input new int[] {0,-2,-2,5,5,5} the output was incorrect. The correct output is 3

2. For input new int[] {0,-2,-2} the output was incorrect. The correct output is 1

3. For input new int[] {100,2,101,4} the output was incorrect. The correct output is 0

4. For input new int[] {1,2,2,2,3} the output was incorrect. The correct output is 2

5. For input new int[] {1,2,2,2,2,2,3} the output was incorrect. The correct output is 4

6. For input new int[] {5,5,5,5,5,5,5,7} the output was incorrect. The correct output is 6

7. For input new int[] {5,-2,50,100} the output was incorrect. The correct output is 0

8. For input new int[] {0,0,0,0} the output was incorrect. The correct output is 3

9. For input new int[] {1,5,9} the output was incorrect. The correct output is 0
*/
import java.util.*; 
import java.io.*;
import java.math.*;

class Main {

  public static int DistinctList(int[] arr) {
    int count=0;
    Arrays.sort(arr);
    int previous=arr[0]-1;
    for(int i=0;i<arr.length;i++){
      if(arr[i]==previous){
          count++;
        }else{
          previous=arr[i];
        }
    }
    return count;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(DistinctList(s.nextLine())); 
  }

}
