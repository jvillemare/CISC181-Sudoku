package pkgGame;

import pkgHelper.LatinSquare;
import java.lang.Math; 

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

		return super.getLatinSquare();
		
	}
	
	public int[] getRegion(int r) {
		
		int regionSize = (int) Math.sqrt(this.getPuzzle().length);
		
		return this.getRegion(r % regionSize, r / regionSize);
		
	}
	
	public int[] getRegion(int iCol, int iRow) {
		
		int[] product = new int[this.getPuzzle().length];
		
		int regionSize = (int) Math.sqrt(this.getPuzzle().length);
		
		int rowBase = iRow - (iRow % regionSize);
		int colBase = iCol - (iCol % regionSize);
		
		int counter = 0;

		for (int r = rowBase; r < regionSize + rowBase; r++) {
			for (int c = colBase ; c < regionSize + colBase; c++) {
				product[counter++] = this.getPuzzle()[r][c];
			}
		}
		
		return product;
		
	}
	
	public boolean hasDuplicates() {
		
		for(int[] oned : this.getPuzzle())
			if(super.hasDuplicates(oned))
				return true;
		
		return false;
		
	}
	
	public boolean isPartialSudoku() {
		
		// TODO: Yisi will do this.
		boolean isPartialSudoku = true;
		
		if(super.isLatinSquare())
			isPartialSudoku = true;
		else
			return false;
		
		if(!super.ContainsZero())
			isPartialSudoku = true;
		else 
			return false;

		for(int i = 0; i < super.getLatinSquare().length; i++) {
			for(int a = 0; a < super.getLatinSquare().length; a++) {
				if(super.hasDuplicates(getRegion(i,a)))
					return false;
				else
					isPartialSudoku = true;
			}
		}
		
		return isPartialSudoku;
		
	}
	
	public boolean isSudoku() {
		
		if (isPartialSudoku() && !ContainsZero())
			return true;
		else
			return false;
		
	}
	
	public boolean isValidValue(int iCol, int iRow, int iValue) {

		if (super.hasDuplicates(getRow(iRow)) || super.hasDuplicates(getColumn(iCol)) || super.ContainsZero() == true) {
			return false;
		} else { 
			if(super.doesElementExist(getRow(iRow), iValue) && super.doesElementExist(getColumn(iCol), iValue))
				return true;
		}
		
		return true;
		
	}

	
}
