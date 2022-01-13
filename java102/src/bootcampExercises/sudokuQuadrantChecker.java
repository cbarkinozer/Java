/*
level: HARD

Sudoku Quadrant Checker
Have the function SudokuQuadrantChecker(strArr) read the strArr parameter being passed which will represent a 9x9 Sudoku board of integers ranging from 1 to 9.
The rules of Sudoku are to place each of the 9 integers integer in every row and column and not have any integers repeat in the respective row, column, or 3x3 sub-grid.
The input strArr will represent a Sudoku board and it will be structured in the following format:
["(N,N,N,N,N,x,x,x,x)","(...)","(...)",...)] where N stands for an integer between 1 and 9 and x will stand for an empty cell. Your program will determine if the board is legal;
the board also does not necessarily have to be finished. If the board is legal, your program should return the string legal but if it isn't legal,
it should return the 3x3 quadrants (separated by commas) where the errors exist. The 3x3 quadrants are numbered from 1 to 9 starting from top-left going to bottom-right.

For example, if strArr is:
["(1,2,3,4,5,6,7,8,1)",
"(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(1,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)",
"(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)"] 
then your program should return 1,3,4 since the errors are in quadrants 1, 3 and 4 because of the repeating integer 1.

Another example, if strArr is:
["(1,2,3,4,5,6,7,8,9)",
"(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,1,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)",
"(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,9)"] 
then your program should return 3,4,5,9.

*/
import java.util.*; 
import java.io.*;

class Main {

  public static ArrayList<ArrayList<Character>> buildBoard(String[] strArr){
     ArrayList<ArrayList<Character>> board = new ArrayList<>();
     for(int i=0; i < strArr.length; i++){
      ArrayList<Character> row = new ArrayList<>();
      for(int j = 0; j < strArr[i].length(); j++){

        if(Character.isDigit(strArr[i].charAt(j)))
        {
          row.add(strArr[i].charAt(j));
        }
        else if(strArr[i].charAt(j) == 'x') row.add('x');
      }

      board.add(row);
    }

    return board;
  }

  public static int findQuadrantNumber(int row, int column) {
    int a = row / 3;
    int b = column / 3;

    return (a*3) + b + 1;
  }

  public static boolean checkRow(ArrayList<ArrayList<Character>> board, int row, TreeSet<Integer> failed) {

    HashMap<Character, Integer> st = new HashMap<>();
    boolean found = false;
    for(int i = 0; i < 9; i++){
      if(st.containsKey(board.get(row).get(i))) {
        failed.add(findQuadrantNumber(row, i));
        failed.add(st.get(board.get(row).get(i)));
        found = true;
      }
if(board.get(row).get(i) != 'x') {
        st.put(board.get(row).get(i), findQuadrantNumber(row, i));
        }
    }
    return !found;
  }

  public static boolean checkCol(ArrayList<ArrayList<Character>> board, int col,  TreeSet<Integer> failed) {

   HashMap<Character, Integer> st = new HashMap<>();
    boolean found = false;

    for(int i = 0; i < 9; i++){
      if(st.containsKey(board.get(i).get(col))){
        failed.add(findQuadrantNumber(i, col));
        failed.add(st.get(board.get(i).get(col)));

        found = true;
      }

      if(board.get(i).get(col) != 'x') {
        st.put(board.get(i).get(col), findQuadrantNumber(i,col));
      }
    }
    return !found;

    }
public static boolean checkBox(ArrayList<ArrayList<Character>> board, int startRow, int startCol,  TreeSet<Integer> failed){
          HashMap<Character, Integer> st = new HashMap<>();
    boolean found = false;

          for(int row = 0; row < 3; row ++){
            for(int col=0;col < 3; col++){
              char curr = board.get(row + startRow).get(col+startCol);

              if(st.containsKey(curr)){
                failed.add(findQuadrantNumber(row + startRow, col+startCol));
                failed.add(st.get(curr));
                found = true;

              }

              if(curr != 'x'){

               st.put(curr, findQuadrantNumber(row + startRow, col+startCol));
              }
            }
          }

          return true;
    }


  public static String SudokuQuadrantChecker(String[] strArr) {
    ArrayList<ArrayList<Character>> board = buildBoard(strArr);

    TreeSet<Integer> failedQuadrants = new TreeSet<>();

    for(int i = 0; i < 9; i++){
      for(int j = 0; j < 9; j++){
        checkRow(board, i, failedQuadrants);
        checkCol(board, j, failedQuadrants);
        checkBox(board, i-i % 3, j - j%3, failedQuadrants);
      }
    }

    StringBuilder stringBuilder = new StringBuilder();
    for(int i : failedQuadrants){
      stringBuilder.append(String.format("%d,", i));
    }


    return stringBuilder.toString().substring(0, stringBuilder.length()-1);
  }

  public static void main (String[] args) {
    // keep this function call here
    Scanner s = new Scanner(System.in);
    System.out.print(SudokuQuadrantChecker(s.nextLine())); 
  }
/*
  (1,2,3,4,5,6,7,8,9)
  (x,x,x,x,x,x,x,x,x)
  (6,x,5,x,3,x,x,4,x)
  (2,x,1,1,x,x,x,x,x)
  (x,x,x,x,x,x,x,x,x)
  (x,x,x,x,x,x,x,x,x)
  (x,x,x,x,x,x,x,x,x)
(x,x,x,x,x,x,x,x,x)
  (x,x,x,x,x,x,x,x,9)"
  */

}
