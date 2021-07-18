package java101;

import java.util.Scanner;

public class ATM {
	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);

		int right = 3;
		int balance = 1500;
		int select;

		while (right > 0) {
			System.out.print("Kullanýcý Adýnýz :");
			userName = input.nextLine();
			System.out.print("Parolanýz : ");
			password = input.nextLine();

			if (userName.equals("patika") && password.equals("dev123")) {
				System.out.println("Merhaba, Kodluyoruz Bankasýna Hoþgeldiniz!");

				System.out.println("1-Para yatýrma\n" + "2-Para Çekme\n" + "3-Bakiye Sorgula\n" + "4-Çýkýþ Yap");
				System.out.print("Lütfen yapmak istediðiniz iþlemi seçiniz : ");
				select = input.nextInt();

				do {
					switch (select) {
					case 1:
						System.out.print("Para miktarý : ");
						int price = input.nextInt();
						balance += price;
						break;
					case 2:
						System.out.print("Para miktarý : ");
						price = input.nextInt();
						if (price > balance) {
							System.out.println("Bakiye yetersiz.");
						} else {
							balance -= price;
						}
						break;
					case 3:
						System.out.println("Bakiyeniz : " + balance);
						break;
					case 4:
						System.out.println("Tekrar görüþmek üzere.");
						break;
					default:
						System.out.println("Please only select 1-4");
						break;
					}
					input.close();
				} while (select != 4);

			}

			else {
				right--;
				System.out.println("Hatalý kullanýcý adý veya þifre. Tekrar deneyiniz.");
				if (right == 0) {
					System.out.println("Hesabýnýz bloke olmuþtur lütfen banka ile iletiþime geçiniz.");
				} else {
					System.out.println("Kalan Hakkýnýz : " + right);
				}

			}

		}
	}
}