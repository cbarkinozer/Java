/*
-UNFINISHED-
Level:MEDIUM?
Two strings are anagrams if they are permutations of each other. In other words, both stirngs have the same size and the same characters.
For example: "aaagamnrs" is an anagram of "anagrams". Give an array of string, remove each string that is an anagram of an earlier string,
then return the remaining array in sorted order.
Example: str=["code","doce","ecod","framer","frame"]
code and doce are anagrams, remove doce and keep code. Code and ecod are anagrams remove ecod and keep code.
Code and framer are not anagrams keep both. framer and frame are not anagrams because of the extra 'r' in framer.
Keep both strings. Order them in ascending order.
string text[n]. 0<=n<=1000.
*/

import java.util.*;
import java.io.*;
public class Main {
    public static List<String> funWithAnagrams(List<String>text){
    }

    public static void main(String[] args){
        String[] strArr= new String[] {"0011", "0010"} ;
        System.out.println("Correct Result: 2 . Your Result: "+function(strArr));
        
    }
}
