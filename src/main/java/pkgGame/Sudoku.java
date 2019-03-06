package pkgGame;

import pkgHelper.LatinSquare;

public class Sudoku extends LatinSquare {

	private int iSize;
	private int iSqrtSize;
	
	public Sudoku(int iSize) { 
		this.iSize = iSize;
		this.iSqrtSize = (int) Math.sqrt((double)iSize);
	}
	
	public Sudoku(int[][] puzzle) { 
		super(puzzle);
	}
	
	public int[][] getPuzzle() {
		return null;
	}
	
	public int[] getRegion(int r) {
		return null;
	}
	
	public int[] getRegion(int iCol, int iRow) {
		return null;
	}
	
	public boolean hasDuplicates() {
		return false;
	}
	
	public boolean isPartialSudoku() {
		return false;
	}
	
	public boolean isSudoku() {
		return false;
	}
	
	public boolean isValidValue(int iCol, int iRow, int iValue) {
		return false;
	}

	
}
