package binSearchTest;

import binSearch.BinarySearch;
import static org.junit.Assert.*;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

public class BinarySearchContainsTest {

	 @Test
	  public void testContains() {
	    int[]a = {1, 2, 3, 4, 5, 7, 17,  19 };
//	    assertTrue(BinarySearch.containsTest(a, 17));
	    assertTrue(BinarySearch.containsTest(a, 1));
	    assertTrue(BinarySearch.containsTest(a, 2));
	    assertTrue(BinarySearch.containsTest(a, 3));
	    assertTrue(BinarySearch.containsTest(a, 4));
	    assertFalse(BinarySearch.containsTest(a, 10));
	  }

}
