import java.util.*;

public class Main {
    public static void main(String[] args) {
        //Methods
        
        /*
            Methods are functions inside classes(belongs to them).
            In Java you a method is defined as follows:
            access modifier extra functionalities return type
            method name (parameters){ methods behavior}
        Example:
        */
        public static void main(String[] args){
            System.out.println("Hello Methods");
        }
        /*
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
        */
        
        public static void sum(int a, int b){System.out.println(a+b);}
        public static int sum(int a, int b){return a+b;}
        public static void sum(int a, int b, int c){System.out.println(a+b+c);}
        public static void sum(String a, String b){System.out.println(a+b);}
        
        /*
        Scope
        
        All {} define different scopes. If you define a variable inside a scope
        you can not reach that variable. This avoids name conflict.
        */
        int a=10;
        if(a<11){
            int b=5;
        }
        System.out.println(b); //You cannot reach b here
        /*
        You can not also reach variables that are defined inside other methods
        (unless you do not send these values as parameters).
        
        //Classes
        
            Object oriented programming is programming by creating structures as
            objects. These objects have attributes (variables) and they do behaviours(methods).
            
            //Encapsulation
            If we make object's attributes public, these values can be assigned values that 
            are error-free but meaningless in the context of the program.
            So to prevent this, we should prevent direct access(public), instead,
            we should access private attributes and change with methods named setter,
            and read values with getter. This is called encapsulation.
            
            Example:
            */
        
            public class Car{
                private int doorNumber;
            
                public void setDoorNumber(int doorNumber){
                    this.model=model;
                }
            }
            /*
            this keyword tells the compiler that,
            the variable we are using is the variable that is defined inside that
            scope.
    
        //Constructors
       
            Classes have methods with the same name as they are constructors
            (for class Account, method named Account() is a constructor).
            Constructors work when an object is created.
            Constructors generally used to give initial values to class's attributes.
            
            Example:
            */
        
            public class Account{
                int accountId;
                String accountName;
                
                //this is a constructor
                public Account(int accountId, String accountName){
                    this.accountId=accountId;
                    this.accountName=accountName;
                }
            }
            
            //Inside Main class, and main() method:
                //Object created initial values are given to constructor
                Account account = new Account(12345,"first account");
                
            /*
            Also in c++ there are destructors for deleting object. But in Java
            there is no direct equivalent of destructor because there is garbage
            collector that automatically deletes object memory.
            There is a inherited method finalize to do final works on a object but
            it is not common.
        
            We can also method overload constructor for no parameters given version.
            And you can assign default values.
            
            Example:
            */
        
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
        
            //Question: Does below code print anything?
            Account account1 = new Account();
            Account account2 = new Account();
        
            account2=account1;
            
            if(account1==account2){ //Check if they point the same place memory
                System.out.println("They have the same memory");
            }
        
            //Yes , it prints "They have the same memory". They are reference type
            //objects they can point each other in memory.
        
        
            //The below lines are also legal.
            new Account(1234,"abc");
            new Account(1234,"abc").printValues();
        
            //Constructors and methods used without creating reference.
            //These techniques are prefered for single line operations.
        
        
        //Inheritence
        /* 
            IS-A relationship between classes is inheritance.
            Subclasses inherit superclasses.
            
            A class inherits another class by extends keyword.
        */
            public class Worker{}
            public class Manager extends Worker{} //Because Manager IS-A Worker
        /*
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
        
        */    
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
                //In get we can not do "return this.monitor;" because it does not get data instead points to the location.
                // We must copy the data with "monitor.clone()" to not cause errors.
                
                public Monitor getMonitor(){return monitor.clone();}
                public void setMonitor(Monitor monitor){this.monitor=monitor;}
                public Case getCase(){return case.clone();}
                public void setCase(Case case){this.case=case;}
            }
        /*
        //Polymorphism
        /*
            Poly(many) morphism (forms): An object acting like another object.
            @Override : This is annotation (like a tag) that tells the reader that method is a override of a superclass's method( works without it too).
            The most common polymorphism in OOP is when a parent class reference is used to refer to a child class object(child class is inherited from parent class).
            The "instanceof" keyword checks if object is instance of the class.
            Account account = new Account("barkin","1234",2000);
            if(account instanceof Account){System.out.println("It is an instance");} //Prints
            Note: subclass's object is an instanceof superclass too.
            Object class is the global superclass. All classes inherit from the Object class as they created.
            
        */
        //Interface
        /*
            Interface is an abstract class template. It is utilized to create class templates for classes by inheritance.
            Interfaces are inherited by using "implements" keyword. Classes can implement multiple Interfaces.
            Warning: Interface is not a class so you can not create it's objects.
            The body of the methods are not filled, only their names and parameters are given, this is called method signiture.
            These signature methods are filled in the classes that implement these interfaces.
         */    
            public interface Employee{
                String checkEmployeeId(double EmployeeId);
            }
            
            
            public interface IT{
                String checkLabId(double LabId);
            }
            
            
            public class Engineer implements Employee, IT{
                private String name;
                private boolean atWork;
                private double sgk;
                
                @Override
                String checkEmployeeId(double EmployeeId){
                    ...(checks EmployeeId)
                    return "Id: "+EmployeeId;
                }
                @Override
                String checkLabId(double LabId){
                    ...(checks labId)
                    return "Lab id:"+ LabId;
                }
            
            }
            
        /*
            Interfaces are useful for creating the Strategy design pattern. In strategy design pattern you design your interfaces and classes so that you can change
            classes (behaviour) in your code. For example, in the following code, there are 2 different strategies classes,
            1 strategy managin class and 1 interface and a main class. 
        */
            
             public interface CheckService{ //Only has strategy method sign
                boolean checkUser(User user);
            }
            
            public class SignInManager{  //Does the strategy switching
                private CheckService checkService; //Dependency injection
                public SignInManager(CheckService checkService){ //Constructor for interface
                    this.checkService=chechService;
                }
                public void checkUser(User user){
                    if(CheckService.checkUser(user)){ //Depending on the strategies result give result to user
                        System.out.println("Success");
                    }else{
                        System.out.println("Fail");
                    }
                }
             
            }
            
             public class UserAgeCheck implements CheckService{ //Strategy class only implements the interface and overrides it's method
                @Override
                public boolean checkUser(User user){
                    ...(age check)
                }
             
            }
             public class UserComplexCheck implements CheckService{ //Strategy class only implements the interface and overrides it's method
                @Override
                public boolean checkUser(User user){
                    ...(complex check)
                }
             
            }
            
            
            public class Main{
                public static void main(String[] args){
                    SignInManager signInManager = new SignInManager(new UserAgeCheck()); //Deciding strategy here
                    signInManager.checkUser(new User(1,1.70,"Mustafa"));
                    
                }
            }
            
        //Abstract Class
        /*
            Abstract class's are classes that are abstract. You can not create object's of them because they are incomplete.
            It is also preferred when a method is must overriden because abstract classes warn the programmer to ooverride the method.
            Prefer abstract classes over interfaces when most of the methods will not changed.
        */
        public abstract class SuperClass{
            public anotherMethod(int num){ //Has body, you should not override
                ...
                return num;
            }
            public myMethod(int num); //Must overriden(warns progragrammer)
        }
        
        public class SubClass extends SuperClass{
            @Override
            public myMethod(int num){
                ...
                return num;
            }
        }
        public class Main{
            public static void main(String[] args){
                SuperClass superClass = new SuperClass(); //ERROR: NOT VALID (You can not create instance of an abstract class)
                SuperClass superClass= new SubClass();   //Valid: We can assign the references of abstract classes to subclasses
            }
        }
        //Static keyword
        /*
            Static attributes and methods does not belong to instances instead belongs to classes.
            Because they belong to the class, they are created when the program runs.
            To reach these attributes and methods you need to write ClassName.attribute and ClassName.method() instead instanceName.attribute and instanceName.method().
            Static methods use static attributes.
        */
        //Inner Class
        /*
            Inner classes are classes inside other classes or interfaces (nested classes).
            Inner classes are used to logically group classes and interfaces in one place to be more readable and maintainable
            There are 4 types of inner classes:
            Non-static inner classes
            Static inner classes
            Local inner classes
            Anonymous inner classes
        */
        //Non-static inner class example
        public class Mathematic{
            public class Factorial{
                
            }
        }
        public class Main{
            public static void main(String[] args){
                Mathematic.Factorial factorial = new Mathematic().new Factorial(); //Creates a factorial inner class's instance
            }
        }
        //Static inner class example
        public class Mathematic{
            public class Factorial{
                
            }
        }
        public class Main{
            public static void main(String[] args){
                Mathematic.Factorial factorial = new Mathematic.Factorial(); //Creates a static factorial inner class's instance
            }
        }
        
        //Generics
        //Access Modifiers
    }
}
