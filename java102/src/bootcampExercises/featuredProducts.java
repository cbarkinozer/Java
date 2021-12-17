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
        Map<String,Integer> map= new HashMap<>();
        for(String str: products){
            if(map.get(str)!=null){ //If there are elements
                map.put(str,map.get(str)+1);
            }else{
                map.put(input,1); //If there are elements key is 1
            }
        }
            int maxVal = Collections.max(map.values();
            ArrayList<Integer> num= new ArrayList<>();
            //Iterate hashmap
            for(Entry<String,Integer> entry: map.entrySet()){
                if(entry.getValue()==maxVal){
                    num.add(entry.getKey());
                }
                if(num.size()==1){
                    return entry.getKey();
                }else if(num.size()>1){
                    Collections.sort(products);
                    return products.get(products.size()-1);
                }
            }
        }
    }
    public static String featuredProduct2(List<String>products){
        //Stream solution
        return products[0];
    }
    public static void main(String[] args){
        
        
    }
}
