import java.util.*;

public class Main {
    public static void main(String[] args) {
        //In java there are reference types and primitive types
        //Following are primitive types
        //long>int>short>byte
        int a=1; //int is generally prefered
        long b=1; //long is good when you transform integer value to double
        short c=1; //Prefered for limited integer values
        byte d=1;   //Holds 8bit data(-128,127). Bit is binary value either 1 or 0.
        float e=1.2f;  //Holds floating points. Do not hold exact value (has precision error).
        double f=1.2; //Generally double is prefered over float. More precise than float. 
        boolean g=true; //Binary data encoded as true(1) and false(0).
        char h='A'; //char is for doing unicode operations.
        char i='\u0152';
        /*
        Use String for character operations.
        There are no unsigned values in java.
        For monetary operations do not use double
        (because of precision error) instead use BigDecimal.
        Strings are not primitve but reference type in Java.
        Think String as words that are coming together from chars.
        Strings are not character arrays. They are immutable.
        Which means you cannot change them at their memory.
        But you can create new ones at new memory places.
        There is garbage collector in Java that if it detects a memory place
        That is not reachable anymore (unbinded with a variable), collects that memory.
        */
        //Your variable names must start with a alphabetical value.
        //You can not give keywords(words that are used for Java programming)
        //to variable such as int, public etc.
        //Also try to use english variable names.
        int value; //Defined a value. You must initialize before using it.
        value=10;
        //Reference type values are defined as followed
        String str = new String(); //Defined a string named str
        str= "Hello User"; //String initialized
        
        System.out.println("You can write what you want it to print");
        System.out.println(value); //Or you can just print a value
        System.out.println(str+value); //Printing values together
        
        


        //Basic arithmetic operations
        int value2=5;
        value= value + value2;
        value = value - value2;
        value= value * value2;
        value = value / value2;
        value = value % value2; //Reminder operation(divides and gets the reminder).
        
        //There are some shortcuts for arithmetic operations that are done on the same variable.
        a=a+1;
        //Also can be done like following
        a+=1;
        //Also like this
        a++;
        //Or
        ++a;
        //++a and a++ are not the same if used in the same sentences.
        //These are caled prefix and postfix.
        //Think them as increment and print value, print and increment value.
        
        //Also for other operations
        a-=1;
        a*=1;
        a/=1;
        
        
        // "+" operation is also does string concatination
        str=str+", Welcome";
        //You can put special commands inside strings to perform several operations.
        //Such as \t is for tab, and \n for new line etc.
        System.out.println(str);
        System.out.println("\n"+str+"\n");
        
        //For more complex operations there are predefined classes such as Math.
        //You can import them using "import" keyword at the beginning of the file.
        
        System.err.println(Integer.MIN_VALUE); //-2^31    (~-2million)
        System.err.println(Integer.MAX_VALUE); //2^31 - 1 (~2million)
        
        //Integer != int. Java is case sensitive and these primitive named classes
        //are wrapper classes. They represent primitive types but are reference types.
        //These reference types also has pre-defined methods for programmers to use.
        
        short j=1000;
        //When an arithmetic operation is done between two different primitive types,
        //result becomes as the type of the larger type.
        int k= (j/2); //Translates value because the translated type has larger space.
        //Which means no data loss.
        
        byte bt=100;
        //byte halfBt=(bt/2); Because there might be data loss, Java does not convert
        //Automatically but you can do it (by accepting the possible value loss).
        byte halfBt = (byte)(bt/2);
        
        
        //How to make 2 variables change their values  ?
        int temp=0;
        int var1=10;
        int var2=20;
        System.out.println("Before swap: "+var1+" and "+var2);
        temp=var2;
        var2=var1;
        var1=temp;
        System.out.println("After swap: "+var1+" and "+var2);
        

        //Try these exercises : calculate BMI and calculate hypotenuse
        
       
        
        //Getting input from user
        Scanner scanner = new Scanner(System.in); 
        //Scanner (import java.util) gets input from System.in
        System.out.println("Enter integer");
        int var = scanner.nextInt(); //Read next int
        //nextLine() reads stirng, next() reads non-space value
        //You can read any other primitive type as well.
        System.out.println("You entered integer: "+var);
        
        
        //Conditional state structures
        if(scanner.hasNextLine()){ //If scanner has next value
            String string = new String();
            string= scanner.nextLine();//Initializing string as input
            System.out.println("You entered following String:"+ string); //Print input
        }else{
            System.out.println("Please enter a String");
        }
       
        
        /*
        Be aware if  value in if skips 0 it can not catch.
        Also floating points such as float and double can not be equal to a given value
        They have precision error. Do not do if( double == 2.5){}. You can prefer
        greater > or smaller < symbols.
        Also String value can not be equal because == operation checks if they have
        The same memory place. You have to use str.equals() or str.equalsIgnoreCase()
        which are predefined methods for String. "abc"=="abc" is legal. str1==str2 is not.
        */
        
        //For loop
        for(int z=0;z<10;z++){ //Generally i is used as index
            if(z%2==0){
                continue;
            }
            System.out.println("Hello floppa"+z);
            if(z==7){
                break;
            }
        }
        
        //While
        int variable3 =0;
        while (variable3 <10){
            variable3++;
        } 
        //Or
        while (variable3 !=0){
            variable3--;
        }
        
        //Do-while first runs it than checks. Only difference between do-while and
        //while is  that extra 1 run at the beginning.
        int until=0;
        do{
            until++;
        }while(until !=10);
        
        
        //Switch
            int door = 2;
            switch (door) {
                case 1:
                    System.out.println("1. door Mr. Gill");
                    break;
                case 2:
                    System.out.println("2. door Mrs. Roy");
                    break;
                case 3:
                    System.out.println("3. door Mr. Jenkins");
                    break;    

            }
          /*
        There are break and continue. You can see break in switch at the top.
        Break breaks the decision structure it is in.
        Continue skips that loop. You can also define a label and jump to that label.
        Using break. These break and continue structures are not prefered often 
        because they are error prone.
        */
         //Array
         //Series of sametype values stored in the memory sequentially.
         int[] array = new array[5]; //Creates 5 integer values (you can not change it's size)
         int[] array2 = {1,2,3,4,5}; //Initializing it's values while creating
         //index numbers 0,1,2,3,4 
         //Warning: be carefull of the indexes. Indexes start from zero and goes to size-1( because mathematically series goes n, n+1, n+2).
         array2[0]=2; //Changing the first element of array
         //Trying to reach to a value that is out of the boundaries will give outofboundaries error. It is very common to get while using arrays, be carefull. 
        //To add or change all values of an array you can use a loop
         for(int i=0;i<5;i++){
            array2[i]=i+1; //Increases every value by 1
         }
         for(int i=0;i<array2.length;i++){ //Checks length every time loop runs
            array2[i]=i+1;
         }
        //You can sort an array using sort method in Arrays library in java.util.Arrays. It is an implementation of QuickSort algorithm.
        Arrays.sort(array2);
        
        //You can not check equality of arrays using "==" because it checks memory adress's equality (same as String equality checking).
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        
        if(array1==array2){ //Prints Not equal.
          System.out.println("Equal");
        }else{
          System.out.println("Not equal");
        }
        
        //Instead use equals() method in Arrays
        
        if(Arrays.equals(array1,array2)){ //Prints Equal.
          System.out.println("Equal");
        }else{
          System.out.println("Not equal");
        }
        
        //Multidimensional arrays
        //You can put array inside arrays
        int[] array = new array[2][2]; //Creates 2 row 2 column matrix(2d array)
        int[] array1 = {{1,2},{3,4}};  //Initializing a matrix (2 arrays inside an array)
        
        //To reach values nested for loops are used
        
        for(int i=0;i<5;i++){ //For every arrray inside the array
            for(int j=0;j<5;j++){ //For values inside the array
            array2[i][j]=j+1; //Increases every value by 1
            }
         }
        
        //If you are not going to perform index operations on array (for example just printing values), you can use foreach loop
        //There is a foreach loop mentality in programming languages, in java this is performed as following:
        for(Integer i: array2){ //For every integer i in array2
            System.out.println(i); //Print every value
        }
        
        //This is also useful for object arrays
        //Let's assume we have: 
        public Account{
            private String name; //attribute
            Account(String name){ //constructor
                this.name=name;
            }
        }
        //... (assume following are inside main function)
        Account[] accountArray={new Account("account_name1"),new Account("account_name1"), new Account("account_name1")};
        for(Account account: accountArray){
            System.out.println(account); 
        }
        /* It prints following:
        account_name1
        account_name2
        account_name3
        */
        //ArrayList
        /*
            The ArrayList class is a resizable array that has predefined useful methods, which can be found in the java.util package.
        */
        ArrayList<String> arrList = new ArrayList<String>(); //You need to give reference type, you can use wrapper classes (e.g Integer) not primitive (e.g int)
        arrList.add("Heartmachine"); //Adding value
        arrList.add("Echo chamber");
        arrList.add("Sleepless");
        arrList.add("Sleepless"); //There can be many amount of same values
        
        System.out.println(arrList.get(0)); //Gets value
        System.out.println(arrList.size()); //Gets size
        System.out.println(arrList.indexOf("Sleepless")); //Gets index (2)
        System.out.println(arrList.lastIndexOf("Sleepless")); //Gets  the last Sleepless' index (3)
        System.out.println(arrList.indexOf("Rot")); // There are no Rot so returns -1
        
        arrList.remove("Echo chamber"); //Deletes element
        arrList.set(2,"Impulse"); //Change 2. element with Impulse
        
        //Boxing, unboxing and autoboxing
        /*
            Wrapper classes are primitive types reference versions to use (e.g in ArrayLists). Boxing is transforming primitive type to it's wrapper class.
            And unboxing is the reverse operation. Autoboxing is boxing that is done by java compiler (automatically).
        */
         ArrayList<Integer> aList = new ArrayList<Integer>();
         int num=0;
            for(int j=0;j<aList.size();j++){
                    aList.add(Integer.valueOf(j*4)); //Boxing
                    num=aList.get(j);                //Unboxing
                    aList.add(j*4);                  //Autoboxing
                }
         //String
        /*
            Strings are reference type values. There are useful predefined methods inside them.
        */
        String string= new String("Hello Java"); //Creates a new String in memory that has "Hello Java"( or a variable).
        //These are different
        String str="Hello Java"; //adds a String that has "Hello Java" to string constant pool.
        String str2="Hello Java"; //points str2 in the string constant pool because they have the same value.
        //But don't worry, Strings are immutable( if you change what is inside, it deletes that memory and creates a new variable).
        if(str==str2){} //Returns true because they point the same memory
        if(string==str){} //Returns false because they do not point the same memory
        if(string.equals(str)){}//Now returns true
        
        
        //Some of the useful String methods
        str.isEmpty(); //Returns boolean if it is empty
        str.charAt(0);//Prints "H"        
        str.charAt(str.length()-1); //Prints last element, "a"
        str.startsWith("He"); //Returns true
        str.endsWith("va");   //Returns true
        str.toUpperCase();
        str.toLowerCase();
        
        //Warning: you need to assign these "to" methods if you want to save them.
        str=str.toUpperCase();
        
        String str1="1234";
        //String to integer
        int number= Integer.parseInt(str1); 
        
        //integer to String
        int num=1234;
        str1=String.valueOf(num);
        
          
         //LinkedList
         //Packages
         //Java Naming Conventions
    }
}
