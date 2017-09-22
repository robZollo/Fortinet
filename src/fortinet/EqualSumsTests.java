package fortinet;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class EqualSumsTests {

	@Test
	public void test() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(5);
		
		assertTrue(EqualSums.separate(list, 2));
	}
	
	@Test
	public void testNoSolution() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(5);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(5);
		
		assertFalse(EqualSums.separate(list, 4));
	}
	
	@Test
	public void testNegatives() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(-10);
		list.add(35);
		list.add(-15);
		list.add(12);
		list.add(8);
		list.add(30);
		
		assertTrue(EqualSums.separate(list, 3));
	}
	
	@Test
	public void testKTooBig() {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(35);
		list.add(15);
		list.add(12);
		list.add(8);
		list.add(30);
		
		assertFalse(EqualSums.separate(list, 12));
	}

}
