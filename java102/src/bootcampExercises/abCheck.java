/*
UNFINISHED
LEVEL:EASY
AB Check
Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters a and b are separated by exactly 3 places anywhere
in the string at least once (ie. "lane borrowed" would result in true because there is exactly three characters between a and b). Otherwise return the string false.
Examples
Input: "after badly"
Output: false
Input: "Laura sobs"
Output: true
TEST CASES
1. For input "after it" the output was incorrect. The correct output is false

2. For input "Laura sobs" the output was incorrect. The correct output is true

3. For input "away obe" the output was incorrect. The correct output is true

4. For input "noah obe" the output was incorrect. The correct output is true

5. For input "far ebs" the output was incorrect. The correct output is true

6. For input "aaaaddddd" the output was incorrect. The correct output is false

7. For input "123advb" the output was incorrect. The correct output is false

8. For input "123adzvb" the output was incorrect. The correct output is true

9. For input "abccccazzzb" the output was incorrect. The correct output is true

10. For input "bzzza" the output was incorrect. The correct output is true
*/

import java.util.; 
import java.io.;

class Main {

  public static String ABCheck(String str) {
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'a'  str.charAt(i) == 'b') {
        int count = 0;
        for (int j = i+1; j < str.length(); j++) {
          if (((str.charAt(j) == 'b' && str.charAt(i) == 'a')  (str.charAt(j) == 'a' && str.charAt(i) == 'b')) && count == 3) {
            return "true";
          }
          count++;
        }
      }
    }
    return "false";
  }

  public static void main (String[] args) { 
Scanner s = new Scanner(System.in);
    System.out.print(ABCheck(s.nextLine())); 
  }

}
