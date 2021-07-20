package java101;

public class ArrayRepetitionFinder {

	// After finding that the x value is a duplicate
	// Do not show anymore duplicate's of the same x value
	static boolean isFind(int[] arr, int value) {
		for (int i : arr) {
			if (i == value) {
				return true;
			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] list = { 3, 7, 3, 3, 2, 9, 10, 21, 1, 33, 9, 1 };
		int[] duplicate = new int[list.length];
		int startIndex = 0;
		for (int i = 0; i < list.length; i++) {
			for (int j = 0; j < list.length; j++) {
				//Do not try to check yourself in array
				if ((i != j) && (list[i] == list[j])) {
					if (!isFind(duplicate, list[i])) {
						duplicate[startIndex++] = list[i];
					}
					break;
				}
			}
		}

		for (int value : duplicate) {
			if (value != 0) {
				System.out.println(value);
			}
		}
	}
}
