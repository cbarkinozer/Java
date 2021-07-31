package threadRace;

import java.util.ArrayList;

public class TaskOdd extends Thread {
	ArrayList<Integer> tempList=new ArrayList<Integer>();
	ArrayList<Integer> oddList=new ArrayList<Integer>();
	
	TaskOdd(ArrayList<Integer> intList){
		for (int i = 0; i <intList.size() ; i++) {
			tempList.add(intList.get(i));
		}
	}
	
	
	@Override
	public void run() {
		
		for (int i = 1; i < tempList.size() ; i++) {
			if(tempList.get(i)%2==1) {
				oddList.add(tempList.get(i));
			}
		}
	}
	
	public void result() {
		System.out.println(oddList.toString()); 
	}
}
