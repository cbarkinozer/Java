/*
You are going to be given a word. Your job is to return the middle character of the word. If the word's length is odd, return the middle character. If the word's length is even, return the middle 2 characters.
#Examples:
Kata.getMiddle("test") should return "es"
Kata.getMiddle("testing") should return "t"
Kata.getMiddle("middle") should return "dd"
Kata.getMiddle("A") should return "A"
#Input
A word (string) of length 0 < str < 1000 (In javascript you may get slightly more than 1000 in some test cases due to an error in the test cases). You do not need to test for this. This is only here to tell you that you do not need to worry about your solution timing out.
#Output
The middle character(s) of the word represented as a string.
*/


import java.util.stream.Stream;

public class Kata {
    public static String getMiddle(String word) {
        int length = word.length();
        
        return Stream.of(word)
                .map(str -> str.substring((length - 1) / 2, length / 2 + 1))  //To extract the middle character(s) we calculate the starting index of the substring as (length - 1) / 2 and the ending index as length / 2 + 1. This ensures that we get the correct middle character(s) for both odd and even length words.
                .findFirst()  //retrieve the first (and only) element in the stream, which represents the middle character(s) as a substring.
                .orElse(""); //return an empty string if no middle character(s) are found.
    }
}
