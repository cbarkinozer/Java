/*
The goal of this exercise is to convert a string to a new string where each character in the new string is "(" if that character appears only once in the original string, or ")" if that character appears more than once
in the original string.
Ignore capitalization when determining if a character is a duplicate.
Examples
"din"      =>  "((("
"recede"   =>  "()()()"
"Success"  =>  ")())())"
"(( @"     =>  "))((" 
Notes
Assertion messages may be unclear about what they display in some languages. If you read "...It Should encode XXX", the "XXX" is the expected result, not the input!
*/

import java.util.HashMap;
import java.util.Map;

public class DuplicateEncoder {
	static String encode(String word){
        
        String lowercaseWord = word.toLowerCase();
        Map<Character, Integer> charCount = new HashMap<>();

        // Count the frequency of each character
        lowercaseWord.chars()
                .forEach(c -> charCount.put((char) c, charCount.getOrDefault((char) c, 0) + 1));

        // Build the result string based on character frequency
        return lowercaseWord.chars()
                .mapToObj(c -> charCount.get((char) c) > 1 ? ")" : "(")
                .collect(StringBuilder::new, StringBuilder::append, StringBuilder::append)
                .toString();
  }
}

