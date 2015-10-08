package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectString22 = "417369825643215894795872431682543716979158643234691275828964357157329168416487529"; // test2
	String incorrectString = "417369825632158947958724316825437169791586432346912758289643573573291684164875291"; // test3
	// String incorrectString =
	// "417369825632158947958724316825437169791586432346912758 289643 573 573291
	// 684 164875 291";
	String incorrectString2 = "4170369825632158947958724316825437169791586432346912758289643571573291684164875293"; // test1
	String incorrectString4 = "417369825432158967958724316825437169791586432346912758289643571573291684164875293"; // test4

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

	// **********RULE 2********************

	@Test
	public void testCheckSubGridCORRECT() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// good answer
		result = answer.verify(correctString);
		assertEquals("0", result);

	}

	@Test
	public void testCheckSubGridINCORRECT() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// good answer

		result = answer.verify(incorrectString22);
		assertEquals("-2", result);
	}

	// **********RULE 3********************

	@Test
	public void testCheckDigitAppearOnlyInRows() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// bad answer
		result = answer.verify(incorrectString);
		assertEquals("-3", result);
	}

	// **********RULE 4********************

	@Test
	public void testCheckDigitAppearOnlyInColumns() {

		SudokuVerifier answer = new SudokuVerifier();
		String result;

		// bad answer
		result = answer.verify(incorrectString4);
		assertEquals("-4", result);
	}

}
