package junitDemo.helper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArraysCompareTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
		int[] numbers = {12,3,4,1};
		int[] expected = {1,3,4,12};
		
		Arrays.sort(numbers);
		assertArrayEquals(expected,numbers);
	}
	
	@Test(expected=NullPointerException.class)
	public void testException() {
		//fail("Not yet implemented");
		int[] numbers = null;
		Arrays.sort(numbers);
		
	}
	
	@Test(timeout=10000)//in milisecond -> performance testing
	public void testSort_Performance() {
		int array[] = {12,31,4};
		for(int i=1;i<=10000000;i++) {
			array[0]=i;
			Arrays.sort(array);
		}
	}

}
