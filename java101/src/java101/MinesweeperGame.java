package java101;

import java.util.Scanner;

public class MinesweeperGame {
	
	public void plantBomb() {
		int numberOfBomb=0;
		numberOfBomb=Math.floor((MAX_COLUMN*MAX_ROW)/4);
	}
	
	public boolean calculator(int[][]valueArray,int[][]bombArray,boolean game) {
		return game;
	}
	
	public void plotter(int[][]valueArray,int[][]bombArray) {
		for(int i=0;i<valueArray.length;i++) {
			for(int j=0;j<valueArray.length;j++) {
				
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		
		int MAX_COLUMN=3;
		int MAX_ROW=3;
		
		int column=0;
		int row=0;
		
		boolean game=true;
		
		int[][] valueArray= new int[MAX_ROW][MAX_COLUMN];
		int[][] bombArray= new int[MAX_ROW][MAX_COLUMN];
		
		System.out.println("Mayýn Tarlasý Oyuna Hoþgeldiniz !");
		
		plantBomb();
		
		while(game) {
			
			System.out.println("Satýr giriniz: ");
			row=scanner.nextInt();
			System.out.println("Sütun giriniz: ");
			column=scanner.nextInt();
			if((row>MAX_ROW||row<0)&&(column>MAX_COLUMN||column<0)) {
				System.out.println("You have entered wrong input.");
				System.out.println("Please enter between"+0+"-"+MAX_ROW+"for row.");
				System.out.println("Please enter between"+0+"-"+MAX_COLUMN+"for column.");
			}else {
				System.out.println("========================= ");
				calculator(valueArray,bombArray,game);
				plotter(valueArray,bombArray);
			}
			
		}
		scanner.close();
		System.out.println("Game Over!");
	}
}
