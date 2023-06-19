/*
There is a queue for the self-checkout tills at the supermarket. Your task is write a function to calculate the total time required for all the customers to check out!
input

    customers: an array of positive integers representing the queue. Each integer represents a customer, and its value is the amount of time they require to check out.
    n: a positive integer, the number of checkout tills.

output

The function should return an integer, the total time required.

Examples

queueTime([5,3,4], 1)
// should return 12
// because when there is 1 till, the total time is just the sum of the times

queueTime([10,2,3,3], 2)
// should return 10
// because here n=2 and the 2nd, 3rd, and 4th people in the 
// queue finish before the 1st person has finished.

queueTime([2,3,10], 2)
// should return 12

Clarifications

    There is only ONE queue serving many tills, and
    The order of the queue NEVER changes, and
    The front person in the queue (i.e. the first element in the array/list) proceeds to a till as soon as it becomes free.

*/

import java.util.Arrays;
public class Solution {

    public static int solveSuperMarketQueue(int[] customers, int n) {
        int[] tills = new int[n]; // Initialize the current time for each till to 0

        return Arrays.stream(customers)
                .reduce(0, (total, customer) -> {
                    int minTimeTill = Arrays.stream(tills).min().orElse(0); // Find the till with the minimum current time
                    int index = Arrays.stream(tills).boxed().toList().indexOf(minTimeTill); // Find the index of the minimum till
                    tills[index] += customer; // Update the current time of the minimum till
                    return Math.max(total, minTimeTill + customer); // Calculate the maximum total time
                });
    }
    
}
