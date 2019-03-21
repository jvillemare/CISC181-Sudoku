package pkgGame;

import pkgEnum.ePuzzleViolation;
import pkgHelper.LatinSquare;
import pkgHelper.PuzzleViolation;

import java.util.Random;

import java.util.Random;

import java.util.Random;

import java.util.Random;

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
		
		if ((SQRT == Math.floor(SQRT)) && !Double.isInfinite(SQRT))
			this.iSqrtSize = (int) SQRT;
		else
			throw new Exception("Invalid size");
		
	}

	/**
	 * Sudoku - pass in a given two-dimensional array puzzle, create an instance.
	 * Set iSize and iSqrtSize
	 * 
	 * @version 1.2
	 * @since Lab #2
	 * @param puzzle
	 *            - given (working) Sudoku puzzle. Use for testing
	 * @throws Exception will be thrown if the length of the puzzle do not have a whole number square root
	 */
	public Sudoku(int[][] puzzle) throws Exception {
		
		super(puzzle);
		
		this.iSize = puzzle.length;
		double SQRT = Math.sqrt(iSize);
		
		if ((SQRT == Math.floor(SQRT)) && !Double.isInfinite(SQRT))
			this.iSqrtSize = (int) SQRT;
		else
			throw new Exception("Invalid size");

	}
	
	// =========== NEW FUNCTIONS TO WRITE ===========
	
	/**
	 * Return region number based on given column and 
	 * row Example, the following Puzzle: 
	 * 0 1 2 3 
	 * 1 2 3 4 
	 * 3 4 1 2 
	 * 4 1 3 2 
	 * getRegionNumber(3,0) should return a value of 1
	 * 
	 * @param iCol
	 * @param iRow
	 * 
	 * @return
	 */
	public int getRegionNumber(int iCol, int iRow) {
		
		// professor note: easy
		// TODO: Yifang will do this.
		
		// hint: see first part of getRegion(int r)
		
		return 0; // << replace this
		
	}
	
	/**
	 * This method will print the puzzle to the 
	 * console (space between columns, line break after row.)
	 */
	public void printPuzzle() {
		
		// professor note: easy
		// TODO: Yifang will do this.
		
		// hint: use a double-nested for-loop and a print statement
		
	}
	
	/**
	 * After the puzzle is created, set the diagonal 
	 * regions with random values.
	 */
	private void fillDiagonalRegions() {
		
		// professor note: very, very hard
		// TODO: James will do this.
		
	}
	
	/**
	 * purpose of this method is to set the values 
	 * of a given region (they will be shuffled later) 
	 * 
	 * Example, the following Puzzle start state: 
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * SetRegion(2) would transform the Puzzle to:
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * 1 2 0 0 
	 * 3 4 0 0 
	 * 
	 * @param r
	 */
	private void setRegion(int r) {
		
		// professor note: medium
		// TODO: Aris will do this.
		
		// hint: you will have to use JUnit reflections in order
		//		 to access this private procedure.
		
		// hint: this procedure will be incredibly
		//       similar to the structure of getRegion(int r)
		
	}
	
	/**
	 * purpose of this method is to set the values of a 
	 * given region (they will be shuffled later) 
	 * 
	 * Example, the following Puzzle start state: 
	 * 1 2 0 0 
	 * 3 4 0 0 
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * ShuffleRegion(0) might transform the Puzzle to:
	 * 2 3 0 0 
	 * 1 4 0 0 
	 * 0 0 0 0 
	 * 0 0 0 0 
	 * 
	 * @param r
	 */
	private void shuffleRegion(int r) {
		
		// professor note: easy/medium
		// TODO: Aris will do this.
		
		// hint: you will have to use JUnit reflections in order
		//		 to access this private procedure.
		
		// hint: this procedure will be incredibly
		//       similar to the structure of getRegion(int r)
		
		// hint: use the shuffleArray method, assuming it has
		//       been implemented.
		
	}
	
	/**
	 * this method will shuffle a given one-dimension array.
	 * 
	 * @param ar
	 */
	private void shuffleArray(int[] ar) {
		
		
		// professor note: easy
		// TODO: Yisi will do this.
		
		// hint: you will have to use JUnit reflections in order
		//		 to access this private procedure.
		
		// hint: use java.util.Random and a single for loop.
		
		// test
		int number1, temp;
		Random random = new Random();
		for (int i = ar.length-1; 1>0;i--) {
			number1 = random.nextInt(i+1);
			temp = ar[number1];
			ar[number1] = ar[i];
			ar[i] = temp;
		}
	}
			
			
		
		
	
	
	// =========== OLD EXISTING FUNCTIONS ===========

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

		int i = (r / iSqrtSize) * iSqrtSize;
		int j = (r % iSqrtSize) * iSqrtSize;		
		int jMax = j + iSqrtSize;
		int iMax = i + iSqrtSize;
		int iCnt = 0;

		for (; i < iMax; i++) {
			for (j = (r % iSqrtSize) * iSqrtSize; j < jMax; j++)
				reg[iCnt++] = super.getLatinSquare()[i][j];
		}

		return reg;
		
	}
	
	@Override
	public boolean hasDuplicates() {
		
		if (super.hasDuplicates())
			return true;
		
		for (int k = 0; k < this.getPuzzle().length; k++) {
			if (super.hasDuplicates(getRegion(k)))
				super.AddPuzzleViolation(new PuzzleViolation(ePuzzleViolation.DupRegion,k));
		}
	
		return (super.getPV().size() > 0);
		
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

		super.setbIgnoreZero(true);
		
		super.ClearPuzzleViolation();
		
		if (hasDuplicates())
			return false;

		if (!ContainsZero()) {
			super.AddPuzzleViolation(new PuzzleViolation(ePuzzleViolation.MissingZero, -1));
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
	 * @return - returns 'true' if it's a partialSudoku, element match (row versus column) and no zeros
	 */
	public boolean isSudoku() {

		this.setbIgnoreZero(false);
		
		super.ClearPuzzleViolation();
		
		if (hasDuplicates())
			return false;
		
		if (!super.isLatinSquare())
			return false;
		
		for (int i = 1; i < super.getLatinSquare().length; i++) {

			if (!hasAllValues(getRow(0), getRegion(i))) {
				return false;
			}
		}

		if (ContainsZero())
			return false;

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
	public boolean isValidValue(int iCol, int iRow, int iValue) {
		
		if (doesElementExist(super.getRow(iRow),iValue)) {
			return false;
		}
		
		if (doesElementExist(super.getColumn(iCol),iValue)) {
			return false;
		}
		
		if (doesElementExist(this.getRegion(iCol, iRow),iValue)) {
			return false;
		}
		
		return true;
		
	}
	
}
