package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuVerifier {

	int counter = 0;

	// List<Integer> answerList =new ArrayList<Integer>();
	char tab[][] = new char[9][9];

	public String verify(String candidateSolution) {
		int length = 0;

		for (int row = 0; row <= 8; row++) {
			for (int column = 0; column <= 8; column++) {

				tab[row][column] = candidateSolution.charAt(length);
				length++;
				System.out.println(tab[row][column]);
				System.out.println("length " + length);
			}
		}

	String result =checkCell(tab);
		
		return result;
	}

	private String checkCell(char[][] tab2) {


		
	}

	public int verifyRuleOne(int i) {

		if (i >= 1 && i <= 9) {
			System.out.println("The first rule is filfilled");
			return 0;
		}
		System.out.println(
				"The first rule is not filfilled. - R1: A cell in a Sudoku game can only store positive digits, i.e. 1...9.");
		return -1;

	}

//	public int verifyRuleSecond(int i) {
//
//		if (answerList.contains(i)) {
//			return -2;
//		} else {
//			answerList.add(i);
//			return 0;
//		}
//
//		// for(int j=0;j<=answerList.size(); j++){
//		// int tmp=answerList.get(j);
//		//
//		// System.out.println("tmp "+tmp);
//		// }
//
//	}

}
