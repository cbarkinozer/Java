/*
LEVEL:MEDIUM
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
