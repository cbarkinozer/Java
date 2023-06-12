/*
Your task is to write a function which returns the sum of following series upto nth term(parameter).

Series: 1 + 1/4 + 1/7 + 1/10 + 1/13 + 1/16 +...
Rules:
You need to round the answer to 2 decimal places and return it as String.

If the given value is 0 then it should return 0.00

You will only be given Natural Numbers as arguments.

Examples:(Input --> Output)
1 --> 1 --> "1.00"
2 --> 1 + 1/4 --> "1.25"
5 --> 1 + 1/4 + 1/7 + 1/10 + 1/13 --> "1.57"
*/

import java.text.DecimalFormat;
import java.util.stream.DoubleStream;
public class NthSeries {
	
	public static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }

        DecimalFormat decimalFormat = new DecimalFormat("0.00");
        // Generate a DoubleStream of denominators (1, 4, 7, ...) by starting from 1 and incrementing by 3
        double sum = DoubleStream.iterate(1, i -> i + 3)
                .limit(n)
                .map(i -> 1.0 / i) // Map each term to its reciprocal (1/term)
                .sum(); // Sum all the values in the stream

        return decimalFormat.format(sum);
	}
}
