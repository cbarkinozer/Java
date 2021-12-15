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
public class Main {
    
    /*
    Pseduocode
    1_Find frequency count for item name
    2_sort items by their frequency count descending
    3_if count duplicate sort by item name alphabetically ascending
    4_return List<String>
    */
    
    
    public static List<String> groupTransactions(List<String>transacitons){
    
        
        
    }
    public static List<String> groupTransactions2(List<String>transacitons){
    
        
        final String SPACE=" ";
        //1_finding frequency
        Map<String,Integer> freq=transactions.stream()
        .collect(Collectors.groupingBy(i->i,Collectors.counting()));
        
        List<String> formattedTransactions = freq.entrySet().stream()
        .sorted(Map.Entry<String,Integer>ComparingByValue()
            .reversed()
            .thenComparing(Map.Entry.comparingByKey())
            )
        .map(i->i.getKey()+SPACE+e.getValue()) //Transform as "key value"
        .collect(Collectors.toList());
        
        //4_return
        return formattedTransactions;
    }

    public static void main(String[] args){
        ArrayList<String> transactions = new ArrayList<>("notebook","notebook","mouse","keyboard","mouse");
        
        System.out.println("Algorithmic solution:"+groupTransactions(transactions));
        System.out.println("Stream solution:"+groupTransactions2(transactions));
        
    }
}
