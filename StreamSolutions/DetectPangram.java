/*
A pangram is a sentence that contains every single letter of the alphabet at least once. For example, the sentence "The quick brown fox jumps over the lazy dog" is a pangram, because it uses the letters A-Z at least once (case is irrelevant).
Given a string, detect whether or not it is a pangram. Return True if it is, False if not. Ignore numbers and punctuation.
*/

import java.util.stream.Collectors;
public class PangramChecker {
  public boolean check(String sentence){
        return "abcdefghijklmnopqrstuvwxyz".chars()
                .mapToObj(c -> String.valueOf((char) c))
                .allMatch(sentence.toLowerCase()::contains);
  }
}

//OR

public class PangramChecker {
  public boolean check(String sentence){
  	return sentence.chars().map(Character::toLowerCase).filter(Character::isAlphabetic).distinct().count() == 26;
  }
}

