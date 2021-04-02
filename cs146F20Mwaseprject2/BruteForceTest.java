package cs146F20Mwaseprject2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BruteForceTest {
	
	@Test
	public void testBruteForce() {
		int[] array = {22, -27, 38, -34, 49, 40, 13, -44, -13, 28, 46, 7, -26, 42, 29, 0, -6, 35, 23, -37, 10, 12,
	                -2, 18, -12, -49, -10, 37, -5, 17, 6, -11, -22, -17, -50, -40, 44, 14, -41, 19, -15, 45, -23, 48, -1,
	                -39, -46, 15, 3, -32, -29, -48, -19, 27, -33, -8, 11, 21, -43, 24, 5, 34, -36, -9, 16, -31, -7, -24,
	                -47, -14, -16, -18, 39, -30, 33, -45, -38, 41, -3, 4, -25, 20, -35, 32, 26, 47, 2, -4, 8, 9, 31, -28,
	                36, 1, -21, 30, 43, 25, -20, -42};
		int expected = 239;
		int actual = BruteForce.maximumSub(array);
		assertEquals(expected, actual);			
	}
	
	@Test
	public void testBruteForce2() {
		int[] array = {-2, -5, 6, -2, -3, 1, 5, -6};
		int expected = 7;
		int actual = BruteForce.maximumSub(array);
		assertEquals(expected, actual);			
	}
	
	@Test
	public void testBruteForce3() {
	int[] array = {-18, -47, -40, -43, -2, 48, 31, -24, 36, -49, 4, -29, -4, -39, 12, 24, 8, 40, 45, -17, 6, -11, -5,
				-30, -8, 25, -44, -9, -20, -50, -12, -32, 41, 10, -42, -15, 11, -38, 37, 21, 33, -22, 16, -41, -46, -33, -26, 
				7, -3, -28, 29, 20, 27, 3, 15, 49, 23, -1, 14, 32, -31, -13, -48, -14, 13, 39, 46, -35, -36, 0, 17, -27, -21, 
				28, -7, 44, -10, 34, -19, 47, 42, -34, 5, 26, -45, 35, 9, -25, 38, -37, -23, 22, -6, -16, 18, 43, 30, 2, 19, 1};
		int expected = 322;
		int actual = BruteForce.maximumSub(array);
		assertEquals(expected, actual);					
	}
}
