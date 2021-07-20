package java101;

public class ArrayHarmonicMeanCalculator {
	public static void main(String[] args) {
		int[] numbers = {1, 2, 3, 4, 5};
		double sum = 0;
		double n= numbers.length;
		for (int i = 0; i < n; i++) {
            sum += (1/numbers[i]);
		}
        System.out.println(n/sum);
        
	}
}
