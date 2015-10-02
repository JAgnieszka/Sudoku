package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;

public class SudokuVerifier {
	
	//ArrayList<E>
	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";

	int counter=0;
	
	public int verify(String candidateSolution) {
		
		// returns 1 if the candidate solution is correct
		return 4;
	}
	public int verifytest(String candidateSolution) {
		
		// returns 1 if the candidate solution is correct
		return 4;
	}
	
	public int verifyRuleOne(int i) {
		if(i>=1 && i<=9)
		{
			System.out.println("The first rule is filfilled");
			return 0;
			}
		System.out.println("The first rule is not filfilled. - R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.");
		return -1;
		
	}
}

