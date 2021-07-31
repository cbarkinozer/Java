package threadRace;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		
		//It works but needs little work :)
		
		ArrayList<Integer> intList0 = new ArrayList<Integer>();
		
		ArrayList<Integer> intList1 = new ArrayList<Integer>();
		ArrayList<Integer> intList2 = new ArrayList<Integer>();
		ArrayList<Integer> intList3 = new ArrayList<Integer>();
		ArrayList<Integer> intList4 = new ArrayList<Integer>();
		
		//List 0 has 10 thousand integer
		for (int i = 1; i <= 100; i++) {
			intList0.add(i);
			
		}
		System.out.println("List 0 loaded");
		//Divide it to 4 lists
		intList1.addAll(intList0.subList(0, 25));
		intList2.addAll(intList0.subList(26, 50));
		intList3.addAll(intList0.subList(51, 75));
		intList4.addAll(intList0.subList(76, 100));
		System.out.println("Lists are divided to 4");
		
		//2 thread for odd and even
		//Send list as parameter to the constructor
		System.out.println("Creating tasks...");
		TaskOdd taskOdd1 = new TaskOdd(intList1);
		TaskOdd taskOdd2 = new TaskOdd(intList2);
		TaskOdd taskOdd3 = new TaskOdd(intList3);
		TaskOdd taskOdd4 = new TaskOdd(intList4);
		
		TaskEven taskEven1 = new TaskEven(intList1);
		TaskEven taskEven2 = new TaskEven(intList2);
		TaskEven taskEven3 = new TaskEven(intList3);
		TaskEven taskEven4 = new TaskEven(intList4);
		System.out.println("Tasks created.");
		
		System.out.println("Creating threads...");
        Thread thread1 = new Thread(taskOdd1);
        Thread thread2 = new Thread(taskOdd2);
        Thread thread3 = new Thread(taskOdd3);
        Thread thread4 = new Thread(taskOdd4);
        
        Thread thread5 = new Thread(taskEven1);
        Thread thread6 = new Thread(taskEven2);
        Thread thread7 = new Thread(taskEven3);
        Thread thread8 = new Thread(taskEven4);
        System.out.println("Threads created.");
      
        
        //Start threads
        System.out.println("Starting threads...");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        
        thread5.start();
        thread6.start();
        thread7.start();
        thread8.start();
        System.out.println("Threads started.");
		

      //Check result
        System.out.println("Printing the result...");
		taskOdd1.result();
		taskOdd2.result();
		taskOdd3.result();
		taskOdd4.result();
		
		taskEven1.result();
		taskEven2.result();
		taskEven3.result();
		taskEven4.result();
		System.out.println("Results printed.");
	}

}
