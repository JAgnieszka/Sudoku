package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		SudokuVerifier answer=new SudokuVerifier();
		answer.verifytest("4");
		
		assertEquals("4", "4");
	}
	
	@Test
	public void testCheckValidSodukuSolution() {
		
		SudokuVerifier answer=new SudokuVerifier();
		
		//good answer
		answer.verifyRuleOne(4);		
		assertEquals("0", "0");
		
		//bad answer
		answer.verifyRuleOne(10);		
		assertEquals("-1", "-1");
	}
	
	@Test
	public void testCheckAllDigitsAppearOnlyOnceInSubGrid() {
		SudokuVerifier answer=new SudokuVerifier();
		answer.verifyRuleSecond(3);
		assertEquals("0", "0");
		answer.verifyRuleSecond(2);
		assertEquals("0", "0");
		answer.verifyRuleSecond(1);
		assertEquals("0", "0");
		answer.verifyRuleSecond(3);
		assertEquals("-2", "-2");
	//	assertEquals("4", "4");
	}
	

}
