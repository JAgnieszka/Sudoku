package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectString = "123451678991234567889123456778912345667891234556789123445678912334567891223456789";
	String incorrectString2 = "4170369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectString4 = "417369825432158967958724316825437169791586432346912758289643571573291684164875293";

	// **********RULE 1********************
	@Test
	public void testCheckValidSodukuSolutionCORRECT() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// good answer
		result = answer.verify(correctString);
		assertEquals("0", result);

	}

	@Test
	public void testCheckValidSodukuSolutionINCORRECT() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// bad answer
		result = answer.verify(incorrectString2);
		assertEquals("-1", result);
	}

	// ************************************

	// **********RULE 3********************

	@Test
	public void testCheckDigitAppearOnlyInRows() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// bad answer
		result = answer.verify(incorrectString);
		assertEquals("-3", result);
	}

	// **********************************
	
	// **********RULE 4********************

	@Test
	public void testCheckDigitAppearOnlyInColumns() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// bad answer
		result = answer.verify(incorrectString4);
		assertEquals("-4", result);
	}

	// **********************************
	

	// @Test
	// public void testCheckAllDigitsAppearOnlyOnceInSubGrid() {
	// SudokuVerifier answer=new SudokuVerifier();
	// answer.verifyRuleSecond(3);
	// assertEquals("0", "0");
	// answer.verifyRuleSecond(2);
	// assertEquals("0", "0");
	// answer.verifyRuleSecond(1);
	// assertEquals("0", "0");
	// answer.verifyRuleSecond(3);
	// assertEquals("-2", "-2");
	// }

}
