package java101;

public class PrimeNumberCalculator {
	public static void main(String[] args) {
	    
		int sayac1=0,sayac2=0;
		
		for(int i=2;i<=100;i++)
		{
			sayac1=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					sayac1++;
					break; 
				}
			}
			if(sayac1==0)
			{
				System.out.println(i);
				sayac2++;
			}
		}
		System.out.println("1-100 arasý Toplam "+sayac2+" adet asal sayý var.");
		
	}
    }    

