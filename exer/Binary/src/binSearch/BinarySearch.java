package binSearch;

import java.util.Scanner;

public class BinarySearch {
	
/*Searches for the integer key in the sorted array numArr[]
     * @param sorted[] the array which is equal to input from user
     * @param first - checks in if statement where can find the number and continue
     * @param last - checked in if statement their place
     * @return false if numbers are not in the list
     * 
 * 
 * */
	public static boolean search(int[] sorted, int numArr, int first, int last) {
		Scanner in = new Scanner(System.in);
		numArr = in.nextInt();
		
		sorted = new int[numArr];

		System.out.println("Enter " + numArr + " integers");

		for (int counter = 0; counter < numArr; counter++) {
			sorted[counter] = in.nextInt();
		}
		System.out.println("Enter value to find");

		int search = in.nextInt();

		first = 0;
		last = numArr - 1;
		int middle = (first + last) / 2;

		while (first <= last) {

			if (sorted[middle] < search) {
				
				first = middle + 1;

			} else if (sorted[middle] == search) {

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
		return false;
	}

	public boolean find(int[] sortedValues, int value) {
		return search(sortedValues, value, 0, sortedValues.length - 1);
	}
	
	/*Created for the JUnit Test
	 * short algorithm of the program
	 * */
	public static boolean containsTest(int[] a, int b) {
		if (a.length == 0) {
			return false;
		}
		int low = 0;
		int high = a.length - 1;

		while (low <= high) {
			int middle = (low + high) / 2;
			if (b > a[middle]) {
				low = middle + 1;
			} else if (b < a[middle]) {
				high = middle - 1;
			} else { // The element has been found
				return true;
			}
		}
		return false;
	}
	
	 /**
     * Reads in a sequence of integers from the input, specified as
     * a command-line argument. Reads in integers from standard input and
     * prints to standard output those integers that do *not* appear.
     */
	public static void main(String args[]) {
		int sorted[] = null;
		int numArr = 0, first = 0, last = 0;

		Scanner in = new Scanner(System.in);

		System.out.println("Enter number of elements");

		search(sorted, numArr, first, last);

	}

	
}