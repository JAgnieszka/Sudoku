package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudokuVerifier {

	char tab[][] = new char[9][9];
	private String result;

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
		result = checkCell(tab);
		
		//here I check Rule 3
		result = checkRows(tab);
		
		System.out.println("RESULT " + result);
		return result;
	}

	private String checkRows(char[][] tab) {


		for (int row = 0; row <= 8; row++) {
			Set<Character> set=new HashSet();
			for (int column = 0; column <= 8; column++) {
				if(set.contains(tab[row][column])){
					return "-3";
				}else{
					set.add(tab[row][column]);
				}
				
			}
			
		}

		return "0";
	}

	private String checkCell(char[][] tab) {
		boolean flag = false;

		for (int row = 0; row <= 8; row++) {
			for (int column = 0; column <= 8; column++) {

				System.out.print(tab[row][column] + " ");
				
				 // change from char to int
				int digit = Character.getNumericValue(tab[row][column]);
				if (digit >= 1 && digit <= 9) {

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
		return "-1";

	}

}
