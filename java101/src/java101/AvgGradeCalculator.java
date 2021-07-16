package java101;
import java.util.Scanner;

public class AvgGradeCalculator {
	public static void main(String[] args) {
		 
		int lesson1,lesson2,lesson3,lesson4,lesson5;
		int akts1,akts2,akts3,akts4,akts5;
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
		 
		 double gpa =(lesson1*akts1+lesson2*akts2+lesson3*akts3+lesson4*akts4+lesson5*akts5)/(akts1+akts2+akts3+akts4+akts5);
		 
		 if(gpa>=2.0) {
			 System.out.println("You passed "+ gpa);
		 }
		 else {
			 System.out.println("You failed "+gpa);
		 }
	}
}
