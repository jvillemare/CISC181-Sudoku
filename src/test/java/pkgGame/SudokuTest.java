package pkgGame;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import pkgHelper.LatinSquare;

public class SudokuTest {

	@Test
	public void isLatinSquare_Test1() {
		
		// ...
		
		int[][] MySquare = { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };

		LatinSquare LS = new LatinSquare(MySquare);
		
		assertTrue(LS.isLatinSquare());
		
	}
	
	@Test
	public void getPuzzle_Test() {
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void getRegion_TestA1() {
		
		// get valid region
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void getRegion_TestA2() {
		
		// get invalid region
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void getRegion_TestB1() {
		
		// get valid region
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void getRegion_TestB2() {
		
		// get invalid region
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void hasDuplicates_Test1() {
		
		// has no duplicates
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void hasDuplicates_Test2() {
		
		// has duplicates
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isPartialSudoku_Test1() {
		
		// has no duplicates
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isPartialSudoku_Test2() {
		
		// has no duplicates
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isPartialSudoku_Test3() {
		
		// has no duplicates
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isPartialSudoku_Test4() {
		
		// has no duplicates
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isSudoku_Test1() {
		
		// partial sudoku but does contain zeros
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isSudoku_Test2() {
		
		// partial sudoku but does NOT contain zeros
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isSudoku_Test3() {
		
		// neither partial sudoku nor contains zeros.
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isValidValue_Test1() {
		
		// NOT a valid value
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	@Test
	public void isValidValue_Test2() {
		
		// IS a valid value
		
		int[][] puzzle = {
			{5, 3, 4, 6, 7, 8, 9, 1, 2}, 
		    {6, 7, 2, 1, 9, 5, 3, 4, 8},
		    {1, 9, 8, 3, 4, 2, 5, 6, 7},
		        
		    {8, 5, 9, 7, 6, 1, 4, 2, 3},
		    {4, 2, 6, 8, 5, 3, 7, 9, 1},
		    {7, 1, 3, 9, 2, 4, 8, 5, 6},
		        
		    {9, 6, 1, 5, 3, 7, 2, 8, 4},
		    {2, 8, 7, 4, 1, 9, 6, 3, 5},
		    {3, 4, 5, 2, 8, 6, 1, 7, 9}
		};
		
		Sudoku s = new Sudoku(puzzle);
		
		assertArrayEquals(puzzle, s.getPuzzle());
		
	}
	
	
	
	
	
}
