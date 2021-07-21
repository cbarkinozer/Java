package java101;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NumberGuessGame {
	public static void main(String[] args) {
        Random rand = new Random();
        int number = rand.nextInt(100);

        Scanner input = new Scanner(System.in);
        int MAX_RIGHT=5;
        int right = 0;
        int selected;
        int[] wrong = new int[MAX_RIGHT];
        boolean isWin = false;
        boolean isWrong = false;
        
        while (right < MAX_RIGHT) {
            System.out.print("Lütfen tahmininizi giriniz : ");
            selected = input.nextInt();

            if (selected < 0 || selected > 99) {
                System.out.println("Lütfen 0-100 arasýnda bir deðer giriniz.");
                if (isWrong) {
                    right++;
                    System.out.println("Çok fazla hatalý giriþ yaptýnýz. Kalan hak : " + (MAX_RIGHT - right));
                } else {
                    isWrong = true;
                    System.out.println("Bir daha hatalý giriþinizde hakkýnýzdan düþülecektir.");
                }
                continue;
            }

            if (selected == number) {
                System.out.println("Tebrikler, doðru tahmin ! Tahmin ettiðini sayý : " + number);
                isWin = true;
                break;
            } else {
                System.out.println("Hatalý bir sayý girdiniz !");
                if (selected > number) {
                    System.out.println("\n"+selected + " sayýsý, gizli sayýdan büyüktür.");
                } else {
                    System.out.println("\n"+selected + " sayýsý, gizli sayýdan küçüktür.");
                }

                wrong[right++] = selected;
                System.out.println("Kalan hakký : " + (MAX_RIGHT - right));
            }
        }

        if (!isWin) {
            System.out.println("Kaybettiniz ! ");
            System.out.println("Gizli sayý: "+number);
            if (!isWrong) {
                System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
            }
        }
        input.close();

    }
}
