/*
  level:HARD
Have the function LineOrdering(strArr) read the strArr parameter being passed which will represent the relations among people standing in a line.
The structure of the input will be ["A>B","B>C","A<D",etc..].
The letters stand for different people and the greater than and less than signs stand for a person being in front of someone or behind someone.
A>B means A is in front of B and B<C means that B is behind C in line. For example if strArr is: ["J>B","B<S","D>J"],
these are the following ways you can arrange the people in line: DSJB, SDJB and DJSB. Your program will determine the number of ways people can be arranged in line.
So for this example your program should return the number 3.
It also may be the case that the relations produce an impossible line ordering, resulting in zero as the answer.
Only the symbols <, >, and the uppercase letters A...Z will be used. The maximum number of relations strArr will contain is ten.
Examples
Input: new String[] {"A>B","A<C","C<Z"}
Output: 1
Input: new String[] {"A>B","B<R","R<G"}
Output: 3
1. For input new String[] {"A>B","A<C","C<Z"} the output was incorrect. The correct output is 1
2. For input new String[] {"A>B","B<R","R<G"} the output was incorrect. The correct output is 3
3. For input new String[] {"J>B","B<S","D>J"} the output was incorrect. The correct output is 3
4. For input new String[] {"A>B","B<C"} the output was incorrect. The correct output is 2
5. For input new String[] {"A>B","B>C","C>D"} the output was incorrect. The correct output is 1
6. For input new String[] {"A>B","B>C","C>D","G>D"} the output was incorrect. The correct output is 4
7. For input new String[] {"A>B","B>C","C>D","D>E","G>E"} the output was incorrect. The correct output is 5
8. For input new String[] {"A>B","C>B","A<Q"} the output was incorrect. The correct output is 3
9. For input new String[] {"A<B","B>A"} the output was incorrect. The correct output is 1
10. For input new String[] {"A>C"} the output was incorrect. The correct output is 1
*/

import java.util.*; 
import java.io.*;

class Main {
  
  static ArrayList<Character> order = new ArrayList<>();

  public static int LineOrdering(String[] strArr) {  
    int maxRelations=0;
    addListByOrder(strArr);
    return maxRelations;
  }

  public static void addListByOrder(String[] strArr){
    for(int i=0;i<strArr.length;i++){
     Character firstChar =  strArr[i].charAt(0);
     Character secondChar =  strArr[i].charAt(2);
     if(order.contains(firstChar)){
        for(int i=0;i<order.size();i++){
          //Add new char to existing char
          order.add(order.indexOf(firstChar,secondChar)); 
        }

      }else if(order.contains(secondChar)){
        order.add(order.indexOf(secondChar,firstChar));
        
     }else{ //New pair of chars

       if(strArr[i].charAt(1)=='>'){
        order.add(firstChar);
        order.add(secondChar);
      }else{ // symbol is '<'
        order.add(secondChar);
        order.add(firstChar);
      }

     } 

    }  
  }


  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(LineOrdering(s.nextLine())); 
  }

}
