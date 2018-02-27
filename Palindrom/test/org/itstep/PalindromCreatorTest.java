package org.itstep;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.LinkedList;

import org.junit.Test;

public class PalindromCreatorTest {

	@Test
	public void testIsPalindrom() {
		int palindromNumber = 1234321;
		int notpalindromNumber = 1234567;
		PalindromCreator creator = new PalindromCreator();
		boolean isPalindrom = creator.isPalindrom(palindromNumber);
		assertTrue(isPalindrom);
		boolean notPalindrom = creator.isPalindrom(notpalindromNumber);
		assertTrue(!notPalindrom);
	}
	
	@Test
	public void testIsMaxlindrom() {
		LinkedList<Integer> numberList = new LinkedList<Integer>();
		numberList.addAll(Arrays.asList(123, 456, 789, 147, 258, 369));
		PalindromCreator creator = new PalindromCreator();
		int maxVelue = creator.getMaxPalindrom(numberList);
		assertEquals(789, maxVelue);
		
	}
}
