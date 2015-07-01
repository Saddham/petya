package arrRevTest;
import static org.junit.Assert.*;

import org.junit.Test;

import revClass.ReverseClass;


public class ArrayReversalTest {

	@Test
	public void testReverseWithEvenLengthOfArray() {
		int[] revArray = {1, 2, 3, 4, 5, 6}; 
		ReverseClass.reverse(revArray); 
		assertArrayEquals(new int[]{6, 5, 4, 3, 2, 1}, revArray);


	}
	@Test
	public void testReverseWithOddLengthOfArray() {
		int[] revArray = {1, 2, 3, 4, 5, 6, 7}; 
		ReverseClass.reverse(revArray); 
		assertArrayEquals(new int[]{7, 6, 5, 4, 3, 2, 1}, revArray);


	}
	@Test
	public void testReverseWithEmptyArray() {
		int[] revArray = {}; 
		ReverseClass.reverse(revArray); 
		assertArrayEquals(new int[]{}, revArray);
	}
	@Test
	public void testReverseWithNullArray() {
		int[] revArray = null; 
		ReverseClass.reverse(revArray); 
		assertArrayEquals(null, revArray);
	}
	@Test
	public void testReverseWithJustOneElementArray() {
		int[] revArray = {1}; 
		ReverseClass.reverse(revArray); 
		assertArrayEquals(new int[]{1}, revArray);
	}

}
