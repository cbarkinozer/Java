/*
Complete the solution so that the function will break up camel casing, using a space between words.
Example
"camelCasing"  =>  "camel Casing"
"identifier"   =>  "identifier"
""             =>  ""
*/

import java.util.stream.Collectors;

class Solution {
  public static String camelCase(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        //if a character is uppercase add space afterwards otherwise character is converted to a String
        return input.chars()
                .mapToObj(c -> Character.isUpperCase(c) ? " " + (char) c : String.valueOf((char) c)) 
                .collect(Collectors.joining());
  }
}
