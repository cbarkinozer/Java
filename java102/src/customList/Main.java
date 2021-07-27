package customList;

public class Main {
	public static void main(String[] args) {

		// Tests

		// Test serie 1
		CustomList<Integer> liste = new CustomList<>();
		System.out.println("Dizideki Eleman Sayısı : " + liste.size());
		System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
		liste.add(10);
		liste.add(20);
		liste.add(30);
		liste.add(40);
		System.out.println("Dizideki Eleman Sayısı : " + liste.size());
		System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());
		liste.add(50);
		liste.add(60);
		liste.add(70);
		liste.add(80);
		liste.add(90);
		liste.add(100);
		liste.add(110);
		System.out.println("Dizideki Eleman Sayısı : " + liste.size());
		System.out.println("Dizinin Kapasitesi : " + liste.getCapacity());

		// Test serie 2
		CustomList<Integer> liste2 = new CustomList<>();
		liste2.add(10);
		liste2.add(20);
		liste2.add(30);
		System.out.println("2. indisteki değer : " + liste2.get(2));
		liste2.remove(2);
		liste2.add(40);
		liste2.set(0, 100);
		System.out.println("2. indisteki değer : " + liste2.get(2));
		System.out.println(liste2.toString());

		// Test serie 3
		CustomList<Integer> liste3 = new CustomList<>();
		System.out.println("Liste Durumu : " + (liste3.isEmpty() ? "Boş" : "Dolu"));
		liste3.add(10);
		liste3.add(20);
		liste3.add(30);
		liste3.add(40);
		liste3.add(20);
		liste3.add(50);
		liste3.add(60);
		liste3.add(70);

		System.out.println("Liste Durumu : " + (liste3.isEmpty() ? "Boş" : "Dolu"));

		// Bulduğu ilk indeksi verir
		System.out.println("Indeks : " + liste3.indexOf(20));

		// Bulamazsa -1 döndürür
		System.out.println("Indeks :" + liste3.indexOf(100));

		// Bulduğu son indeksi verir
		System.out.println("Indeks : " + liste3.lastIndexOf(20));

		// Listeyi Object[] dizisi olarak geri verir.
		Object[] dizi = liste3.toArray();
		System.out.println("Object dizisinin ilk elemanı :" + dizi[0]);

		// Liste veri türünde alt bir liste oluşturdu
		CustomList<Integer> mySubList = liste3.subList(0, 3);
		System.out.println(mySubList.toString());

		// Değerim listedeki olup olmadığını sorguladı
		System.out.println("Listemde 20 değeri : " + liste3.contains(20));
		System.out.println("Listemde 120 değeri : " + liste3.contains(120));

		// Listeyi tamamen boşaltır ve varsayılan boyutuna çevirir
		liste3.clear();
		System.out.println(liste3.toString());

	}
}
