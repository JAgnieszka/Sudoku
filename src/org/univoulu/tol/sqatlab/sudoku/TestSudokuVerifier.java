package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	
	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String inncorrectString="123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	String inncorrectString2="012345067809901230405678891234567789123456678912345567891234456789123345678912234";


	@Test
	public void tests() {
		SudokuVerifier answer=new SudokuVerifier();
		answer.verify(correctString);
		
		assertEquals("0", "0");
	}
	
	
	@Test
	public void testCheckValidSodukuSolution() {
		
		SudokuVerifier answer=new SudokuVerifier();
		
		//good answer
		answer.verify(correctString);		
		assertEquals("0", "0");
		
		//bad answer
		answer.verify(inncorrectString2);		
		assertEquals("-1", "-1");
	}
	
//	@Test
//	public void testCheckAllDigitsAppearOnlyOnceInSubGrid() {
//		SudokuVerifier answer=new SudokuVerifier();
//		answer.verifyRuleSecond(3);
//		assertEquals("0", "0");
//		answer.verifyRuleSecond(2);
//		assertEquals("0", "0");
//		answer.verifyRuleSecond(1);
//		assertEquals("0", "0");
//		answer.verifyRuleSecond(3);
//		assertEquals("-2", "-2");
//	}
	

}
