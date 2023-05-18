/*
Given a string of words, you need to find the highest scoring word.
Each letter of a word scores points according to its position in the alphabet: a = 1, b = 2, c = 3 etc.
For example, the score of abad is 8 (1 + 2 + 1 + 4).
You need to return the highest scoring word as a string.
If two words score the same, return the word that appears earliest in the original string.
All letters will be lowercase and all inputs will be valid.
*/

import java.util.Arrays;
import java.util.Comparator;

public class Kata {

public static String high(String words) {
    return Arrays.stream(words.split("\\s"))
            .max(Comparator.comparingInt(word->word.chars().map(ch->ch- 'a'+1).sum()))
            .orElse("");
  }
}
