package customList;

public class Main {
	public static void main(String[] args) {

		// Tests

		// Test serie 1
		CustomList<Integer> liste = new CustomList<>();
		System.out.println("Dizideki Eleman Say�s� : " + liste.size());
		System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
		liste.add(10);
		liste.add(20);
		liste.add(30);
		liste.add(40);
		System.out.println("Dizideki Eleman Say�s� : " + liste.size());
		System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
		liste.add(50);
		liste.add(60);
		liste.add(70);
		liste.add(80);
		liste.add(90);
		liste.add(100);
		liste.add(110);
		System.out.println("Dizideki Eleman Say�s� : " + liste.size());
		System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

		// Test serie 2
		CustomList<Integer> liste2 = new CustomList<>();
		liste2.add(10);
		liste2.add(20);
		liste2.add(30);
		System.out.println("2. indisteki de�er : " + liste2.get(2));
		liste2.remove(2);
		liste2.add(40);
		liste2.set(0, 100);
		System.out.println("2. indisteki de�er : " + liste2.get(2));
		System.out.println(liste2.toString());

		// Test serie 3
		CustomList<Integer> liste3 = new CustomList<>();
		System.out.println("Liste Durumu : " + (liste3.isEmpty() ? "Bo�" : "Dolu"));
		liste3.add(10);
		liste3.add(20);
		liste3.add(30);
		liste3.add(40);
		liste3.add(20);
		liste3.add(50);
		liste3.add(60);
		liste3.add(70);

		System.out.println("Liste Durumu : " + (liste3.isEmpty() ? "Bo�" : "Dolu"));

		// Buldu�u ilk indeksi verir
		System.out.println("Indeks : " + liste3.indexOf(20));

		// Bulamazsa -1 d�nd�r�r
		System.out.println("Indeks :" + liste3.indexOf(100));

		// Buldu�u son indeksi verir
		System.out.println("Indeks : " + liste3.lastIndexOf(20));

		// Listeyi Object[] dizisi olarak geri verir.
		Object[] dizi = liste3.toArray();
		System.out.println("Object dizisinin ilk eleman� :" + dizi[0]);

		// Liste veri t�r�nde alt bir liste olu�turdu
		CustomList<Integer> mySubList = liste3.subList(0, 3);
		System.out.println(mySubList.toString());

		// De�erim listedeki olup olmad���n� sorgulad�
		System.out.println("Listemde 20 de�eri : " + liste3.contains(20));
		System.out.println("Listemde 120 de�eri : " + liste3.contains(120));

		// Listeyi tamamen bo�alt�r ve varsay�lan boyutuna �evirir
		liste3.clear();
		System.out.println(liste3.toString());

	}
}
