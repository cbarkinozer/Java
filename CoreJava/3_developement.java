         //Java Collection's Framework
         /*
                 Framework consists of libaries. Libary is predefined methods and classes. Your code calls libaries but your code gets called by framework. 
                 Java Collection's framework consists of many interfaces and libaries that are used for problems such as grouping and doing operations on similar data.
                 Collection framework consists list, queue, set, map structures  ( map does not inherits the Collection interface contrary to others).
                 
                 //ArrayList
                 Arrays have fixed amount of element. Arrays are faster. Arrays hold primitive type variables.
                 ArrayLists hold reference-type variables. There are more predefined methods inside ArrayLists.
                 Inheritance relationship: ArrayList<List<Collection<Iterable.
                 
                 //LinkedList
                 Elements are NOT stored in contiguous locations, every element is a separate object with 2 parts, data and address of the next node.
                 ArrayList and LinkedList time complexity comparison:
                 Note: LinkedList has bigger space-complexity than ArrayList.
                 When adding to the head of the list: LinkedList is faster. When adding to the tail of the list: ArrayList is faster.
                 
                 //Set
                 Sets hold non-duplicate values not stored in insertion order. There are 2 extensions, TreeSet (ordered by value or alphabetically) and HashSet (non-ordered).
                 HashSet has O(1) time complexity for all search, add algorithms. HashSet has larger space complexity.
                 
                 //Map
                 Holds key and value pairs. Has O(1) complexity. In contrast to set, you need to give key for the values in map.
                 
                 Collections.sort(collection_name); //To sort a collection
                 
                 Example: Find character frequency of a sentence using a map:
         */
                  import java.util.*;
                  public class Main{
                           public static void main(String[] args){
                                    String sentence = new String("Hello Java");
                                    TreeMap<Character,Integer> frequency= new TreeMap<Character,Integer>();
                                    for(int i=0;i<sentence.length();i++){
                                             char c = sentence.charAt(i);
                                             if(frequency.containsKey(c)){
                                                      frequency.replace(c,frequency.get(c)+1);
                                             }else{
                                                      frequency.put(c,1);
                                    }
                           }
                                    for(Map.Entry<Character,Integer> entry: frequency.entrySet()){
                                             System.out.println("Key: "+entry.getKey()+" Value: "+entry.getValue());
                                    }   
                           }
         
         //Comparing your objects using Comparable interface. By doing this you can sort your objects by only one rule.
         
         class Player implements Comparable<Player>{
                  private String name;
                  private int id;
                  public Player(String name, int id){
                           this.name=name;
                           this.id=id;
                  }
                  @Override
                  public String toString(){
                           return id+name;
                  }
                  @Override
                  public int compareTo(Player player){ //We can override compareTo method as we pleased and sort our objects by this order
                           if(this.id<player.id){
                                    return -1;
                           }else if(this.id>player.id){
                                    return 1;
                           }
                           return 0;
                  }
         }
          public class Main{
                           public static void main(String[] args){
                                    ArrayList<Player> playerList = new ArrayList<Player>();
                                    playerList.add(new Player("player1",1));
                                    playerList.add(new Player("player2",2));
                                    Collection.sort(playerList);
                           }
          }                           
                           
         //If we want diferrent sorting rules applied to our objects when we sort them, we implement the Comparator interface.                           
         
          public class sortByDescending implements Comparator<String>{
                  @Override
                   public int compare(String s1, String s2){
                            return -o1.compareTo(o2);
                   }
          }                 
          
         public class Main{
                           public static void main(String[] args){
                                    ArrayList<Player> playerList = new ArrayList<Player>();
                                    playerList.add(new Player("player1",1));
                                    playerList.add(new Player("player2",2));
                                    Collection.sort(playerList,new sortByDescending());
                           }
          } 
                           
         //Exception Handling
        //Java I/O (Input/Output)
        //Multithreading and Concurrency
        //UI developement with Swing
        //JDBC and Mysql
