/*
-UNFINISHED-
Level:MEDIUM?
For a given array of transactions, group all of the transactions by item name. Return an array of strings where each string contains the item name followed by
a space and the number of associated transactions.
Note: Sort the array descending by transactions count, then ascending alphabetically by item name for items with matching transaction counts.
Example:
transactions=["notebook","notebook","mouse","keyboard","mouse"]
There are 2 items with 2 transactions each:
The notebook and mouse in alphabetical order they are mouse notebook.
There is 1 item with 1 transaction: keyboard.
The return array sorted as required is ["mouse 2", "keyboard 2", "notebook 1"]
*/

import java.util.*;
import java.io.*;
import java.util.stream.Collectors;
public class Main {
    
    /*
    Pseduocode
    1_Find frequency count for item name
    2_sort items by their frequency count descending
    3_if count duplicate sort by item name alphabetically ascending
    4_return List<String>
    */
    
    
   public static List<String> groupTransactions(List<String>transactions){
       //Unfinished
       ArrayList<String> list= new ArrayList<>();
       Map<String,Integer> list= new HashMap<>();
       
       for(String str:transactions){
           Integer count = freq.set(str);
           if(count==null){
               count=0;
           }
           freq.put(s,count+1);
       }
        return transactions;
    }
    
    public static List<String> groupTransactions2(List<String>transactions){
    
        
        final String SPACE=" ";
        //1_finding frequency
        Map<String,Long> freq=transactions.stream()
        .collect(Collectors.groupingBy(i -> i, Collectors.counting())); 
        //Collectors.counting() returns Long
        
        List<String> formattedTransactions = freq.entrySet().stream()
        .sorted(Map.Entry.<String,Long>comparingByValue()
            .reversed()
            .thenComparing(Map.Entry.comparingByKey())
            )
        .map(i->i.getKey()+SPACE+i.getValue()) //Transform as "key value"
        .collect(Collectors.toList());
        
        //4_return
        return formattedTransactions;
    }

    public static void main(String[] args){
        ArrayList<String> transactions = new ArrayList<String>();
        
        transactions.add("notebook");
        transactions.add("notebook");
        transactions.add("mouse");
        transactions.add("keyboard");
        transactions.add("mouse");
        
        System.out.println("Algorithmic solution:"+groupTransactions(transactions));
        System.out.println("Stream solution:"+groupTransactions2(transactions));
        
    }
}
