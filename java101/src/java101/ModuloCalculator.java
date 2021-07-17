package java101;
import java.util.Scanner;
public class ModuloCalculator {
	public static void main(String[] args) {
	int num, count=0;
	double average=0;
	Scanner scanner= new Scanner(System.in);
	System.out.println("Please enter the number: ");
	num=scanner.nextInt();
	scanner.close();
	
	for(int i=1;i<num;i++) {
		if(i%3==0||i%4==0) {
			average+=i;
			count++;
			}
		}
	average=average/count;
	System.out.println(average);
	}
}
