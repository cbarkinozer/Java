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
        /*
            Object oriented programming is programming by creating structures as
            objects. These objects have attributes (variables) and they do behaviours(methods).
            
            //Encapsulation
            If we make object's attributes public, these values can be assigned values that 
            are error-free but meaningless in the context of the program.
            So to prevent this, we should prevent direct access(public), instead,
            we should access private attributes and change with methods named setter,
            and read values with getter. This is called encapsulation.
            
            Example:
            public class Car{
                private int doorNumber;
            
                public void setDoorNumber(int doorNumber){
                    this.model=model;
                }
            }
            this keyword tells the compiler that,
            the variable we are using is the variable that is defined inside that
            scope.
        
            
        */
        //Constructors
        /*
            Classes have methods with the same name as they are constructors
            (for class Account, method named Account() is a constructor).
            Constructors work when an object is created.
            Constructors generally used to give initial values to class's attributes.
            
            Example:
            public class Account{
                int accountId;
                String accountName;
                
                //this is a constructor
                public Account(int accountId, String accountName){
                    this.accountId=accountId;
                    this.accountName=accountName;
                }
            }
            
            Inside Main class, and main() method:
                //Object created initial values are given to constructor
                Account account = new Account(12345,"first account");
                
        
            Also in c++ there are destructors for deleting object. But in Java
            there is no direct equivalent of destructor because there is garbage
            collector that automatically deletes object memory.
            There is a inherited method finalize to do final works on a object but
            it is not common.
        
            We can also method overload constructor for no parameters given version.
            And you can assign default values.
            
            Example:
            public class Account{
                int accountId;
                String accountName;
                
                //this is a constructor
                public Account(int accountId, String accountName){
                    this.accountId=accountId;
                    this.accountName=accountName;
                }
                
                public Account(){
                    this(1111,"no name"); //Runs the parameterized method
                }
            }
            
            //Object References
        
            Question: Does below code print anything?
            Account account1 = new Account();
            Account account2 = new Account();
        
            account2=account1;
            
            if(account1==account2){ //Check if they point the same place memory
                System.out.println("They have the same memory");
            }
        
            Yes , it prints "They have the same memory". They are reference type
            objects they can point each other in memory.
        
        
            The below lines are also legal.
            new Account(1234,"abc");
            new Account(1234,"abc").printValues();
        
            Constructors and methods used without creating reference.
            These techniques are prefered for single line operations.
        
        */
        //Inheritence
        /* 
            IS-A relationship between classes is inheritance.
            Subclasses inherit superclasses.
            
            A class inherits another class by extends keyword.
        
            public class Worker{}
            public class Manager extends Worker{} //Because Manager IS-A Worker
        
            But there is a problem. You can not use Worker private attributes
            inside Manager class's constructor. You have to use "super()" to reach
            inherited classes constructor. You can also reach different named
            methods. For example: "super.showValues()" .
            
            //Method overriding
            We can define superclass's method with the same name and write its
            body different specificly for our subclass's needs(improve/change).
            This is called method overriding.
            
        
        
        */
        //Composition
        /*
            Has-a relationship. For example Computer has a monitor,
            a case.
        
            
            public class Monitor{
                //Monitor class's attributes,constructor,getters&setters
            }
            public class Case{
                //Case class's attributes,constructor,getters&setters
            }
            public class Computer{
                Monitor monitor;
                Case case;
                Computer(Monitor monitor, Case case){
                    this.monitor=monitor;
                    this.case=case;
                }
                public Monitor getMonitor(){return this.monitor;}
                public void setMonitor(Monitor monitor){this.monitor=monitor;}
                public Case getCase(){return this.case;}
                public void setCase(Case case){this.case=case;}
            }
        */
        //Polymorphism
        /*
            Poly(many) morphism (forms): An object acting like another object.
            @Override : This is annotation (like a tag) that tells the reader that method is a override of a superclass's method( works without it too).
            The most common polymorphism in OOP is when a parent class reference is used to refer to a child class object(child class is inherited from parent class).
            The "instanceof" keyword checks if object is instance of the class.
            Account account = new Account("barkin","1234",2000);
            if(account instanceof Account){System.out.println("It is an instance");} //Prints
            
        */
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
