import.java.util.*;

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
        
        
        
        
    }
}
