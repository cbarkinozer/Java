/*
-UNFINISHED-
Level:MEDIUM?
An e-commerce site tracks the purchases made each day. The product that is purchased the most one day is the featured product for the following day.
If there is a tie for the product purchased most frequently, those product names are ordered alphabetically ascending and the last name in the list is chosen.
Example
products=["redShirt","greenPants","redShirt","orangeShoes","blackPants","blackPants"]
redShirt and blackPants are ordered 2 times in that day. So products are ordered alphabetically.
redShirt is the last product listed so it is selected.
Function has a string products[n] array. 1<= n <=10^4.
Function should return selected product as a string.
*/
import java.util.*;
import java.io.*;
public class Main {
    public static String featuredProduct(List<String>products){
        ArrayList<Integer> count= new ArrayList<Integer>();
        for(int i=0;i<products.size();i++){
            count.add(0);
        }
        for(int i=0;i<products.size();i++){
            if(Arrays.asList(products).contains(products.get(i))){
                count.set(i,count.get(i)+1);
            }
        }
        if(Arrays.asList(count).contains(Collections.max(count))){
            Collections.sort(products);
            return products.get(products.size()-1);
        }
        return products.get(count.indexOf(Collections.max(count)));
    }

    public static void main(String[] args){
        
        
    }
}
