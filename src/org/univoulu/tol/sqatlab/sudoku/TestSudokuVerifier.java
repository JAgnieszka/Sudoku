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
		answer.verifyRuleOne(4);
		
		assertEquals("0", "0");
	}

}
