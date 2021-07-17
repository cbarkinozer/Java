package java101;
import java.util.Scanner;

public class WeatherCalculator {
	public static void main(String[] args) {
		 
		int heat;
		 Scanner scanner = new Scanner(System.in);
		 
		 
		 System.out.println("Please enter the heat: ");
		 heat=scanner.nextInt();
		 scanner.close();
		 
		 if(heat<5) {
			 System.out.println("Kayak yap ");
		 }else if(heat>=5&&heat<15) {
			 System.out.println("Sinemaya git ");
		 }else if(heat>=15&&heat<25) {
			 System.out.println("Piknik yap ");
		 }else if(heat>=25) {
			 System.out.println("Yüzmeye git ");
		 }
		
		 
		 
		 
		 
	}
}
