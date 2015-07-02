import java.util.Scanner;

class BinarySearch {
	public static void main(String args[]) {
		int first, last, middle, numArr, search, array[];

		// input scanner
		Scanner in = new Scanner(System.in);
		// take entered
		System.out.println("Enter number of elements");
		numArr = in.nextInt();
		// adds in array
		array = new int[numArr];

		System.out.println("Enter " + numArr + " integers");

		for (int counter = 0; counter < numArr; counter++) {
			array[counter] = in.nextInt();
		}

		System.out.println("Enter value to find");
		search = in.nextInt();

		first = 0;
		last = numArr - 1;
		middle = (first + last) / 2;

		while (first <= last) {
			if (array[middle] < search) {
				// search from half to the right equals first
				first = middle + 1;
			} else if (array[middle] == search) {
				System.out.println(search + " found at location "
						+ (middle + 1) + ".");
				break;
			} else {
				last = middle - 1;
			}
			middle = (first + last) / 2;
		}
		if (first > last) {
			System.out.println(search + " is not present in the list.\n");
		}
	}
}