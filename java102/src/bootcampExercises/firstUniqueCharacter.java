/*
A unique character is one that appears only once in a string.
Given a string consisting of lowercase English letters only,return the index of the first occurrence of a unique character in
the string using 1-based indexing. If the string does not contain any unique character, return -1.

Example
s="statistics"
The unique characters are [a,c] among which, a occurs first.
Using 1-based indexing it is at index 3.

Example 
s="falafal"
Should return -1 because there are no unique characters.
*/
public static int getUniqueCharacter(String s) {
        
        Set<Character> deletedChars= new HashSet<>(); //Stores deleted chars
        
        int index=0;
        
        for(int i=0; i<s.length(); i++){ //For every char in the string
                
            char c = s.charAt(i); //Hold the char
            index = s.indexOf(c); //Hold the index
            
            s = s.replaceFirst(String.valueOf(c)," "); //Replace that chars first occurrence with space
                 
            if(s.contains(String.valueOf(c))==false){ //If that char does not exist anymore (unique)
                
                if(deletedChars.contains(c)==false){ //If that char did not deleted before
                  
                    return index+1; //Return 1-based indexing  
                }
                
                
            }
              deletedChars.add(c); //Save the car if that char is not unique or deleted before
            
        }
            
        return -1; //If there are no unique chars return -1
    }
