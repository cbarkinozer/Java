package java101;

import java.util.Scanner;

public class NumberSorter {
	public static void main(String[] args) {
		 
		int num1,num2,num3;
		 Scanner scanner = new Scanner(System.in);
		 
		 
		 System.out.println("1. sayý ");
		 num1=scanner.nextInt();
		 System.out.println("2. sayý");
		 num2=scanner.nextInt();
		 System.out.println("3. sayý ");
		 num3=scanner.nextInt();
		 scanner.close();
		 
		 if(num2<num1&&num2<num3){
			 if(num1<num3) {
				 System.out.println("2<1<3 ");
			 }else{
				 System.out.println("2<3<1 ");
			 }
		 }else if(num3<num1&&num3<num2) {
			 if(num1<num2) {
				 System.out.println("3<1<2 ");
			 }else{
				 System.out.println("3<2<1 ");
			 }
		 }else if(num1<num2&&num1<num3) {
			 if(num1<num2) {
				 System.out.println("1<2<3 ");
			 }else{
				 System.out.println("1<3<2 ");
			 }
		 }
		
		 
		 
		 
		 
	}
}
