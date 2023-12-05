package junitDemo.helper;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class QuickBeforeAfterTest {

	
	@BeforeClass
	public static void setupBeforeClass() {
		System.out.println("setup Before test -> Class level");
	}
	@Before
	public void setupBefore() {
		System.out.println("setup Before test");
	}
	
	@Test
	public void test() {
		System.out.println("test 1");
	}
	
	@Test
	public void test2() {
		System.out.println("test 2");
	}
	
	@After
	public void setupAfter() {
		System.out.println("setup after test");
	}

	/*
	 * OUTPUT ->
	 * setup Before test
test 1
setup after test
setup Before test
test 2
setup after test

	 * 
	 */
}
