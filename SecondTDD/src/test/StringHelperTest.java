package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.StringHelper;

class StringHelperTest {

	StringHelper sh = new StringHelper();
	
	@Test
	void testIfAisPresentAtFirstChar() {
		
		assertEquals("BCD",sh.removeAatFirstTwoChars("ABCD"));
	}
	
	@Test
	void testIfAisPresentAtFirstTwoChar() {
		
		assertEquals("CD",sh.removeAatFirstTwoChars("AACD"));
	}
	
	@Test
	void testIfAisPresentAtSecondChar() {
		
		assertEquals("BCD",sh.removeAatFirstTwoChars("BACD"));
	}
	
	@Test
	void testIfAisPresentAtThirdAndFourthChar() {
		
		assertEquals("BBAA",sh.removeAatFirstTwoChars("BBAA"));
	}

}
