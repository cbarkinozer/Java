/*
Check to see if a string has the same amount of 'x's and 'o's. The method must return a boolean and be case insensitive. The string can contain any char.

Examples input/output:

XO("ooxx") => true
XO("xooxx") => false
XO("ooxXm") => true
XO("zpzpzpp") => true // when no 'x' and 'o' is present should return true
XO("zzoo") => false
*/

import java.util.stream.Stream;

public class XO {
  
  public static boolean getXO (String str) {
    
        str = str.toLowerCase();
    
        long countX = str.chars()
                .filter(ch -> ch == 'x')
                .count();
        
        long countO = str.chars()
                .filter(ch -> ch == 'o')
                .count();
        
        return countX == countO;
    
  }
}
