/*
Write a function, persistence, that takes in a positive parameter num and returns its multiplicative persistence, which is the number of times you must multiply the digits in num until you reach a single digit.

For example (Input --> Output):

39 --> 3 (because 3*9 = 27, 2*7 = 14, 1*4 = 4 and 4 has only one digit)
999 --> 4 (because 9*9*9 = 729, 7*2*9 = 126, 1*2*6 = 12, and finally 1*2 = 2)
4 --> 0 (because 4 is already a one-digit number)
*/

import java.util.stream.IntStream;
class Persist {
    public static int persistence(long n) {
        int count = 0;
        while (n >= 10) { // While it does not have single digit
            n = String.valueOf(n) // Make it string
                    .chars() // Take their characters
                    .map(Character::getNumericValue) // Get numeric value of the every character
                    .reduce(1, (a, b) -> a * b); // Multiply every character and save as n
            count++; // Count how many times this action is repeated
        }
        return count; // Return the count
    }
}
