package pkgGame;

import static org.junit.Assert.*;



import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

import org.apache.poi.ss.usermodel.Cell;
import org.junit.Test;

public class SudokuTest {

	// =========================== NEW METHODS =========================== 
	
	@Test
	public void isValidValue_Test1() {
		
		// TODO: Yisi will do this...
		// test with a valid value
		
		Sudoku s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void isValidValue_Test2() throws Exception {
		
		// TODO: Yisi will do this...
		// test with a NON-valid value
		
		Sudoku s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void getAllValidCellValues_Test() throws Exception {
		
		// TODO: Paul will do this...
		// simply pass an incomplete Sudoku puzzle
		// check Bert's Word doc for an incomplete puzzle.
		
		//Sudoku s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void setCells_Test() throws Exception {
		
		// TODO: Yifan will do this...
		// make sure there are Cell objects in Sudoku HashMap
		
		/*
		Sudoku s1 = new Sudoku(9);
		s1.setCells();
		
		HashMap<Integer, Sudoku.Cell> hm = 
				new HashMap<Integer, Sudoku.Cell>();
		
		for(int row = 0; row < 10; row++)
			for(int col = 0; col < 10; col++)
				hm.put(
						(new Sudoku.Cell(row, col)).hashCode(), // key
						new Sudoku.Cell(row, col)
				);
		
		boolean cellsAreEquivalent = true;
		
		Collection<Sudoku.Cell> sudokuHashMapValues = s1.cells.values();
		
		ArrayList<Sudoku.Cell> sudokuCells =
				new ArrayList<Sudoku.Cell>(sudokuHashMapValues);
		
		Collection<Sudoku.Cell> ourCellValues = hm.values();
		
		ArrayList<Sudoku.Cell> ourCells =
				new ArrayList<Sudoku.Cell>(ourCellValues);
		
		for(int i = 0; ourCells.size(); i++)
			if(!sudokuCells.get(i).equals(ourCells.get(i)))
				cellsAreEquivalent = false;
		
		assertTrue(cellsAreEquivalent);
		*/
		
		Sudoku s1 = null;
		Sudoku.Cell s2 = null;
		
		try {
			
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(9);
			
			//s1.setCells();
			Method mSetCells = c.getDeclaredMethod("setCells", new Class[] {});
			mSetCells.invoke(s1, null);
			
			// note: based on stackoverflow.com/a/14112345/11228720
			Constructor<Cell> constructor2 = 
					Sudoku.Cell.class.getDeclaredConstructor(Sudoku.class);
			constructor2.setAccessible(true);
			
			HashMap<Integer, Sudoku.Cell.class> hm = 
					new HashMap<Integer, Sudoku.Cell.class>();
			
			for(int row = 0; row < 10; row++)
				for(int col = 0; col < 10; col++)
					hm.put(
							(new Sudoku.Cell.class(row, col)).hashCode(), // key
							(Sudoku.Cell.class) new constructor2.newInstance(row, col)
					);
			
			Collection<Sudoku.Cell.class()> sudokuHashMapValues = s1.cells.values();
			
			ArrayList<Sudoku.Cell.class()> sudokuCells =
					new ArrayList<Sudoku.Cell>(sudokuHashMapValues);
			
			Collection<Sudoku.Cell> ourCellValues = hm.values();
			
			ArrayList<Sudoku.Cell> ourCells =
					new ArrayList<Sudoku.Cell>(ourCellValues);
			
			for(int i = 0; ourCells.size(); i++)
				if(!sudokuCells.get(i).equals(ourCells.get(i)))
					cellsAreEquivalent = false;
			
			assertTrue(cellsAreEquivalent);
			
			

		} catch (ClassNotFoundException e1) {
			fail("ClassNotFoundException");
		} catch (NoSuchMethodException e) {
			fail("NoSuchMethodException");
		} catch (SecurityException e) {

			fail("SecurityException");
		} catch (InstantiationException e) {
			fail("InstantiationException");
		} catch (IllegalAccessException e) {
			fail("IllegalAccessException");
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (InvocationTargetException e) {
			fail("InvocationTargetException, Invalid size");
		}

	}
	
	@Test
	public void fillRemaining_Test() throws Exception {
		
		// TODO: Paul will do this...
		// pass incomplete Sudoku puzzle and check to make sure it filled
		// the Cells HashMap.
		
		Sudoku s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_Test() throws Exception {
		
		// TODO: Yifan will do this...
		
		Sudoku s = new Sudoku(9);
		
		Object inner;
		
		try {
			
			Constructor<Cell> c = 
					Sudoku.Cell.class.getDeclaredConstructor(Sudoku.class);
			
			c.setAccessible(true);
			
			try {
				
				inner = c.newInstance(s);
				
			}
			
			
		}
		
		assertTrue( (Sudoku.Cell)inner instanceof Sudoku.Cell );

	}
	
	@Test
	public void Cell_getiRow_Test() throws Exception {
		
		// TODO: Yisi will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_getiCol_Test() throws Exception {
		
		// TODO: Yisi will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_hashCode_Test() throws Exception {
		
		// TODO: Yisi will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_equals_Test() throws Exception {
		
		// TODO: Yisi will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_getValidValues_Test() throws Exception {
		
		// TODO: Yisi will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_setValidValues_Test() throws Exception {
		
		// TODO: Paul will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_shuffleValidValues_Test() throws Exception {
		
		// TODO: Paul will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_getNextCell_Test() throws Exception {
		
		// TODO: Paul will do this...
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	
	
	
	
	
	
	
	// =========================== EXISTING METHODS ============================
	
	private void PrintStars() {
		for (int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
	}

	@Test
	public void Sudoku_Test1() {

		try {
			Sudoku s1 = new Sudoku(9);
		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test(expected = Exception.class)
	public void Sudoku_Test2() throws Exception {

		Sudoku s1 = new Sudoku(10);

	}

	@Test
	public void getRegion_Test1() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 3, 4, 1, 2 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region 0 = 1 2 3 4
		// region 1 = 3 4 1 2

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(1);
			System.out.println(Arrays.toString(region));
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void getRegion_Test2() {

		int[][] puzzle = { { 1, 2, 3, 4 }, { 3, 4, 1, 2 }, { 2, 1, 4, 3 }, { 4, 3, 2, 1 } };
		int[] ExpectedRegion = { 2, 1, 4, 3 };

		//
		// 1 2 3 4
		// 3 4 1 2
		// 2 1 4 3
		// 4 3 2 1
		//
		// region at 0,2 = 2 1 4 3

		int[] region;
		try {
			Sudoku s1 = new Sudoku(puzzle);

			region = s1.getRegion(0, 2);
			System.out.println(Arrays.toString(region));
			assertTrue(Arrays.equals(ExpectedRegion, region));

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void Sudoku_test1() {
		int[][] puzzle = { { 5, 3, 4, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertTrue(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}

	@Test
	public void Sudoku_test2() {
		int[][] puzzle = { { 5, 5, 5, 6, 7, 8, 9, 1, 2 }, { 6, 7, 2, 1, 9, 5, 3, 4, 8 }, { 1, 9, 8, 3, 4, 2, 5, 6, 7 },
				{ 8, 5, 9, 7, 6, 1, 4, 2, 3 }, { 4, 2, 6, 8, 5, 3, 7, 9, 1 }, { 7, 1, 3, 9, 2, 4, 8, 5, 6 },
				{ 9, 6, 1, 5, 3, 7, 2, 8, 4 }, { 2, 8, 7, 4, 1, 9, 6, 3, 5 }, { 3, 4, 5, 2, 8, 6, 1, 7, 9 } };

		try {
			Sudoku s1 = new Sudoku(puzzle);
			assertFalse(s1.isSudoku());

		} catch (Exception e) {
			fail("Test failed to build a Sudoku");
		}

	}





}
