package patikaStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Main {

	public static void menu() {
		int select;
		do {
			System.out.println("PatikaStore �r�n Y�netim Paneli !");
			System.out.println("1 - Notebook ��lemleri");
			System.out.println("2 - Cep Telefonu ��lemleri");
			System.out.println("3 - Marka Listele");
			System.out.println("0 - ��k�� Yap");
			System.out.print("Tercihiniz: ");
			Scanner input= new Scanner(System.in);
			select= input.nextInt();
			switch(select) {
			case 1:
				
				break;
			case 2:
				break;
			case 3:
				
				break;
			}
		}while(select!=0);
		
	}

	public static void main(String[] args) {
		//Bulk load
		Product[] product;
		Brand[] brand;
		menu();
	}

}
