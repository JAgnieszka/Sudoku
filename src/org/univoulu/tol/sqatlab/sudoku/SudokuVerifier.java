package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuVerifier {

	char tab[][] = new char[9][9];

	public String verify(String candidateSolution) {
		int length = 0;

		for (int row = 0; row <= 8; row++) {
			for (int column = 0; column <= 8; column++) {

				tab[row][column] = candidateSolution.charAt(length);
				length++;
				// System.out.println(tab[row][column]);
				// System.out.println("length " + length);
			}
		}

		// here I check Rule 1
		String result = checkCell(tab);
		System.out.println("RESULT " + result);
		return result;
	}

	private String checkCell(char[][] tab) {
		boolean flag = false;

		
		for (int row = 0; row <= 8; row++) {
			for (int column = 0; column <= 8; column++) {
				
				System.out.print(tab[row][column]+" ");
				
				char aa = tab[row][column];
				System.out.println("AA "+ aa);
				int digit= (int) aa;
							
				if (digit >= 1 && digit <= 9) {
					
					System.out.println("The first rule is filfilled");
					flag = true;

				} else {
					return "-1";
				}
			}
			System.out.println();
		}

		if (flag) {
			return "0";
		}
		return "-7";

	}


	// public int verifyRuleSecond(int i) {
	//
	// if (answerList.contains(i)) {
	// return -2;
	// } else {
	// answerList.add(i);
	// return 0;
	// }
	//
	// // for(int j=0;j<=answerList.size(); j++){
	// // int tmp=answerList.get(j);
	// //
	// // System.out.println("tmp "+tmp);
	// // }
	//
	// }

}
