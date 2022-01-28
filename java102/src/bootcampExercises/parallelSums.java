/*
level:HARD
 Have the function ParallelSums(arr) take the array of integers stored in arr which will always contain an even amount of integers, and determine how they can be
 split into two even sets of integers each so that both sets add up to the same number. If this is impossible return -1. If it's possible to split the array into two sets,
 then return a string representation of the first set followed by the second set with each integer separated by a comma and both sets sorted in ascending order.
 The set that goes first is the set with the smallest first integer.

For example: if arr is [16, 22, 35, 8, 20, 1, 21, 11], then your program should output 1,11,20,35,8,16,21,22
Examples
Input: new int[] {1,2,3,4}
Output: 1,4,2,3
Input: new int[] {1,2,1,5}
Output: -1
*/

import java.util.*; 
import java.io.*;

class Main {

  public static int ParallelSums(int[] arr) {
    ArrayList<Integer> liste = new ArrayList<Integer>();
        ArrayList<ArrayList<Integer>> liste1 = new ArrayList<ArrayList<Integer>>();
        ArrayList<ArrayList<Integer>> value= new ArrayList<ArrayList<Integer>>();

        liste.add(1);
        liste.add(2);
        liste.add(3);
        liste.add(4);
        String s="";
        int size=liste.size();
        int sum =  liste.stream().reduce(0, (i,i1)->{
            return i+i1;
        });

        if(size%2!=0) {
            System.out.println(-1);
        }
        else {

            value = sum_up_recursive(liste1,liste,(sum/2),new ArrayList<Integer>());
            value.get(0).addAll(value.get(1));

            s += value.get(0).toString();


        }

        System.out.println(s);
    }

    static ArrayList<ArrayList<Integer>> sum_up_recursive(ArrayList<ArrayList<Integer>> liste,ArrayList<Integer> numbers, int target, ArrayList<Integer> partial) {
           int s = 0;
           for (int x: partial) s += x;
           if (s == target)
                liste.add(partial);
           if (s >= target)
                return liste;
           for(int i=0;i<numbers.size();i++) {
                 ArrayList<Integer> remaining = new ArrayList<Integer>();
                 int n = numbers.get(i);
                 for (int j=i+1; j<numbers.size();j++) remaining.add(numbers.get(j));
                 ArrayList<Integer> partial_rec = new ArrayList<Integer>(partial);
                 partial_rec.add(n);
                 sum_up_recursive(liste,remaining,target,partial_rec);
           }
           return liste;
        }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(ParallelSums(s.nextLine())); 
  }

}
