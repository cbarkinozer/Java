/*
Optimal Assignments
Have the function OptimalAssignments(strArr) read strArr which will represent an NxN matrix and it will be in the following format:
["(n,n,n...)","(...)",...] where the n's represent integers. This matrix represents a machine at row i performing task at column j.
The cost for this is matrix[i][j]. Your program should determine what machine should perform what task so as to minimize the whole cost and
it should return the pairings of machines to tasks in the following format: (i-j)(...)... Only one machine can perform one task.
For example: if strArr is ["(5,4,2)","(12,4,3)","(3,4,13)"] then your program should return (1-3)(2-2)(3-1) because assigning the machines to these tasks gives the least cost.
The matrix will range from 2x2 to 6x6, there will be no negative costs in the matrix, and there will always be a unique answer.
Examples
Input: new String[] {"(1,2,1)","(4,1,5)","(5,2,1)"}
Output: (1-1)(2-2)(3-3)Input: new String[] {"(13,4,7,6)","(1,11,5,4)","(6,7,2,8)","(1,3,5,9)"}
Output: (1-2)(2-4)(3-3)(4-1)

*/


import java.util.*;

public class Main {
    public static List < Integer[] > permutations = new ArrayList < > ();
    public static Integer[] minPermutationArr = new Integer[0];
    public static Integer minCost = Integer.MAX_VALUE;

    public static void main(String[] args) {
        String[] strArr1 = new String[]{"(1,2,1)","(4,1,5)","(5,2,1)"};
        String[] strArr2 = new String[] {
            "(13,4,7,6)",
            "(1,11,5,4)",
            "(6,7,2,8)",
            "(1,3,5,9)"
        };
        System.out.println(OptimalAssignments(strArr1));
    }

    public static String OptimalAssignments(String[] strArr) {
        // Convert String[] to int[][]
        int[][] matrix = new int[strArr.length][strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            String[] split = strArr[i].substring(1, strArr[i].length() - 1).split(",");
            for (int j = 0; j < split.length; j++) {
                matrix[i][j] = Integer.parseInt(split[j]);
            }
        }

        // Get order of machines
        List < Integer > list = new ArrayList < > ();
        for (int i = 0; i < matrix.length; i++) {
            list.add(i);
        }

        // Find all permutations of order of machines
        permute(list, 0);

        // Calculate costs of machines assigned to tasks
        minPermutationArr = new Integer[matrix.length];
        for (Integer[] permutation: permutations) {
            int cost = 0;

            // Each machine should only be assigned to one task
            for (int i = 0; i < permutation.length; i++) {
                cost += matrix[i][permutation[i]];
            }

            if (cost < minCost) {
                minCost = cost;
                minPermutationArr = permutation;
            }
        }

        // Convert minPermutationArr to String
        String result = "";
        for (int i = 0; i < minPermutationArr.length; i++) {
            result += "(" + (i + 1) + "-" + (minPermutationArr[i] + 1) + ")";
        }

        return result;
    }

    static void permute(List < Integer > list, int k) {
        for (int i = k; i < list.size(); i++) {
            Collections.swap(list, i, k);
            permute(list, k + 1);
            Collections.swap(list, k, i);
        }

        if (k == list.size() - 1) {
            Integer[] arr = list.toArray(new Integer[list.size()]);
            permutations.add(arr);
        }
    }

}
