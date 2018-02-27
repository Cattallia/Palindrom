package org.itstep;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class PalindromCreator {

	private static Logger logger = Logger.getLogger(PalindromCreator.class.getName());

	public static void main(String[] args) {
		LinkedList<Integer> numbers = new LinkedList<Integer>();
		for (int i = 100; i < 1000; i++) {
			for (int j = 100; j < 1000; j++) {
				int multResult = i * j;
				if (isPalindrom(multResult))
					;
				{
					numbers.add(multResult);
				}
			}
		}
		int maxValue = getMaxPalindrom(numbers);
		logger.log(Level.INFO, "Maximal palidrom value is " + maxValue);
	}

	public static boolean isPalindrom(int palindromNumber) {
		String palindromText = String.valueOf(palindromNumber);
		char[] symbols = palindromText.toCharArray();
		int lastIndex = symbols.length - 1;
		for (int i = 0; i < symbols.length / 2; i++) {
			if (symbols[i] != symbols[lastIndex - i]) {
				return false;
			}
		}
		return true;
	}

	public static int getMaxPalindrom(LinkedList<Integer> numberList) {
		int maxVelue = Integer.MIN_VALUE;
		for (Integer integer : numberList) {
			if (integer >= maxVelue)
				maxVelue = integer;

		}
		return maxVelue;
	}

}