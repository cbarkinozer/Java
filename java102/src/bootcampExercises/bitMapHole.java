/*
LEVEL: MEDIUM
Have the function BitmapHoles(strArr) take the array of strings stored in strArr, which will be a 2D matrix of 0 and 1's, 
and determine how many holes, or contiguous regions of 0's, exist in the matrix.
A contiguous region is one where there is a connected group of 0's going in one or more of four directions: up, down, left, or right.
For example: if strArr is ["10111", "10101", "11101", "11111"], then this looks like the following matrix:

1 0 1 1 1
1 0 1 0 1
1 1 1 0 0
1 1 1 1 1

For the input above, your program should return 2 because there are two separate contiguous regions of 0's, which create "holes" in the matrix.
You can assume the input will not be empty.

Examples
Input: new String[] {"01111", "01101", "00011", "11110"}
Output: 3Input: new String[] {"1011", "0010"}
Output: 2

*/


import java.util.*;
import java.io.*;
public class Main {
     public static String  function(String[] strArr) {
         
        ArrayList < ArrayList < Integer >> index = new ArrayList < ArrayList < Integer >> ();
        ArrayList < ArrayList < String >> mat = new ArrayList < ArrayList < String >> ();
        int holes = 0;
        boolean checker;
        for (int i = 0; i < strArr.length; i++) {
            mat.add(new ArrayList < String > (Arrays.asList(strArr[i].split(""))));
            for (int j = 0; j < strArr[i].length(); j++) {
                if (mat.get(i).get(j).equals("0")) {
                    index.add(new ArrayList < Integer > (Arrays.asList(i, j)));
                }
            }
        }
        for (int c = 0; c < index.size(); c++) {
            checker = false;
            for (int k = c + 1; k < index.size(); k++) {
                if (index.get(k).get(0) == index.get(c).get(0) + 1 && index.get(k).get(1) == index.get(c).get(1) || index.get(k).get(0) == index.get(c).get(0) && index.get(k).get(1) == index.get(c).get(1) + 1) checker = true;
            }

            if (checker == false) holes++;
        } 
        return String.valueOf(holes);
    }
    public static void main(String[] args){
        String[] strArr= new String[] {"0011", "0010"} ;
        System.out.println("Correct Result: 2 . Your Result: "+function(strArr));
        
        String[] strArr2=new String[] {"0", "0"} ;
        System.out.println("Correct Result: 1 . Your Result: "+function(strArr2));
        
        String[] strArr3=new String[] {"110", "000", "111"} ;
        System.out.println("Correct Result: 1 . Your Result:  "+function(strArr3));
        
        String[] strArr4=new String[] {"110", "001", "110"} ;
        System.out.println("Correct Result: 3 . Your Result: "+function(strArr4));
        
        String[] strArr5= new String[]{"1100", "0010", "1101"} ;
        System.out.println("Correct Result: 3 . Your Result: "+function(strArr5));
        
        String[] strArr6=new String[] {"10100", "01000", "01110", "11001"} ;
        System.out.println("Correct Result: 4 . Your Result: "+function(strArr6));
        
        
    }
}
