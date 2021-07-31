package threadRace;

import java.util.ArrayList;

public class TaskEven extends Thread {
	ArrayList<Integer> tempList=new ArrayList<Integer>();
	ArrayList<Integer> evenList=new ArrayList<Integer>();
	
	
	TaskEven(ArrayList<Integer> intList) {
		for (int i = 0; i <intList.size() ; i++) {
			evenList.add(intList.get(i));
		}
	}

	@Override
	public void run() {
		for (int i = 1; i < tempList.size() ; i++) {
			if(tempList.get(i)%2==0) {
				evenList.add(tempList.get(i));
			}
		}
	}
	
	public void result() {
		System.out.println(evenList.toString()); 
	}
	
	
	
}
