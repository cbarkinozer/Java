//Multithreading and Concurrency
/*
       Concurrency is the simultaneous occurrence of events working at the same time.
       Process is every different application running concurrently.
       Every process has its own memory space in memory, threads share memory space.
       Thread is different operations on an application running concurrently.
       Every program has 1 process and 1 thread in that process.
       Multithreading is faster, gives an opportunity of doing multiple operations but it is harder to program, test,debug.
       JVM and operating system decides when these threads will run in which order. Because these order may vary otput may differ.
*/
public class Printer extends Thread{
       private String name;
       public Printer(String name){
              this.name=name;
       }
       @Override
       public void run(){ //Runs threads
              System.out.println(name+"working...");
              for(int i=1;i<=10;i++){
                     try{
                            System.out.println(name+" writing "+i);
                            Thread.sleep(1000); //thraid waits 1000 ms(1s)
                     }catch(InterruptException ex){
                            System.out.println("Thread interrupted...");
                     }
                     
              }
              System.out.println(name+"is done.");
       }
}
public class Main{
       public static void main(String[] args){
              Printer printer1 = new Printer("printer1");
              Printer printer2 = new Printer("printer2");
              
              printer1.start();
              pritner2.start();
       }
}
/*
       You can also do it with implementing Runnable class.
       Runnable vs Thread:
       When we extend Thread class, we cannot extend another class even if we need it, but we can extend another class when we implement Runnable.
       When we extend the Thread class, each of our threads creates a unique object and associates them.
       When we implement Runnable, it shares the same object with multiple threads.
       
       (!)Implementing Runnable interface approach is recommended than extending Thread class.
*/
public class Printer implements Runnable{ //Only implements Runnable , rest of the class is same. But using it in main differs.
       private String name;
       public Printer(String name){
              this.name=name;
       }
       @Override
       public void run(){ 
              System.out.println(name+"working...");
              for(int i=1;i<=10;i++){
                     try{
                            System.out.println(name+" writing "+i);
                            Thread.sleep(1000);
                     }catch(InterruptException ex){
                            System.out.println("Thread interrupted...");
                     }
                     
              }
              System.out.println(name+"is done.");
       }
}
public class Main{
       public static void main(String[] args){
              Thread printer1 = new Thread(new Printer("printer1"));
              Thread printer2 = new Thread(new Printer("printer2"));
              
              printer1.start();
              printer2.start();
              
       }
}

//Synchronization of the threads
//If threads reach a value simultaneously they might give unwanted results, they must be synchronized.

public class ThreadSafe{
       private int count=0;
       public synchronized void increment(){ //synchronized keyword only lets one thread to reach per time
              count++;
       }
       public void runThreads(){
              Thread thread1 = new Thread(new Runnable(){ //anonymous inner class( used if you have to override a method of class or interface)
                     @Override
                     public void run(){
                            for(int i=0;i<10;i++){
                                   increment();
                            }
                     }
              });
              Thread thread2 = new Thread(new Runnable(){
                     @Override
                     public void run(){
                            for(int i=0;i<10;i++){
                                   increment();
                            }
                     }
              });
       }
}



//JDBC and Mysql Database Operations
/**/
//UI programming with Swing
/**/
       
