package cs146F20Mwaseprject2;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FindDollarTest {

	//Initializing  array 
			String ann[] = {"ate", "eat", "tea", "zoo"}; 
			
			@Test
			public void testEnd() {
				//Initializing Bill array
				String bill[] = {"ate", "eat", "tea", "zoo","$"}; 
				
				int expected = 4;
				int actual = FindDollar.findDollar(bill,"$");
				assertEquals(expected, actual);			

			}
			
			@Test
			public void testMid() {
				//Initializing Bill array
				String bill[] = {"ate", "eat","$", "tea", "zoo"}; 

				int expected = 2;
				int actual = FindDollar.findDollar(bill,"$");
				assertEquals(expected, actual);	
			}
			
			@Test
			public void testBeg() {
				//Initializing Bill array
				String bill[] = {"$","ate", "eat","tea", "zoo"}; 
				
				int expected = 0;
				int actual = FindDollar.findDollar(bill,"$");
				assertEquals(expected, actual);	
			}
			@Test
			public void testEq() {
				//Initializing Bill array
				String bill[] = {"ate", "eat","tea", "zoo"}; 

				int expected = -1;
				int actual = FindDollar.findDollar(bill,"$");
				assertEquals(expected, actual);	
			}

}
