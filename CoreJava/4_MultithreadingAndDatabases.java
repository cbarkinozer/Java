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
       You can also do it with implementing Runnable interface.
       Runnable interface vs Thread class:
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
                            System.out.println("List1 thread is interrupted...");
                     }
                     list1.add(random.nextInt(100));
              }
       }
       public void addtoList2(){
              synchronized(lock2){
                    try{
                            Thread.sleep(1000);
                     }catch(InterruptedException ex){
                            System.out.println("List2 thread is interrupted...");
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
            System.out.println("Thread joining is interrupted...");
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
                            System.out.println("Thread is interrupted...");
                     }
              
              
              try{          
                            Integer value = random.nextInt(100);
                            queue.put(value);
                            System.out.println("Producer is producing...");
                        }catch(InterruptedException ex){
                            System.out.println("Thread is interrupted...");
                     }
                     
              }
       }
       public void consume(){
              while(true){
                     try{
                            Thread.sleep(5000);
                        }catch(InterruptedException ex){
                            System.out.println("Thread is interrupted...");
                     }
              
              
              try{          
                            
                            queue.take(value);
                            System.out.println("Consumer is consuming...");
                            System.out.println("Consumer's size: "+ queue.size());
                        }catch(InterruptedException ex){
                            System.out.println("Thread is interrupted...");
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
                            System.out.println("Thread is interrupted...");
              }
              
              System.out.println("Thread is starting... ID"+ id);
              
              try{
                     Thread.sleep(5000);
              }catch(InterruptedException ex){
                            System.out.println("Thread is interrupted...");
              }
              
              System.out.println("Thread is quitting... ID"+ id);
              sem.release();
              
       }
}

//Callable and feature interfaces, returning value from threads
/*
       Callable , represents an asynchronous task which can be executed by a separate thread.
       Callable vs Runnable: A Runnable, does not return a result and cannot throw a checked exception.
       Future , represents the result of an asynchronous computation.
       The question mark (?) is known as the wildcard in generic programming. It represents an unknown type.
*/
Executor executor = Executors.newFixedThreadPool(1); 
Future<?> future = executor.submit(new Callable<Integer>(){
       @Override
       public Integer call() throws Exception{
              Random random = new Random();
              System.out.println("Thread is working...");
              int time = random.nextInt(1000)+2000;
              if(time>2500){
                     throws new IOException("Thread has been sleeping for too long...");
              }
              try{
                            Thread.sleep(time);
              }catch(InterruptedException ex){
                     System.out.println("Thread is interrupted...");
              }
              System.out.println("Thread is quitting...");
              return time;
       }

});
executor.shutdown();
try{
       System.out.println("Returning value: "+future.get());
}catch(InterruptedException ex){
       System.out.println("Thread interrupted...");
}catch(ExecutionException ex){
       System.out.println("Execution failed...");
}

//Thread Interrupts
thread.interrupt(); //Interrupts thread throws InterruptedException in try-catch

//JDBC and Mysql Database Operations
/*
       Database: Organized collection of structured information, or data, typically stored electronically in a computer system
       Rational databse: Stores data in tables, therefore this tables can take advantage of the ACID features (mysql, postgresql,oracledb).
       Document-based database: Stores data in documents (mongoDB,Azure document).
       JDBC: Structure created to connect projects to relational databases.
       We will run SQL queries over JDBC and perform operations on mysql database.
       JDBC is compatible with different relational databases and we do not need to develop different code for each database.
       JDBC Driver: Allows connection to databases, makes our database function calls suitable for different databases.
       XAMPP: Is a great tool for managing multiple databases in a computer. (default credentials: username:root, password:)
       To connect to mysql, one need to add mysql-connector.jar to the project's libraries.
       Open XAMPP, run mysql database, add mysql-connector.jar to projects libraries.
*/
import java.sql.connection;

public class Connect{
       private String username="root";
       private String password ="";
       
       private String dbName="demo";
       
       private String host="localhost";
       
       private int port=3306;//!ADD *YOUR* PORT(check from xampp)
       
       private Connection con = null;
       
       public Connect(){
              String url ="jdbc:mysql://"+host+":"+port+"/"+dbName+"?useUnicode=true&characterEncoding=utf8";
              try{
                     Class.forName("com.mysql.jdbc.Driver");
              }catch(ClassNotFoundException ex){
                     System.out.println("Can not find driver...");
              }
              
              try{
                     con=DriverManager.getConneciton(url,username,password);
                     System.out.println("Connection successful...");
              }catch(SQLException ex){
                     System.out.println("Connection failed...");
              }   
       }
       
       public static void main(String[] args){
              Connect connect = new Connect();       
       }

}

//Pulling data from a table with SELECT

public class Connect{
       
       //...
       
       private Statement statement=null;
       
       public void getEmployees(){
              String query="SELECT * FROM employees";
       }
       
              try{
                     statement=con.createStatement();
                     ResultSet resultSet= statement.executeQuery(query);
              
                     while(resultSet.next()){
                            int id= resultSet.getInt("id"); //id is the columns name
                            String name = resultSet.getString("name");
                            String surname = resultSet.getString("surname");
                            String email= resultSet.getString("email");
                            System.out.println("id: "+id+" name: "+name+" surname: "+surname+" email: "+email);
                     }
       
       }catch(SQLException ex){
              System.out.println("Query failed...");
       }
       
       //...
       
       public static void main(String[] args){
              Connect connect = new Connect();
              connect.getEmployees();
       }             
}

//Adding value to a table

public class Connect{
       //...
       public void addEmployee(){
              try{
                    statement= con.createStatement();
                    String name="Kent";
                    String surname="Martin";
                    String email="kentmartin@gmail.com";
                    String query="INSERT INTO employees (name,surname,email)VALUES("
                           +"'"+name+"','"+surname+"','"+email+"')";
                     statement.executeUpdate(query);
              }catch(SQLException ex){
                     System.out.println("Query failed...");
              }
              
       }
       //...
       public void main(String[] args){
              Connect connect = new Connect();
              System.out.println("Before being added...");
              connect.getEmployee();
              System.out.println("******************************************************");
              connect.addEmployee();
              connect.getEmployee();
       }
}

//Updating values on the database
public void updateEmployee(){
              try{
                    statement= con.createStatement();
                    String query="UPDATE employees  SET email='kent.martin@gmail.com' WHERE id=1";
                     statement.executeUpdate(query);
              }catch(SQLException ex){
                     System.out.println("Query failed...");
              }
}

//Deleting values from the table
public void deleteEmployee(){
              try{
                    statement= con.createStatement();
                    String query="DELETE FROM eployees WHERE id=1";
                    int deletedCount= statement.executeUpdate(query);
                     System.out.println(deletedCount+" elements affected...");
              }catch(SQLException ex){
                     System.out.println("Query failed...");
              }
}

//PreparedStatements
private PreparedStatement preparedStatement=null;
public void getPreparedStatements(){
              try{
                    statement= con.createStatement();
                    String query="SELECT * FROM employees WHERE name LIKE 'K%' ";
                     ResultSet resultSet= statement.executeQuery(query);
              
                     while(resultSet.next()){
                            System.out.println("Name: "+ resultSet.getString("name"));
                     }
              }catch(SQLException ex){
                     System.out.println("Query failed...");
              }
}
//Better version of getEmployees() using PreparedStatements
public class Connect{       
       private Connection con=null;
       private Statement statement=null;
       private PreparedStatement preparedStatement = null;
       public void getEmployeesPrepared(int id){
              String query="SELECT * FROM employees WHERE id= ? AND name LIKE ?"; // ? will be filled with using PreparedStatement
              try{
                    preparedStatement= con.preparedStatement(query);
                    preparedStatement.setInt(1,id);
                    preparedStatement.setInt(2,"M%");
                    
                     ResultSet resultSet= preparedStatement.executeQuery();
                     while(resultSet.next()){
                            String name= resultSet.getString("name");
                            String surname= resultSet.getString("surname");
                            String email= resultSet.getString("email");
                            System.out.println("id: "+id+" name: "+name+" surname: "+surname+" email: "+email);
                     }
              }catch(SQLException ex){
                     System.out.println("Query failed...");
              }
              
       }
       public static void main(String[] args){
              Connect connect = new Connect();
              connect.getEmployeesPrepared(3); //where id=3
       }
}
//Database Transaction operations, commit() and rollback()
/*
       In projects we need to do databse operations repeatedly. If one of the queries fail it might affect other queries.
       commit(): Runs all queries, used when all queries are done successfully.
       rollback(): Cancels all queries, used when one of the related queries fail.
       To use commit and rollback we need to deactivate the queries running instantly by "con.setAutoCommit(false);".
*/
public void commitAndRollback(){
       Scanner scanner = new Scanner(System.in);
       try{
             con.setAutoCommit(false);
              String query1="DELETE FROM employees WHERE id =3";
              String query2="UPDATE employees SET email='kentmartin@gmail.com' WHERE id =1 ";
              System.out.println("Before updating:");
              getEmployees();
              Statement statement = con.createStatement();
              
              statement.executeUpdate(query1);
              statement.executeUpdate(query2);
              
              System.out.println("Would you like to save operations?");
              String answer = scanner.nextLine();
              
              if(answer.equals("yes")){
                     con.commit();
                     getEmployees();
                     System.out.println("Database updated...");
              
              }else{
                     con.rollback();
                     System.out.println("Database update cancalled...");
                     getEmployees();
              }
              
       }catch(SQLException ex){
                     System.out.println("Query failed...");
       }
    public static void main(String[] args){
              CommitAndRollback comRoll = new CommitAndRollback();
              comRoll.commitAndRollback();
    }   
       
}
