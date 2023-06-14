/*
You will be given a number and you will need to return it as a string in Expanded Form. For example:

Kata.expandedForm(12); # Should return "10 + 2"
Kata.expandedForm(42); # Should return "40 + 2"
Kata.expandedForm(70304); # Should return "70000 + 300 + 4"
NOTE: All numbers will be whole numbers greater than 0.
*/

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Kata
{
    public static String expandedForm(int num)
    {
        // Convert the number to a string
        String number = String.valueOf(num);
        
        // Iterate over each digit and expand it to its expanded form
        return IntStream.range(0, number.length())
                .mapToObj(i -> Character.getNumericValue(number.charAt(i)) * (int) Math.pow(10, number.length() - i - 1))
                .filter(n -> n > 0) // Filter out any zeros
                .map(Object::toString) // Convert expanded form terms to strings
                .collect(Collectors.joining(" + ")); // Join the terms using " + " delimiter

    }
}
