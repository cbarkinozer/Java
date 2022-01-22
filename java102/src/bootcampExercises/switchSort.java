/*
level:HARD
Have the function SwitchSort(arr) take arr which will be an an array consisting of integers 1...size(arr) and determine what the fewest number of steps is in order to sort
the array from least to greatest using the following technique: Each element E in the array can swap places with another element that is arr[E] spaces to the left or right 
of the chosen element. You can loop from one end of the array to the other. For example: if arr is the array [1, 3, 4, 2] then you can choose the second element which is the
number 3, and if you count 3 places to the left you'll loop around the array and end up at the number 4. Then you swap these elements and arr is then [1, 4, 3, 2].
From here only one more step is required, you choose the last element which is the number 2, count 2 places to the left and you'll reach the number 4,
then you swap these elements and you end up with a sorted array [1, 2, 3, 4]. Your program should return an integer that specifies the least amount of steps needed in order to
sort the array using the following switch sort technique.

The array arr will at most contain five elements and will contain at least two elements.
Examples
Input: new int[] {3,1,2}
Output: 2
Input: new int[] {1,3,4,2}
Output: 2
*/

import javafx.util.Pair;
import java.util.ArrayList;
import java.util.*;

class Main {

  public static int SwitchSort(int[] arr) {
        int n = arr.length;
 
        // Create two arrays and
        // use as pairs where first
        // array is element and second array
        // is position of first element
        ArrayList <Pair <Integer, Integer> > arrpos =
                  new ArrayList <Pair <Integer,
                                      Integer> > ();
        for (int i = 0; i < n; i++)
             arrpos.add(new Pair <Integer,
                               Integer> (arr[i], i));
 
        // Sort the array by array element values to
        // get right position of every element as the
        // elements of second array.
        arrpos.sort(new Comparator<Pair<Integer,
                                         Integer>>()
        {
            @Override
            public int compare(Pair<Integer, Integer> o1,
                               Pair<Integer, Integer> o2)
            {
                if (o1.getKey() > o2.getKey())
                    return -1;
 
                // We can change this to make
                // it then look at the
                // words alphabetical order
                else if (o1.getKey().equals(o2.getKey()))
                    return 0;
 
                else
                    return 1;
            }
        });
 
        // To keep track of visited elements. Initialize
        // all elements as not visited or false.
        Boolean[] vis = new Boolean[n];
        Arrays.fill(vis, false);
 
        // Initialize result
        int ans = 0;
 
        // Traverse array elements
        for (int i = 0; i < n; i++)
        {
            // already swapped and corrected or
            // already present at correct pos
            if (vis[i] || arrpos.get(i).getValue() == i)
                continue;
 
            // find out the number of  node in
            // this cycle and add in ans
            int cycle_size = 0;
            int j = i;
            while (!vis[j])
            {
                vis[j] = true;
 
                // move to next node
                j = arrpos.get(j).getValue();
                cycle_size++;
            }
 
            // Update answer by adding current cycle.
            if(cycle_size > 0)
            {
                ans += (cycle_size - 1);
            }
        }
 
        // Return result
        return ans;
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(SwitchSort(s.nextLine())); 
  }

}
