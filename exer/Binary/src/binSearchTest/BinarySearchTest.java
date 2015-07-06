package binSearchTest;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import binSearch.BinarySearch;

public class BinarySearchTest {

	private BinarySearch bin;

	@Before
	public void setUp() throws Exception {
		bin = new BinarySearch();
	}

	@Test
	public void shouldReturnFalseIfArrayIsEmpty() {
		assertEquals(false, bin.find(new int[] {}, 1));
	}

	@Test
	public void shouldReturnFalseIfNotFoundInSortedOddArray() {
		assertEquals(false,
				bin.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 9));
	}

	@Test
	public void shouldReturnFalseIfNotFoundInSortedEvenArray() {
		assertEquals(false,
				bin.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16, 18 }, 9));
	}

	@Test
	public void shouldReturnTrueIfFoundAsFirstInSortedArray() {
		assertEquals(true,
				bin.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 0));
	}

	@Test
	public void shouldReturnTrueIfFoundAtEndInSortedArray() {
		assertEquals(true,
				bin.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 16));
	}

	@Test
	public void shouldReturnTrueIfFoundInMiddleInSortedArray() {
		assertEquals(true,
				bin.find(new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 }, 8));
	}

	// covers the 'true' cases above
	@Test
	public void shouldReturnTrueIfFoundAnywhereInSortedArray() {
		int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

		for (int i = 0; i < sorted.length; i++) {
			assertEquals(true, bin.find(sorted, sorted[i]));
		}
	}

	// covers the 'false' cases above
	@Test
	public void shouldReturnFalseIfNotFoundInSortedArray() {
		int[] sorted = new int[] { 0, 2, 4, 6, 8, 10, 12, 14, 16 };

		assertEquals(false, bin.find(sorted, sorted[0] - 1));
		for (int i = 0; i < sorted.length; i++) {
			assertEquals(false, bin.find(sorted, sorted[i] + 1));
		}
	}

}
