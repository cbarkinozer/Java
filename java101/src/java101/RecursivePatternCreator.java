package java101;

import java.util.Scanner;

public class RecursivePatternCreator {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
        System.out.println("N Sayýsý : ");
        int n = scanner.nextInt();
        scanner.close();
        System.out.print("Çýktýsý : " );
        func(n,true ,n);


    }
    //Using 3 parameters is a bad practice
    static void func(int number ,boolean flag, int start){
       if(number < 0 ) flag = false;
        System.out.print(" "+ number);
        if(flag) {
            func(number-5,flag,start);
        }else{
            if( number == start )
                return;
            func(number+5,flag,start);

        }

    }
}