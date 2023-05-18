/*
Complete the function that accepts a string parameter, and reverses each word in the string. All spaces in the string should be retained.
Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"
*/

import java.util.*;
import java.util.stream.Collectors;

public class Kata
{
  public static String reverseWords(final String original)
  {
    if (original.chars().allMatch(Character::isWhitespace)){
        return original;
    }else {
        return Arrays.asList(original.split(" ")).stream()
          .map(word->new StringBuilder(word).reverse().toString())
          .collect(Collectors.joining(" "));
    }
  }
}
