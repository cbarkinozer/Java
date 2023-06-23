/*
Your job is to write a function which increments a string, to create a new string.

If the string already ends with a number, the number should be incremented by 1.
If the string does not end with a number. the number 1 should be appended to the new string.

Examples:

foo -> foo1

foobar23 -> foobar24

foo0042 -> foo0043

foo9 -> foo10

foo099 -> foo100

Attention: If the number has leading zeros the amount of digits should be considered.

*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.math.BigInteger;

public class Kata {
     public static String incrementString(String str) {
        StringBuilder result = new StringBuilder();

        // Find the index where the digits start
        int digitIndex = str.length();
        while (digitIndex > 0 && Character.isDigit(str.charAt(digitIndex - 1))) {
            digitIndex--;
        }

        // Extract prefix and number parts
        String prefix = str.substring(0, digitIndex);
        String numberStr = str.substring(digitIndex);

        if (numberStr.isEmpty()) {
            // If no digits found, append "1" to the new string
            result.append(str).append("1");
        } else {
            // Increment the number using BigInteger
            BigInteger number = new BigInteger(numberStr).add(BigInteger.ONE);
            String paddedNumber = padNumberWithZeros(numberStr.length(), number);

            result.append(prefix).append(paddedNumber);
        }

        return result.toString();
    }

    private static String padNumberWithZeros(int length, BigInteger number) {
        String numberStr = number.toString();
        int zerosToAdd = length - numberStr.length();

        // Pad the number with leading zeros
        return IntStream.range(0, zerosToAdd)
                .mapToObj(i -> "0")
                .collect(Collectors.joining()) + numberStr;
    }
}
