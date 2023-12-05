package junitDemo.helper;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.experimental.theories.ParametersSuppliedBy;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;


@RunWith(Parameterized.class)
public class StringHelperParametrizedTest {

	
	StringHelper helper = new StringHelper();
	
	private String input;
	private String expectedOutput;
	
	
	public StringHelperParametrizedTest(String input, String expectedOutput) {
		super();
		this.input = input;
		this.expectedOutput = expectedOutput;
	}
	
	//input --> AACD
    //expectedoutput -->CD
	@Parameters
	public static Collection<String[]> testConditions(){
		String expectedOutputs[][] = {{"AACD","CD"},{"ACD","CD"},{"AAAA","AAAA"}};
	return Arrays.asList(expectedOutputs);
	}
	
	@Test
	public void testTruncateAInFirst2Positions() {
	
		assertEquals( expectedOutput , helper.truncateAinFirst2Positions(input));
	}
	
	
	
	@Test
	public void first2andLast2CharactersAreSame2() {
		
	
		assertEquals( false ,helper.first2andLast2CharactersAreSame(input));
	}
	
	

}
