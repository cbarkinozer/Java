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
        boolean status=false;
        
        for(int i=0;i<text.size();i++){
            if(!(text.get(i+1)==null)){
                if(text.get(i).length() != text.get(i) ){
                    status=false;
                }else{
                    
                    char[] Array1=text.get(i).toCharArray();
                    char[] Array2=text.get(i).toCharArray();
                    
                    Arrays.sort(Array1);
                    Arrays.sort(Array2);
                    
                    status=Arrays.equals(Array1,Array2);
                }
            }
            if(status){
                text.remove(i+1);
            }
        }
        Collections.sort(text);
        return text;
    }
    public static List<String> funWithAnagrams2(List<String>text){
        //Stream solution
        return text.get(0);
    }
    public static void main(String[] args){
        
        
    }
}
