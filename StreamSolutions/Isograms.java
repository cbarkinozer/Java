/*
An isogram is a word that has no repeating letters, consecutive or non-consecutive. Implement a function that determines whether a string that contains only letters is an isogram. Assume the empty string is an isogram. Ignore letter case.
Example: (Input --> Output)
"Dermatoglyphics" --> true "aba" --> false "moOse" --> false (ignore letter case)
isIsogram "Dermatoglyphics" = true
isIsogram "moose" = false
isIsogram "aba" = false
*/
import java.util.*;

public class isogram {
    public static boolean  isIsogram(String str) {
      Set<Character> characterSet = new HashSet<>();  
      return str.toLowerCase().chars()
                .mapToObj(ch -> (char) ch)
                .allMatch(ch -> characterSet.add(ch));
    } 
}
