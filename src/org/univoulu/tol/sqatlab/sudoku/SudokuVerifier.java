package org.univoulu.tol.sqatlab.sudoku;

import java.util.ArrayList;
import java.util.List;

public class SudokuVerifier {
	
	String correctString = "417369825632158947958724316825437169791586432346912758289643571573291684164875293";
	String inncorrectString="123456789912345678891234567789123456678912345567891234456789123345678912234567891";

	int counter=0;
	
	List<Integer> answerList =new ArrayList<Integer>();
	
	public int verify(String candidateSolution) {
		
		// returns 1 if the candidate solution is correct
		return 0;
	}
	public int verifytest(String candidateSolution) {
//		int [][] tab = {{4,1,7},{3,6,9}};
//		System.out.println(tab);
		
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
	public int verifyRuleSecond(int i) {
		
		
		if(answerList.contains(i)){
			return -2;
		}else{
			answerList.add(i);
			return 0;
		}
	
//		for(int j=0;j<=answerList.size(); j++){
//			int tmp=answerList.get(j);
//
//			System.out.println("tmp "+tmp);
//		}
		
		
		
		
	}
	
	
	
}

