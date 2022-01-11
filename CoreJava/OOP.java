import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Methods
        
        /*
            Methods are functions inside classes(belongs to them).
            In Java you a method is defined as follows:
            access modifier extra functionalities return type
            method name (parameters){ methods behavior}
        Example: public static void main(String[] args){
            System.out.println("Hello Methods");
        }
        You can call this function by typing main();
        
        void means there is no return statement.
        static means do not create different methods for each object of that class type.
        Only create one method and use it for that objects until program ends.
        Methods names are small case in Java. You can use multiple parameters,
        or arrays (and collections). Try to not use more than 2 parameters.
        Access modifiers define how you can access these methods. You can access
        them direclty if public, you can access only from the same class if they are
        private. You can access them only from same package if protected. And 
        defualt access modifier is package-private, lets you access from the same package
        and also from outside the package with inheritance.
        
        Method overloading
        
        Method overloading is creating same named methods that has different
        functionality. Overloaded functions might have different parameter counts,
        different parameter types, different return types.
        
        public static void sum(int a, int b){System.out.println(a+b);}
        public static int sum(int a, int b){return a+b;}
        public static void sum(int a, int b, int c){System.out.println(a+b+c);}
        public static void sum(String a, String b){System.out.println(a+b);}
            
        Scope
        
        All {} define different scopes. If you define a variable inside a scope
        you can not reach that variable. This avoids name conflict.
        
        int a=10;
        if(a<11){
            int b=5;
        }
        System.out.println(b); //You cannot reach b here
        
        You can not also reach variables that are defined inside other methods
        (unless you do not send these values as parameters).
        
        
        
        
        */
        
        
        
        
        //Classes
        //Constructors
        //Inheritence
        //Composition
        //Encapsulation
        //Polymorphism
        //Abstract Class
        //Inner Class
        //Generics
        //Java Naming Conventions
        //Access Modifiers
        //Java Collection Framework
        //Exception Handling
        //Java I/O (Input/Output)
        //Multithreading and Concurrency
        //Swing ile arayüz geliştirme
        //Proje1 
        //Proje2
        //JDBC and Mysql
        //Project3
    }
}
