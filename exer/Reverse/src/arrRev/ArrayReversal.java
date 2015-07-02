package arrRev;

public class ArrayReversal {

	public static void main(String args[]) {

		int[] revArray = { -1, 7, 0, 3, 5, 6 };
		reverse(revArray);
	}

	public static void reverse(int[] revArray) {
		try {
			for (int i = 0; i < revArray.length / 2; i++) {
				// temporary variable which performs rotation in the loop
				int temp = revArray[revArray.length - 1 - i];

				revArray[revArray.length - 1 - i] = revArray[i];

				revArray[i] = temp;

			}
		} catch (NullPointerException e) {
			System.out.println("Null value!");
		}

		for (int iterator : revArray) {
			System.out.println(iterator + " ");
		}
	}
}
