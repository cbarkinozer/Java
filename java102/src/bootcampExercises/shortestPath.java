/*
-UNFINISHED-
LEVEL: HARD
Shortest Path
Have the function ShortestPath(strArr) take strArr which will be an array of strings which models a non-looping Graph.
The structure of the array will be as follows: The first element in the array will be the number of nodes N (points) in the array as a string.
The next N elements will be the nodes which can be anything (A, B, C .. Brick Street, Main Street .. etc.).
Then after the Nth element, the rest of the elements in the array will be the connections between all of the nodes.
They will look like this: (A-B, B-C .. Brick Street-Main Street .. etc.). Although, there may exist no connections at all.

An example of strArr may be: ["4","A","B","C","D","A-B","B-D","B-C","C-D"].
Your program should return the shortest path from the first Node to the last Node in the array separated by dashes.
So in the example above the output should be A-B-D. Here is another example with strArr being ["7","A","B","C","D","E","F","G","A-B","A-E","B-C","C-D","D-F","E-D","F-G"].
The output for this array should be A-E-D-F-G. There will only ever be one shortest path for the array. If no path between the first and last node exists, return -1.
The array will at minimum have two nodes. Also, the connection A-B for example, means that A can get to B and B can get to A.
Examples
Input: new string[] {"5","A","B","C","D","F","A-B","A-C","B-C","C-D","D-F"}
Output: A-C-D-F
Input: new string[] {"4","X","Y","Z","W","X-Y","Y-Z","X-W"}
Output: X-W
*/


import java.util.*; 
import java.io.*;

public class Main {

  public static String ShortestPath(String[] strArr) {
    // code goes here

    // unweighted positive-cost graph is provided
    // find the minimum-cost connection between first and last nodes. 


    // Extract information from input
    int numNodes = Integer.parseInt(strArr[0]);
    String nodeFirst = strArr[1];
    String nodeLast = strArr[numNodes];
    String[] nodesRest = Arrays.copyOfRange(strArr, 2, numNodes);
    String[] connections = Arrays.copyOfRange(strArr, numNodes + 1, strArr.length);

    // Store possible branches (non-empty)
    ArrayList<String> branches = new ArrayList<String>();
    // initial path template added
    branches.add(nodeFirst);


    // Get the initial path template
    String path = branches.get(0);
    // Get nodeFirst for iteration
    String head = String.valueOf(path.charAt(path.length() - 1));

    while(true) {
      // If any solution exists return it
      for (String branch : branches) {
        if (branch.endsWith(nodeLast)) {
          return branch;
        }
      }
      // Add non-looping possible child paths to the list
      for (String conn : connections) {
        // Possible hop
        String next;

        // Find next possible hop for the head
        int charIndex = conn.indexOf(head);
        // Left
        if (charIndex == 0) {
          next = String.valueOf(conn.charAt(2));
        }
        // Right
        else if (charIndex == 2) {
          next = String.valueOf(conn.charAt(2));
        }
        // Pass irrelevant connection
        else {
          continue;
        }

        // If next hop will not cause a loop (i.e. it has not been added before)
        if (path.indexOf(next) < 0) {
          // Add next as head
          String child = path + "-" + next;
          branches.add(0, child);
        }
      }

      // Remove the original parent path from the list
      branches.remove(path);

      // Sort the branches in increasing size
      if (branches.size() > 0) {
        branches.sort(Comparator.comparingInt(String::length));
      }
      // No possible connections
      else {
        return "-1";
      }

      // Get the least expensive path (might get stuck)
      path = branches.get(0);
      // Head node for current minumum-cost path
      head = String.valueOf(path.charAt(path.length() - 1));
    }
  }


public static String ShortestPath2(String[] strArr) {
    //Stream solution
    return strArr[0];
}
  public static void main (String[] args) {
    // keep this function call here
    String[] str = {"5", "A", "B", "C","D","F","A-B","A-C","B-C","C-D","D-F"};
    String[] str2 = {"4", "X", "Y", "Z","W","X-Y","Y-Z","X-W"};
    
    System.out.println(ShortestPath(str));
    System.out.println(ShortestPath(str2));
    
  }

}
