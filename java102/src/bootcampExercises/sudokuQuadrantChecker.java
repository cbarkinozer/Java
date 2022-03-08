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
1. For input new String[] {"(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,5,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,8)"} the output was incorrect. The correct output is legal
2. For input new String[] {"(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,5,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,4)","(9,1,2,3,4,5,6,7,8)"} the output was incorrect. The correct output is legal
3. For input new String[] {"(1,2,3,4,5,6,7,8,9)","(4,5,6,x,x,x,x,x,x)","(7,8,9,x,x,x,x,x,x)","(2,3,4,x,x,x,x,x,x)","(5,6,7,x,x,x,x,x,x)","(8,9,1,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,1)"} the output was incorrect. The correct output is legal

*/
import java.util.*; 
import java.io.*;

class Main {

  
  public static void main (String[] args) {   
    Scanner s = new Scanner(System.in);
    System.out.print(SudokuQuadrantChecker(s.nextLine())); 
  }


  public static String SudokuQuadrantChecker(String[] strArr) {
    
    ArrayList<ArrayList<Character>> board = buildBoard(strArr);

    TreeSet<Integer> failedQuadrants = new TreeSet<>();

    for(int i = 0; i < 9; i++){
      
      for(int j = 0; j < 9; j++){
        
        isFoundInRow(board, i, failedQuadrants);
        
        isFoundInColumn(board, j, failedQuadrants);
        
        checkBox(board, i-i % 3, j - j%3, failedQuadrants);
      
      }
    
    }

    StringBuilder stringBuilder = new StringBuilder();
    
    for(int i : failedQuadrants){
      
      stringBuilder.append(String.format("%d,", i));
    
    }

    return stringBuilder.toString().substring(0, stringBuilder.length()-1);
  
  }


  public static ArrayList<ArrayList<Character>> buildBoard(String[] strArr){
     
     ArrayList<ArrayList<Character>> board = new ArrayList<>();
     
     for(int i=0; i < strArr.length; i++){
      
      ArrayList<Character> row = new ArrayList<>();
      
      for(int j = 0; j < strArr[i].length(); j++){

        if(Character.isDigit(strArr[i].charAt(j))){
          
          row.add(strArr[i].charAt(j));
        
        }else if(strArr[i].charAt(j) == 'x'){
          row.add('x');
        } 
      
      }

      board.add(row);
    
    }

    return board;
  
  }

  
  public static boolean isFoundInRow(ArrayList<ArrayList<Character>> board, int row, TreeSet<Integer> failed) {

    HashMap<Character, Integer> hMap = new HashMap<>();
    
    boolean found = false;
    
    for(int i = 0; i < 9; i++){
      
      if(hMap.containsKey(board.get(row).get(i))) {
        
        failed.add(findQuadrantNumber(row, i));
        
        failed.add(hMap.get(board.get(row).get(i)));
        
        found = true;
      
      }
      
      if(board.get(row).get(i) != 'x') {
        
        hMap.put(board.get(row).get(i), findQuadrantNumber(row, i));
        
      }
    
    }
    
    return !found;
  
  }


  public static int findQuadrantNumber(int row, int column) {
    
    int a = row / 3;
    
    int b = column / 3;

    return (a*3) + b + 1;
  
  }


  public static boolean isFoundInColumn(ArrayList<ArrayList<Character>> board, int col,  TreeSet<Integer> failed) {

   HashMap<Character, Integer> hMap = new HashMap<>();
   
   boolean found = false;

    for(int i = 0; i < 9; i++){
      
      if(hMap.containsKey(board.get(i).get(col))){
        
        failed.add(findQuadrantNumber(i, col));
        
        failed.add(hMap.get(board.get(i).get(col)));

        found = true;
      
      }

      if(board.get(i).get(col) != 'x') {
        
        hMap.put(board.get(i).get(col), findQuadrantNumber(i,col));
      
      }
    
    }
    
    return !found;

    }

    public static boolean checkBox(ArrayList<ArrayList<Character>> board, int startRow, int startCol,  TreeSet<Integer> failed){
          
          HashMap<Character, Integer> hMap = new HashMap<>();
          
          boolean found = false;

          for(int row = 0; row < 3; row ++ ){
            
            for(int col=0; col < 3; col++ ){
              
              char curr = board.get(row + startRow).get(col+startCol);

              if( hMap.containsKey(curr) ){
                
                failed.add(findQuadrantNumber(row + startRow, col+startCol));
                
                failed.add(hMap.get(curr));
                
                found = true;

              }

              if(curr != 'x'){

               hMap.put(curr, findQuadrantNumber(row + startRow, col+startCol));
              
              }
            
            }
          
          }

          return true;
    }


}

//-----------------------------------------------------------------------------------------------------------------------------------
//ANOTHER SOLUTION




import java.util.*;
import java.util.stream.Collectors;

public class SudokuChecker {
    public static ArrayList<Integer[]> quadLocation = new ArrayList<>() ;
    public static HashSet<Integer> invalids = new HashSet<>();

    public static String sudokuQuadrantChecker(String[] arr) {
        ArrayList<ArrayList<String>>board = buildBoard(arr);
        fillQuadHash();

        for(int i = 0 ; i < board.get(0).size() ; i++) {
            //System.out.println(quadLocation.get(i)[0]);
            //System.out.println(board.get(i));
            checkRow(board.get(i),i);
        }
        //ArrayList<ArrayList<String>>quad = buildQuadrant(board);
        //System.out.println("\n" + buildColumn(board,0));

        for(int i = 0 ; i < board.get(0).size() ; i++) {
            checkColumn(buildColumn(board, i),i);
        }

        for(int i = 0 ; i < board.get(0).size() ; i++) {
            checkQuadrant(buildQuad(board,i),i);
            //System.out.println(buildQuad(board,i));
        }
        if(invalids.isEmpty()){
            return "legal";
        }
        List<Integer> strArr = invalids.stream().collect(Collectors.toList());
        Collections.sort(strArr);
        return strArr.stream().map(String::valueOf).collect(Collectors.joining(","));
    }
    public static ArrayList<ArrayList<String>> buildBoard(String[] arr){
        //Cleaning
        ArrayList<ArrayList<String>> board = new ArrayList<>();
        for(String n : arr){
            char[] nChar = n.toCharArray();
            ArrayList<String> row = new ArrayList<>();
            for(char c : nChar){
                if(Character.isDigit(c)){
                    row.add(Character.toString(c));
                }
                else if(c == 'x'){
                    row.add("x");
                }
            }
            board.add(row);
        }
        return board;
    }
    public static void fillQuadHash(){
        quadLocation.add(new Integer[]{3,3});
        quadLocation.add(new Integer[]{3,6});
        quadLocation.add(new Integer[]{3,9});
        quadLocation.add(new Integer[]{6,3});
        quadLocation.add(new Integer[]{6,6});
        quadLocation.add(new Integer[]{6,9});
        quadLocation.add(new Integer[]{9,3});
        quadLocation.add(new Integer[]{9,6});
        quadLocation.add(new Integer[]{9,9});
    }
    public static ArrayList<String> buildQuad(ArrayList<ArrayList<String>> board,int quadNum){
        int x = quadLocation.get(quadNum)[0];
        int y = quadLocation.get(quadNum)[1];
        ArrayList<String> quad = new ArrayList<>();
        for(int i = x - 3 ; i < x ; i++){
            for(int j = y -3 ; j < y ; j++){
                quad.add(board.get(i).get(j));
            }
        }
        return quad;
    }
    public static ArrayList<String> buildColumn(ArrayList<ArrayList<String>> board, int i){
        //ArrayList<ArrayList<String>> transpose = new ArrayList<>();
        //i = row number
        ArrayList<String>column= new ArrayList<>();
        for(ArrayList<String> row : board){
            column.add(row.get(i));
        }
        return column;
    }
    public static int isValid(int x , int y ) {
        int a, b ,loc = 0;
        for(int i = 0 ; i < quadLocation.size() ; i++){
            a = quadLocation.get(i)[0];
            b = quadLocation.get(i)[1];
            if( a-3 <= x && x < a && b-3 <= y && y < b){
                loc = ++i; //compiler ++ order !!!
            }
        }
        return loc;
    }
    public static void checkRow(ArrayList<String> row,int k){
        //If it is too slow , convert it to hashmap
        String a , b ;
        //ArrayList<Integer> invalids = new ArrayList<>();
        for(int i = 0 ; i < row.size() ; i++){
            for(int j = 0 ; j < row.size() ; j++){
                a = row.get(i);
                b = row.get(j);
                if(a.equals(b) && !a.equals("x") && i != j){
                    //System.out.println(k + " " + j);
                    invalids.add(isValid(k,j));
                }
            }
        }
    }
    public static void checkColumn(ArrayList<String> row,int k){
        //If it is too slow , convert it to hashmap
        String a , b ;
        //ArrayList<Integer> invalids = new ArrayList<>();
        for(int i = 0 ; i < row.size() ; i++){
            for(int j = 0 ; j < row.size() ; j++){
                a = row.get(i);
                b = row.get(j);
                if(a.equals(b) && !a.equals("x")  && i != j){
                    //System.out.println(k + " " + j);
                    invalids.add(isValid(j,k));
                }
            }
        }
    }
    public static void checkQuadrant(ArrayList<String> row,int k){
        //If it is too slow , convert it to hashmap
        String a , b ;
        //ArrayList<Integer> invalids = new ArrayList<>();
        for(int i = 0 ; i < row.size() ; i++){
            for(int j = 0 ; j < row.size() ; j++){
                a = row.get(i);
                b = row.get(j);
                if(a.equals(b) && !a.equals("x")  && i != j){
                    //System.out.println(k + " " + j);
                    invalids.add(k+1);
                }
            }
        }
    }
    public static void main(String[] args) {
        // 1) keep x
        // 3,4,5,9
        String[] arr = {
                "(1,2,3,4,5,6,7,8,9)",
                "(x,x,x,x,x,x,x,x,x)",
                "(6,x,5,x,3,x,x,4,x)",
                "(2,x,1,1,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,9)"};
        String[] arr2 = {
                "(1,1,3,4,5,6,7,8,1)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(1,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)",
                "(x,x,x,x,x,x,x,x,x)"};
        String[] arr3 = {"(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,1,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)"};
        String[] arr4 = {"(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,5,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,8)"};
        String[] arr5 = {"(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,5,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,4)","(9,1,2,3,4,5,6,7,8)"};
        String[] arr6 = {"(1,2,3,4,5,6,7,8,9)","(4,5,6,1,2,3,x,x,x)","(7,8,9,x,x,6,x,x,x)","(2,3,4,x,x,x,x,x,x)","(5,6,7,x,x,x,x,x,x)","(8,9,1,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,1)"};
        String[] arr7 = {"(1,2,3,4,5,6,7,8,9)","(x,x,x,x,x,x,x,x,x)","(6,x,5,x,3,x,x,4,x)","(2,x,1,5,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,x)","(x,x,x,x,x,x,x,x,9)","(9,1,2,3,4,5,6,7,8)"};
        System.out.println(sudokuQuadrantChecker(arr4));
    }

}


