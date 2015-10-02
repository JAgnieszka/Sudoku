package org.univoulu.tol.sqatlab.sudoku;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSudokuVerifier {

	@Test
	public void test() {
		SudokuVerifier answer=new SudokuVerifier();
		answer.verify("4");
		
		assertEquals("4", "4");
	}

}
