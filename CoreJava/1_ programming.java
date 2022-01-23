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
         //ArrayList
         //String
         //LinkedList
         //Packages
         //Java Naming Conventions
    }
}
