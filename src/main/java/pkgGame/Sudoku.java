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
		// TODO: Yifan will do this.
		return super.getLatinSquare();
	}
	
	public int[] getRegion(int r) {
		// TODO: Yifan will do this.
		return null;
	}
	
	public int[] getRegion(int iCol, int iRow) {
		// TODO: Yifan will do this.
		return null;
	}
	
	public boolean hasDuplicates() {
		for(int[] oned : this.getPuzzle())
			if(super.hasDuplicates(oned))
				return true;
		

		return false;
	}
	
	public boolean isPartialSudoku() {
		// TODO: Yisi will do this.
		return false;
	}
	
	public boolean isSudoku() {
		// TODO: Yisi will do this.
		
		// ...
		// fixed!
		
		return false;
	}
	
	public boolean isValidValue(int iCol, int iRow, int iValue) {
		// TODO: Aris will do this.
		
		boolean isValidValue = false;

		if (super.hasDuplicates(getRow(iRow)) || super.hasDuplicates(getColumn(iCol)) || super.ContainsZero() == true) 
		{
			return isValidValue;
		}else { 
			if(super.doesElementExist(getRow(iRow), iValue) && super.doesElementExist(getColumn(iCol), iValue))
				isValidValue = true;
		}
		
		return isValidValue;
	}

	
}
	

	
