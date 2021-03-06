package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SudokuVerifier {

	char tab[][] = new char[9][9];
	private String result = "0";

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
		if (result.equals("-1")) {
			return "-1";
		}

		// here I check Rule 2
		result = checkSubGrid(tab);
		if (result.equals("-2")) {
			return "-2";
		}

		// here I check Rule 3
		result = checkRows(tab);
		if (result.equals("-3")) {
			return "-3";
		}

		// here I check Rule 4
		result = checkColumns(tab);
		if (result.equals("-4")) {
			return "-4";
		}

		return result;
	}

	private String checkColumns(char[][] tab2) {

		for (int column = 0; column <= 8; column++) {
			Set<Character> set = new HashSet<Character>();
			for (int row = 0; row <= 8; row++) {
				if (set.contains(tab[row][column])) {
					return "-4";
				} else {
					set.add(tab[row][column]);
				}

			}

		}

		return "0";
	}

	private String checkRows(char[][] tab) {

		for (int row = 0; row <= 8; row++) {
			Set<Character> set = new HashSet();
			for (int column = 0; column <= 8; column++) {
				if (set.contains(tab[row][column])) {
					return "-3";
				} else {
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

				// System.out.print(tab[row][column] + " ");

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

	private String checkSubGrid(char[][] tab) {

		for (int r = 0, c = 0, n = 3, nr = n; r < n && c < n && n <= 9; c = c + 3, n = n + 3) {

			for (int row = r; row < nr; row++) {

				Set<Character> set = new HashSet<Character>();
				for (int column = c; column < n; column++) {
					if (set.contains(tab[row][column])) {
						return "-2";
					} else {
						set.add(tab[row][column]);
					}

				}

			}

		}

		for (int r = 3, c = 0, n = 3; c < n && n <= 9; c = c + 3, n = n + 3) {

			for (int row = r; row < 6; row++) {

				Set<Character> set = new HashSet<Character>();
				for (int column = c; column < n; column++) {

					if (set.contains(tab[row][column])) {
						return "-2";
					} else {
						set.add(tab[row][column]);
					}
				}

			}

		}

		for (int r = 6, c = 0, n = 3; c < n && n <= 9; c = c + 3, n = n + 3) {

			for (int row = r; row < 9; row++) {

				Set<Character> set = new HashSet<Character>();
				for (int column = c; column < n; column++) {
					if (set.contains(tab[row][column])) {
						return "-2";
					} else {
						set.add(tab[row][column]);
					}

				}

			}

		}

		return "0";
	}

}
