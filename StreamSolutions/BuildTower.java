/*
Build a pyramid-shaped tower, as an array/list of strings, given a positive integer number of floors. A tower block is represented with "*" character.

For example, a tower with 3 floors looks like this:

[
  "  *  ",
  " *** ", 
  "*****"
]
And a tower with 6 floors looks like this:

[
  "     *     ", 
  "    ***    ", 
  "   *****   ", 
  "  *******  ", 
  " ********* ", 
  "***********"
]
*/
import java.util.stream.Collectors;
import java.util.stream.IntStream;
public class Kata
{
  public static String[] towerBuilder(int nFloors)
  {

        return IntStream.range(0, nFloors)
                .mapToObj(i -> {
                    int numSpaces = nFloors - i - 1;
                    int numBlocks = 2 * i + 1;
                    String spaces = " ".repeat(numSpaces);
                    String blocks = "*".repeat(numBlocks);
                    return spaces + blocks + spaces;
                })
                .toArray(String[]::new);
  }
}
