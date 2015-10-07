package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {
	
	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String incorrectString="123456789912345678891234567789123456678912345567891234456789123345678912234567891";
	String incorrectString2="012345067809901230405678891234567789123456678912345567891234456789123345678912234";
	
	//**********RULE 1********************
	@Test
	public void testCheckValidSodukuSolutionCORRECT() {
		
		SudokuVerifier answer=new SudokuVerifier();
		String result;
		
		//good answer
		result=answer.verify(correctString);		
		assertEquals("0", result);
		
	}
	
		@Test
		public void testCheckValidSodukuSolutionINCORRECT() {
			
			SudokuVerifier answer=new SudokuVerifier();
			String result;
			
			//bad answer
			result=answer.verify(incorrectString2);		
			assertEquals("-1", result);
		}
		
	//************************************	
	
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
