package java101;
import java.util.Scanner;

public class AvgGradeCalculator {
	public static void main(String[] args) {
		 
		int lesson1,lesson2,lesson3,lesson4,lesson5;
		int akts1,akts2,akts3,akts4,akts5;
		double gpa;
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("1. lesson's grade over 4:");
		 lesson1=scanner.nextInt();
		
		 System.out.println("1. lesson's number of akts:");
		 akts1=scanner.nextInt();
		 
		 System.out.println("2. lesson's grade over 4:");
		 lesson2=scanner.nextInt();
		 System.out.println("2. lesson's number of akts");
		 akts2=scanner.nextInt();
		 
		 System.out.println("3. lesson's grade over 4:");
		 lesson3=scanner.nextInt();
		 System.out.println("3. lesson's number of akts:");
		 akts3=scanner.nextInt();
		 
		 System.out.println("4. lesson's grade over 4:");
		 lesson4=scanner.nextInt();
		 System.out.println("4. lesson's number of akts:");
		 akts4=scanner.nextInt();
		 
		 System.out.println("5. lesson's grade over 4:");
		 lesson5=scanner.nextInt();
		 System.out.println("5. lesson's number of akts:");
		 akts5=scanner.nextInt();
		 
		 scanner.close();
		 
		 if(lesson1>=0&&lesson1<=100&&lesson2>=0&&lesson2<=100&&lesson3>=0&&lesson3<=100&&lesson4>=0&&lesson4<=100&&lesson5>=0&&lesson5<=100) {
			 gpa =(lesson1*akts1+lesson2*akts2+lesson3*akts3+lesson4*akts4+lesson5*akts5)/(akts1+akts2+akts3+akts4+akts5);
		 }else {
			 gpa = -1;
		 }
		 
		 
		 if(gpa>=2.0) {
			 System.out.println("You passed "+ gpa);
		 }
		 else if(gpa<2.00 && gpa>=0.0) {
			 System.out.println("You failed "+gpa);
		 }else if(gpa==-1) {
			 System.out.println("Wrong input!");
		 }
	}
}
