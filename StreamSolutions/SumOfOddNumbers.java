/*
Given the triangle of consecutive odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29
...
Calculate the sum of the numbers in the nth row of this triangle (starting at index 1) e.g.: (Input --> Output)

1 -->  1
2 --> 3 + 5 = 8
*/

import java.util.stream.IntStream;

class RowSumOddNumbers {
    public static long rowSumOddNumbers(int rowNumber) {
        int startingNumber = (rowNumber - 1) * rowNumber + 1;
        return IntStream.range(startingNumber, startingNumber + rowNumber * 2)
                .filter(number -> number % 2 != 0)
                .sum();
    }

}
