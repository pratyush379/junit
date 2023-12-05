package junitDemo.helper;

import static org.junit.Assert.*;

import org.junit.Test;

public class StringHelperTest {

	
	StringHelper helper = new StringHelper();
	@Test
	public void testTruncateAInFirst2Positions() {
		//fail("Not yet implemented");
		//StringHelper helper = new StringHelper();
		String actual = helper.truncateAinFirst2Positions("AACD");
		String expected = "CD";
		assertEquals( expected , actual);
	}
	
	
	@Test
	public void testTruncateAInFirst2Positions2() {
		String actual = helper.truncateAinFirst2Positions("AACD");
		String expected = "CD";
		assertEquals( expected , actual);
	}
	
	@Test
	public void first2andLast2CharactersAreSame() {
	
		assertEquals( true ,helper.first2andLast2CharactersAreSame("AA"));
	}
	
	@Test
	public void first2andLast2CharactersAreSame2() {
	
		assertEquals( false ,helper.first2andLast2CharactersAreSame("AACD"));
	}
	@Test
	public void first2andLast2CharactersAreSame3() {
	     assertFalse(true);
		//assertFalse( helper.first2andLast2CharactersAreSame("AABPA"));
		assertFalse("dummy message",helper.first2andLast2CharactersAreSame("AAAAA"));
	}

}
