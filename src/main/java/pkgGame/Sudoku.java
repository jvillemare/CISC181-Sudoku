package pkgGame;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Random;

import pkgHelper.LatinSquare;

/**
 * Sudoku - This class extends LatinSquare, adding methods, constructor to
 * handle Sudoku logic
 * 
 * @version 1.2
 * @since Lab #2
 * @author Bert.Gibbons
 *
 */
public class Sudoku extends LatinSquare {
	
	private HashMap cells;

	/**
	 * 
	 * iSize - the length of the width/height of the Sudoku puzzle.
	 * 
	 * @version 1.2
	 * @since Lab #2
	 */
	private int iSize;

	/**
	 * iSqrtSize - SquareRoot of the iSize. If the iSize is 9, iSqrtSize will be
	 * calculated as 3
	 * 
	 * @version 1.2
	 * @since Lab #2
	 */

	private int iSqrtSize;

	/**
	 * Sudoku - for Lab #2... do the following:
	 * 
	 * set iSize If SquareRoot(iSize) is an integer, set iSqrtSize, otherwise throw
	 * exception
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @param iSize-
	 *            length of the width/height of the puzzle
	 * @throws Exception
	 *             if the iSize given doesn't have a whole number square root
	 */
	public Sudoku(int iSize) throws Exception {

		this.iSize = iSize;

		double SQRT = Math.sqrt(iSize);
		if ((SQRT == Math.floor(SQRT)) && !Double.isInfinite(SQRT)) {
			this.iSqrtSize = (int) SQRT;
		} else {
			throw new Exception("Invalid size");
		}

		int[][] puzzle = new int[iSize][iSize];
		super.setLatinSquare(puzzle);
		FillDiagonalRegions();
		
		// TODO: Add the SetCells() and fillRemaining methods to the Sudoku constructor
		
	}

	/**
	 * Sudoku - pass in a given two-dimensional array puzzle, create an instance.
	 * Set iSize and iSqrtSize
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @param puzzle
	 *            - given (working) Sudoku puzzle. Use for testing
	 * @throws Exception
	 *             will be thrown if the length of the puzzle do not have a whole
	 *             number square root
	 */
	public Sudoku(int[][] puzzle) throws Exception {
		
		super(puzzle);
		this.iSize = puzzle.length;
		double SQRT = Math.sqrt(iSize);
		
		if ((SQRT == Math.floor(SQRT)) && !Double.isInfinite(SQRT)) {
			this.iSqrtSize = (int) SQRT;
		} else {
			throw new Exception("Invalid size");
		}

	}
	
	// =========================== NEW METHODS =========================== 
	
	/**
	 * overload isValidValue, call by Cell.
	 * 
	 * @since Lab #4
	 * 
	 * @param c
	 * @param iValue
	 * @return ...
	 */
	public boolean isValidValue​(Sudoku.Cell c, int iValue) {
		
		Cell a = (Cell) this.cells.get(c.hashCode());
		return a.getValidValues().contains(iValue);
		
	}
	
	/**
	 * getAllCellNumbers - This method will return all the valid values 
	 * remaining for a given cell (by col/row). 
	 * 
	 * For example, Cell [0,0] should return [3,4] 
	 * 
	 * 0 1 0 0
	 * 2 0 0 4 
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * 
	 * @param iCol	given column
	 * @param iRow	given row
	 * @since Lab #4
	 * @return
	 */
	private java.util.HashSet<java.lang.Integer> getAllValidCellValues​(int iCol, int iRow) {
		
		// TODO: Convert between HashSet and ArrayList
		//Cell a = (Cell) this.cells.get(c.hashCode());
		//return a.getValidValues();
		return null;
		
	}
	
	/**
	 * SetCells - purpose of this method is to create a HashMap of all the 
	 * cells in the puzzle. 
	 * 
	 * If the puzzle is 9X9, there will be 81 cells in the puzzle. 
	 * 
	 * The key for the HashMap is the Cell's hash code 
	 * The value for the HashMap is the Cell. 
	 * The values in the HashSet for each cell's valid values should be shuffled
	 * 
	 * @since Lab #4
	 */
	private void setCells() {
		
		// TODO: ...
		
	}
	
	/**
	 * fillRemaining - Recursive method to fill each cell... one by one... 
	 * backtracking if the given value doesn't fit in the cell.
	 * 
	 * @since Lab #4
	 * 
	 * @param c		Cell that you're trying to fill
	 * @return ...
	 * @see <a href="https://www.geeksforgeeks.org/program-sudoku-generator/">
	 * https://www.geeksforgeeks.org/program-sudoku-generator/</a>
	 */
	private boolean fillRemaining​(Sudoku.Cell c) {
		
		// TODO: ...
		
		return false;
		
	}
	
	// =========================== EXISTING METHODS =========================== 

	/**
	 * getPuzzle - return the Sudoku puzzle
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @return - returns the LatinSquare instance
	 */
	public int[][] getPuzzle() {
		return super.getLatinSquare();
	}

	/**
	 * getRegionNbr - Return region number based on given column and row
	 * 
	 * 
	 * Example, the following Puzzle:
	 * 
	 * 0 1 2 3 <br>
	 * 1 2 3 4 <br>
	 * 3 4 1 2 <br>
	 * 4 1 3 2 <br>
	 * 
	 * getRegionNbr(3,0) should return a value of 1
	 * 
	 * @param iCol - Given column number
	 * @param iRow - Given row number
	 * @version 1.3
	 * @since Lab #3
	 * 
	 * @return - return region number based on given column and row
	 */
	public int getRegionNbr(int iCol, int iRow) {

		int i = (iCol / iSqrtSize) + ((iRow / iSqrtSize) * iSqrtSize);

		return i;
	}

	/**
	 * getRegion - figure out what region you're in based on iCol and iRow and call
	 * getRegion(int)<br>
	 * 
	 * Example, the following Puzzle:
	 * 
	 * 0 1 2 3 <br>
	 * 1 2 3 4 <br>
	 * 3 4 1 2 <br>
	 * 4 1 3 2 <br>
	 * 
	 * getRegion(0,3) would call getRegion(1) and return [2],[3],[3],[4]
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @param iCol
	 *            given column
	 * @param iRow
	 *            given row
	 * @return - returns a one-dimensional array from a given region of the puzzle
	 */
	public int[] getRegion(int iCol, int iRow) {

		int i = (iCol / iSqrtSize) + ((iRow / iSqrtSize) * iSqrtSize);

		return getRegion(i);
	}

	/**
	 * getRegion - pass in a given region, get back a one-dimensional array of the
	 * region's content<br>
	 * 
	 * Example, the following Puzzle:
	 * 
	 * 0 1 2 3 <br>
	 * 1 2 3 4 <br>
	 * 3 4 1 2 <br>
	 * 4 1 3 2 <br>
	 * 
	 * getRegion(2) and return [3],[4],[4],[1]
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @param r
	 *            given region
	 * @return - returns a one-dimensional array from a given region of the puzzle
	 */
	public int[] getRegion(int r) {

		int[] reg = new int[super.getLatinSquare().length];

		int i = (r % iSqrtSize) * iSqrtSize;
		int j = (r / iSqrtSize) * iSqrtSize;
		int iMax = i + iSqrtSize;
		int jMax = j + iSqrtSize;
		int iCnt = 0;

		for (; j < jMax; j++) {
			for (i = (r % iSqrtSize) * iSqrtSize; i < iMax; i++) {
				reg[iCnt++] = super.getLatinSquare()[j][i];
			}
		}

		return reg;
	}

	/**
	 * isPartialSudoku - return 'true' if...
	 * 
	 * It's a LatinSquare If each region doesn't have duplicates If each element in
	 * the first row of the puzzle is in each region of the puzzle At least one of
	 * the elemnts is a zero
	 * 
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @return true if the given puzzle is a partial sudoku
	 */
	public boolean isPartialSudoku() {

		if (!super.isLatinSquare()) {
			return false;
		}

		for (int k = 0; k < this.getPuzzle().length; k++) {

			if (super.hasDuplicates(getRegion(k))) {
				return false;
			}

			if (!hasAllValues(getRow(0), getRegion(k))) {
				return false;
			}
		}

		if (ContainsZero()) {
			return false;
		}

		return true;

	}

	/**
	 * isSudoku - return 'true' if...
	 * 
	 * Is a partialSudoku Each element doesn't a zero
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @return - returns 'true' if it's a partialSudoku, element match (row versus
	 *         column) and no zeros
	 */
	public boolean isSudoku() {

		if (!isPartialSudoku()) {
			return false;
		}

		if (ContainsZero()) {
			return false;
		}

		return true;
	}

	/**
	 * isValidValue - test to see if a given value would 'work' for a given column /
	 * row
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @param iCol
	 *            puzzle column
	 * @param iRow
	 *            puzzle row
	 * @param iValue
	 *            given value
	 * @return - returns 'true' if the proposed value is valid for the row and column
	 */
	public boolean isValidValue(int iRow, int iCol, int iValue) {
		
		if (doesElementExist(super.getRow(iRow),iValue))
		{
			return false;
		}
		if (doesElementExist(super.getColumn(iCol),iValue))
		{
			return false;
		}
		if (doesElementExist(this.getRegion(iCol, iRow),iValue))
		{
			return false;
		}
		
		return true;
	}

	/**
	 * PrintPuzzle This method will print the puzzle to the console (space between
	 * columns, line break after row)
	 * 
	 * @version 1.3
	 * @since Lab #3
	 */
	public void PrintPuzzle() {
		for (int i = 0; i < this.getPuzzle().length; i++) {
			System.out.println("");
			for (int j = 0; j < this.getPuzzle().length; j++) {
				System.out.print(this.getPuzzle()[i][j]);
				if ((j + 1) % iSqrtSize == 0)
					System.out.print(" ");
			}
			if ((i + 1) % iSqrtSize == 0)
				System.out.println(" ");

		}
		System.out.println("");
	}

	/**
	 * FillDiagonalRegions - After the puzzle is created, set the diagonal regions
	 * with random values
	 * 
	 * @version 1.3
	 * @since Lab #3
	 */
	private void FillDiagonalRegions() {

		for (int i = 0; i < iSize; i = i + iSqrtSize) {
			System.out.println("Filling region: " + getRegionNbr(i, i));
			SetRegion(getRegionNbr(i, i));
			ShuffleRegion(getRegionNbr(i, i));
		}
	}

	/**
	 * SetRegion - purpose of this method is to set the values of a given region
	 * (they will be shuffled later)
	 * 
	 * Example, the following Puzzle start state:
	 * 
	 * 0 0 0 0 <br>
	 * 0 0 0 0 <br>
	 * 0 0 0 0 <br>
	 * 0 0 0 0 <br>
	 * 
	 * SetRegion(2) would transform the Puzzle to:<br>
	 * 
	 * 0 0 0 0 <br>
	 * 0 0 0 0 <br>
	 * 1 2 0 0 <br>
	 * 3 4 0 0 <br>
	 * 
	 * @version 1.3
	 * @since Lab #3
	 * @param r
	 *            - Given region number
	 */
	private void SetRegion(int r) {
		int iValue = 0;

		iValue = 1;
		for (int i = (r / iSqrtSize) * iSqrtSize; i < ((r / iSqrtSize) * iSqrtSize) + iSqrtSize; i++) {
			for (int j = (r % iSqrtSize) * iSqrtSize; j < ((r % iSqrtSize) * iSqrtSize) + iSqrtSize; j++) {
				this.getPuzzle()[i][j] = iValue++;
			}
		}
	}

	/**
	 * SetRegion - purpose of this method is to set the values of a given region
	 * (they will be shuffled later)
	 * 
	 * Example, the following Puzzle start state:
	 * 
	 * 1 2 0 0 <br>
	 * 3 4 0 0 <br>
	 * 0 0 0 0 <br>
	 * 0 0 0 0 <br>
	 * 
	 * ShuffleRegion(0) might transform the Puzzle to:<br>
	 * 
	 * 2 3 0 0 <br>
	 * 1 4 0 0 <br>
	 * 0 0 0 0 <br>
	 * 0 0 0 0 <br>
	 * 
	 * @version 1.3
	 * @since Lab #3
	 * @param r
	 *            - Given region number
	 */
	private void ShuffleRegion(int r) {
		int[] region = getRegion(r);
		shuffleArray(region);
		int iCnt = 0;
		for (int i = (r / iSqrtSize) * iSqrtSize; i < ((r / iSqrtSize) * iSqrtSize) + iSqrtSize; i++) {
			for (int j = (r % iSqrtSize) * iSqrtSize; j < ((r % iSqrtSize) * iSqrtSize) + iSqrtSize; j++) {
				this.getPuzzle()[i][j] = region[iCnt++];
			}
		}
	}

	/**
	 * shuffleArray this method will shuffle a given one-dimension array
	 * 
	 * @version 1.3
	 * @since Lab #3
	 * @param ar
	 *            given one-dimension array
	 */
	private void shuffleArray(int[] ar) {

		Random rand = new SecureRandom();
		for (int i = ar.length - 1; i > 0; i--) {
			int index = rand.nextInt(i + 1);
			// Simple swap
			int a = ar[index];
			ar[index] = ar[i];
			ar[i] = a;
		}
		
	}
	
	private class Cell {

		private int iRow, iCol;
		private java.util.ArrayList<java.lang.Integer> validValues;
		
		Cell(int iRow, int iCol) {
			this.iRow = iRow;
			this.iCol = iCol;
		}
		
		/**
		 * get the row of the cell.
		 * 
		 * @return
		 */
		@SuppressWarnings("unused")
		public int getiRow() { return this.iRow; }
		
		/**
		 * get the column of the cell.
		 * 
		 * @return
		 */
		@SuppressWarnings("unused")
		public int getiCol() { return this.iCol; }
		
		/**
		 * set hashcode to Objects.hash(iRow, iCol)
		 * 
		 * @return integer representation of hashCode.
		 */
		@Override
		public int hashCode() { return Objects.hash(iRow, iCol); }
		
		/**
		 * override to ensure object is equal by Row/Col.
		 * 
		 * @return true if they equal, false if not.
		 */
		public boolean equals(java.lang.Object o) {
			
			Cell c = (Cell) o;
			return c.getiRow() == this.iRow && c.getiCol() == this.iCol;	
			
		}
		
		/**
		 * get the ArrayList of valid values.
		 * 
		 * @return ...
		 */
		@SuppressWarnings("unused")
		public ArrayList<Integer> getValidValues() { return this.validValues; }
		
		/**
		 * set the ArrayList of validValues.  
		 * 
		 * You can’t (easily) shuffle a HashSet.
		 * 
		 * @param hsValidValues
		 */
		@SuppressWarnings("unused")
		public void setValidValues​(java.util.HashSet<java.lang.Integer> hsValidValues) { 
			
			this.validValues.clear();
			this.validValues.addAll(hsValidValues);
			
		}
		
		/**
		 * Shuffle the validValues using Collections class.
		 */
		@SuppressWarnings("unused")
		public void shuffleValidValues() { Collections.shuffle(this.validValues); }
		
		/**
		 * This method will find the next valid value’s location in the puzzle, 
		 * and return it in Cell form.
		 * 
		 * 	If the puzzle is 9X9
		 *		Passed Cell Value [Row, Col]	Returned Cell Value [Row, Col]
		 *		[0,0]							[0,1]
		 *		[0,8]							[1,1]
		 *		[1,8]							[1,2]
		 *		[8,8]							Null (return null if you’re at the end of the puzzle
		 * 
		 * @param c 		a cell object
		 * @param iSize 	...
		 * @return cell 	object if it exists, 'null' if not.
		 */
		@SuppressWarnings("unused")
		public Sudoku.Cell getNextCell​(Sudoku.Cell c, int iSize) {
			
			// TODO: Verify this is actually what Bert wants.
			return new Cell((this.iRow % iSize) * iSize, (this.iRow / iSize) * iSize);
			
		}
			
	}
	
}


