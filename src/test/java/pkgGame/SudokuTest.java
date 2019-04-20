package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

import org.junit.Test;

import javassist.compiler.MemberResolver.Method;
import pkgGame.Sudoku.Cell;

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
		
		Sudoku s = new Sudoku(9);
		
		//assertTrue(...);

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
		// ...
		
		Sudoku.Cell s = new Sudoku(9);
		
		//assertTrue(...);

	}
	
	@Test
	public void Cell_getiRow_Test() throws Exception {
		
		// TODO: Aris will do this...
		
		/*
		Sudoku.Cell s = new Sudoku.Cell(6,7);
		
		assertTrue(s.getiRow() == 6);
		*/
		
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku.Cell");
			Constructor constructor = c.getConstructor(new Class[] { int.class, int.class });
			constructor.setAccessible(true);
			s = (Sudoku.Cell) constructor.newInstance(6, 7);

			Method mgetiRow = c.getiRow();
			
			assertTrue(mgetiRow.invoke() == 6);
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
	public void Cell_getiCol_Test() throws Exception {
		
		// TODO: Aris will do this...
		// ...
		/*
		Sudoku.Cell s = new Sudoku.cell(2,3);
		
		assertTrue(s.getiCol() == 3);
		*/
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku.Cell");
			Constructor constructor = c.getConstructor(new Class[] { int.class, int.class });
			constructor.setAccessible(true);
			s = (Sudoku.Cell) constructor.newInstance(2, 3);

			Method mgetiCol = c.getiCol();
			
			assertTrue(mgetiCol.invoke() == 3);
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
	public void Cell_hashCode_Test() throws Exception {
		
		// TODO: Aris will do this...
		
		/*
		Sudoku.Cell s = new Sudoku.Cell(3,4);

		assertTrue(s.hashCode() == 1058); // 1058 is the hashCode for a Sudoku Cell at 3, 4.
		*/
		
		Sudoku.Cell s1;
		
		try {
			
			Class<?> c = Class.forName("pkgGame.Sudoku.Cell");
			Constructor constructor = c.getConstructor(new Class[] { int.class, int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku.Cell) constructor.newInstance(3, 4);
			java.lang.reflect.Method mHashCode = c.getDeclaredMethod("hashCode", new Class[] {});;
			
			assertTrue((Integer)mHashCode.invoke(s1, null) == 1058);
			
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
		


	}
	
	@Test
	public void Cell_equals_Test() throws Exception {
		
		// TODO: Aris will do this...

		/*
		Sudoku.Cell s1 = new Sudoku.Cell(3,4);
		Sudoku.Cell s2 = new Sudoku.Cell(3,4);
		assertTrue(s1.equals(s2));
		*/
	
		Sudoku.Cell s1;
		Sudoku.Cell s2;
		
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku.Cell");
			Constructor constructor = c.getConstructor(new Class[] { int.class, int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku.Cell) constructor.newInstance(3, 4);
			s2 = (Sudoku.Cell) constructor.newInstance(3, 4);

			java.lang.reflect.Method mequals = c.getDeclaredMethod("equals", new Class[] { int.class });;
			
			assertTrue((Boolean)mequals.invoke(s1, s2));
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
