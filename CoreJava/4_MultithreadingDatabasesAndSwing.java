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

//Using multiple locks.
//join() method allows one thread to wait until another thread completes its execution

import java.util.Random;
public class ListWorker{
       Random random = new Random();
       ArrayList<Integer> list1 = new ArrayList<Integer>();
       ArrayList<Integer> list2 = new ArrayList<Integer>();
       
       private Object lock1 = new Object();
       private Object lock2 = new Object();
       
       public void addtoList1(){
              synchronized(lock1){
                     try{
                            Thread.sleep(1000);
                     }catch(InterruptedException ex){
                            System.out.println("List1 thread interrupted...");
                     }
                     list1.add(random.nextInt(100));
              }
       }
       public void addtoList2(){
              synchronized(lock2){
                    try{
                            Thread.sleep(1000);
                     }catch(InterruptedException ex){
                            System.out.println("List2 thread interrupted...");
                     } 
                     list2.add(random.nextInt(100));
              }
       }
       public void assignValue(){
       
        for (int i = 0 ; i < 1000 ; i++) {
            addtoList1();
            addtoList2();
            
        }
     
    }
    public void run(){
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                assignValue();
                
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                assignValue();
                
            }
        });
        long start = System.currentTimeMillis();
        
        thread1.start();
        thread2.start();
        
        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ex) {
            System.out.println("Thread joining interrupted...");
        }
        System.out.println("List1 Size :" + list1.size() + " List2 Size: " + list2.size());
        
        long end =  System.currentTimeMillis();
        
        System.out.println("Time passed : " + (end - start));
        
      
    }      
}
public class Main{
       public static void main(String[] args){
              ListWorker listWorker = new ListWorker();
              worker.run();
       }
}

//ThreadPools and ExecutorService
public class Worker implements Runnable{
       private String name;
       private int taskId;
       public Worker(String name, int taskId){
              this.name=name;
              this.taskId=taskId;
       }
       @Override
       public void run(){
              try{
                    System.out.println(name+"with taskId"+taskId+"started to work...");
                    Thread.sleep(5000); 
              }catch(InterruptedExecution ex){
                     System.out.println("Thread is interrupted...");
              }
              System.out.println(name+"with taskId"+taskId+"finished to work...");
              
       }
}
public class Main{
       publc static void main(String[] args){
              ExecutorService executor = Executors.newFixedThreadPool(2); //Executor controls the threadpool with 2 threads (max 2 thread works at the same time)
              for(int i=0;i<5;i++){
                     executor.submit(new Worker(String.valueOf(i),i));
              }
              executor.shutdown(); // If we do not close the pool they will remain on the background
              try{
                     executor.awaitTermination(1,TimeUnit.DAYS); // Define threads maximum lifespan
              }catch(InterruptedExecution ex){
                     System.out.println("Thread is interrupted...");
              }
              
       }
}
//ArrayBlockingQueue for Producer-Consumer problem
/*
       The job of the Producer is to generate the data, put it into the buffer, and again start generating data. 
       While the job of the Consumer is to consume the data from the buffer.
       
       If buffer full -> producer can not put data into the buffer.
       If buffer empty -> consumer can not take data from the buffer.
       The producer and consumer can not access the buffer at the same time.
       
*/


public class Main{
       public static void main(String[] args){
              ProducerConsumer pc = new ProducerConsuemr();
              Thread producer= new Thread(new Runnable(){
                     @Override
                     public void run(){
                            pc.produce();
                     }
              });
              Thread consumer= new Thread(new Runnable(){
                     @Override
                     public void run(){
                            pc.consume();
                     }
              
              });
       }
}
import java.util.Random;
public class ProducerConsumer{
       
       Random random = new Random();
       
       BlockingQueue<Integer> queue = new ArrayBlockingQueue<Integer>(10);
       
       public void produce(){
              while(true){
                     try{
                            Thread.sleep(1000);
                        }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
                     }
              
              
              try{          
                            Integer value = random.nextInt(100);
                            queue.put(value);
                            System.out.println("Producer producing...");
                        }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
                     }
                     
              }
       }
       public void consume(){
              while(true){
                     try{
                            Thread.sleep(5000);
                        }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
                     }
              
              
              try{          
                            
                            queue.take(value);
                            System.out.println("Consumer consuming...");
                            System.out.println("Consumer size: "+ queue.size());
                        }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
                     }
                     
              }
       }
       
}

//Wait and Notify methods
public class waitAndNotify{
       private Object lock = new Object();
       public void firstThread(){
              synchronized(lock){
                     System.out.println("First Thread is working...");
                     System.out.println("First Thread is waiting to be awakened...");
                     try{
                            lock.wait(); //Waiting to get notified
                     }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
                     }
                     System.out.println("Thread is awake, thread continues...");
              }
       }
       public void secondThread(){
              Scanner scanner = new Scanner(System.in);
              try{
                     Thread.sleep(20000); //Waiting the first thread
              }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
                     }
              synchronized(lock){
                     System.out.println("Second Thread is working...");
                     System.out.println("To continue press any key...");
                     scanner.nextLine();
                     lock.notify();
                     System.out.println("First thread is awakened, second thread is off...");
              }
       }
}

//Reentrant lock, condition class, await(), signal()
//If a Thread has locked a piece of code and leaves the locked piece of code without unlocking, it can enter the locked piece of code again.
//This feature is one of the most important features of ReentrantLock.
import java.util.concurrent.locks.RenteredLock;
Lock lock = new RenteredLock();
lock.lock();
try{
       //code
}finally{ //to be sure it is unlocked at the end or infinite loops occur
       lock.unlock();
}
/*
       //await()
       Causes the current thread to wait until it is signalled or interrupted.
       //signal()
       Wakes up one waiting thread.
*/

//Deadlock
/*
       Occur whe nthere are 2+ resources and 2+ threads.
       When two or more threads try to access the same resources at the same time deadlock occurs.
       Then these threads can never access the resource and eventually go into the waiting state forever.
       To ressolve this problem following can be implemented.
*/

public void checkLocks(Lock a, Lock b){
       boolean aObtained=false;
       boolean bObtained=false;
       
       while(true){
              aObtained= a.tryLock();
              bObtained = b.tryLock();
              if(aObtained==true && bObtained==true){
                     return;
              }
              if(aObtained==true){
                     a.unlock();
              }
              if(bObtained==true){
                     b.unlock();
              }
       }
}
// Using this method before thread operations be sure that both locks are not locked at the same time by using checkLocks(lock1,lock2).

//Semaphore
/*
       A Semaphore in Java is a Thread Synchronization construct that controls access to the shared resource with the help of counters
       We are going to use it for operating multiple threads.
*/
import java.util.concurrent.Semaphore;
public class SemaphoreExample{
       private Semaphore sem = new Semaphore(3); //3 threads
       public void threadFunction(int id){
              
              try{
                     sem.acquire(); //If value 0 do not continue to execute, else continue.
              }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
              }
              
              System.out.println("Thread starting... ID"+ id);
              
              try{
                     Thread.sleep(5000);
              }catch(InterruptedException ex){
                            System.out.println("Thread interrupted...");
              }
              
              System.out.println("Thread quitting... ID"+ id);
              sem.release();
              
       }
}

//Callable and feature interfaces, returning value from threads



//JDBC and Mysql Database Operations
/**/
//UI programming with Swing
/**/
       
