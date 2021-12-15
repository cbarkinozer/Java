/*
-UNFINISHED-
Level:MEDIUM
Formatted Division
Have the function FormattedDivision(num1,num2) take both parameters being passed, divide num1 by num2,
and return the result as a string with properly formatted commas and 4 significant digits after the decimal place.
For example:
if num1 is 123456789 and num2 is 10000 the output should be "12,345.6789".
The output must contain a number in the one's place even if it is a zero.
Examples
Input: 2 & num2 = 3
Output: 0.6667
Input: 10 & num2 = 10
Output: 1.0000
*/
import java.util.*; 
import java.io.*;
import java.text.DecimalFormat;

class Main {

  public static String FormattedDivision(int num1, int num2) {
    /*
    int result=0;
    int remainder=0;
    String strResult = new String();

    result=num1/num2; //integer part
    remainder=num1%num2; //remainder part
    strResult=String.valueOf(result); //strResult is integer part as string
    int len =strResult.length();
    int a=0,b=1,c=2;
    StringBuffer newStr = new StringBuffer(strResult);
    
    //Below part does not work
    for(int i=0;i<len;i++){
      
      if(len%3==0& i%3==c){
        newStr.insert(i+1,",");
        a+=3;
      }else if(len%3==1& i%3==a){
        newStr.insert(i+1,",");
        b+=2;
      }else if(len%3==2& i%3==b){
        newStr.insert(i+1,",");
        c+=4;
      }
      
    }
    strResult=strResult.toString();
    return strResult+"."+remainder;
    */
    
    String str= new String();
    DecimalFormat decimalFormat= new DecimalFormat("0.0000");
    str=String.valueOf(decimalFormat.format(num1/num2));
    return str;
    //Does not add commas
    // Prints 12345.6789 instead of 12,345.6789
    
  }

  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(FormattedDivision(s.nextLine())); 
  }

}
