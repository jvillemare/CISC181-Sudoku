package pkgGame;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.HashMap;

import org.junit.Test;

import pkgEnum.eGameDifficulty;

public class SudokuPrivateMethodsTest {

	private void PrintStars() {
		for (int i = 0; i < 50; i++)
			System.out.print("*");
		System.out.println();
	}
	
	@Test
	public void isDifficultyMet_Test1() throws NoSuchMethodException, InvocationTargetException {
		
		// expecting true, difficulty should easily be met
		
		Sudoku s1 = null;
		int iPuzzleSize = 9;
		boolean iExpectedMet = true;
		
		boolean iActualMet;

		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class, eGameDifficulty.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(iPuzzleSize, eGameDifficulty.EASY);

			Method misDifficultyMet = c.getDeclaredMethod("isDifficultyMet", new Class[] { int.class });

			misDifficultyMet.setAccessible(true);
			iActualMet = (boolean)misDifficultyMet.invoke(s1, 9000);

			assertTrue(iExpectedMet == iActualMet);

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
			throw e;
			//fail("InvocationTargetException, Invalid size");
		}
		
	}
	
	@Test
	public void isDifficultyMet_Test2() throws NoSuchMethodException, InvocationTargetException {
		
		// expecting false, difficulty should easily be met
		
		Sudoku s1 = null;
		int iPuzzleSize = 9;
		boolean iExpectedMet = false;
		
		boolean iActualMet;

		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class, eGameDifficulty.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(iPuzzleSize, eGameDifficulty.HARD);

			Method misDifficultyMet = c.getDeclaredMethod("isDifficultyMet", new Class[] { int.class });

			misDifficultyMet.setAccessible(true);
			iActualMet = (boolean)misDifficultyMet.invoke(s1, 1);

			assertTrue(iExpectedMet == iActualMet);

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
			throw e;
			//fail("InvocationTargetException, Invalid size");
		}
		
	}

	public void possibleValuesMultiplier_Test() throws Exception{

		
		// (easy comes from the enum we defined in this lab)
		// ... new Sudoku(9, EASY)
		
		// use junit inflections to invoke possibleValues...
		
		// justify in comments 
		
		// assertTrue(possibleValues < 500) for easy because easy is less than 500
		
		Sudoku s = new Sudoku(9, eGameDifficulty.EASY);
		
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class });
			constructor.setAccessible(true);

			Method mPossibleValuesMultiplier = c.getDeclaredMethod("possibleValuesMultiplier");
			mPossibleValuesMultiplier.setAccessible(true);
			System.out.println(mPossibleValuesMultiplier.invoke(s));
			int possibleValues = (int) mPossibleValuesMultiplier.invoke(s);
			assertTrue(possibleValues < 500);
			

		} catch (ClassNotFoundException e1) {
			fail("ClassNotFoundException");
		} catch (NoSuchMethodException e) {
			fail("NoSuchMethodException");
		} catch (SecurityException e) {
			fail("SecurityException");
		} catch (IllegalAccessException e) {
			fail("IllegalAccessException");
		} catch (IllegalArgumentException e) {
			fail("IllegalArgumentException");
		} catch (InvocationTargetException e) {
			fail("InvocationTargetException, Invalid size");
		}
		
	}

	@Test
	public void Sudoku_Test_SetRegion() {

		Sudoku s1 = null;
		int iPuzzleSize = 9;
		int[] iExpectedRegion = new int[iPuzzleSize];
		for (int i = 0; i < iPuzzleSize; i++) {
			iExpectedRegion[i] = i + 1;
		}
		int[] iActualRegion;

		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(iPuzzleSize);

			Method mSetRegion = c.getDeclaredMethod("SetRegion", new Class[] { int.class });

			PrintStars();
			System.out.println("Testing method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			System.out.println("Original Puzzle:");
			s1.PrintPuzzle();
			System.out.println("Original Region 0:");
			System.out.println(Arrays.toString(s1.getRegion(0)));

			System.out.println("Set Puzzle:");
			mSetRegion.setAccessible(true);
			mSetRegion.invoke(s1, 0);
			iActualRegion = s1.getRegion(0);

			s1.PrintPuzzle();
			System.out.println(Arrays.toString(s1.getRegion(0)));

			assertTrue(Arrays.equals(iExpectedRegion, iActualRegion));

			PrintStars();

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

		PrintStars();

	}

	@Test
	public void FillDiagonalRegions() {
		
		Sudoku s1 = null;
		int iPuzzleSize = 9;
		
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] { int.class });
			constructor.setAccessible(true);
			s1 = (Sudoku) constructor.newInstance(iPuzzleSize);

			Method mFillDiagonalRegions = c.getDeclaredMethod("FillDiagonalRegions", null);

			PrintStars();
			System.out.println("Testing method: " + Thread.currentThread().getStackTrace()[1].getMethodName());
			System.out.println("Original Puzzle:");
			s1.PrintPuzzle();
			System.out.println("Original Region 0:");
			System.out.println(Arrays.toString(s1.getRegion(0)));

			System.out.println("Set Puzzle:");
			mFillDiagonalRegions.setAccessible(true);
			mFillDiagonalRegions.invoke(s1, null);

			s1.PrintPuzzle();
			System.out.println(Arrays.toString(s1.getRegion(0)));

			PrintStars();

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
	public void Sudoku_RemoveCells() throws NoSuchFieldException{
		
		Sudoku s = null;
				
		try {
			Class<?> c = Class.forName("pkgGame.Sudoku");
			Constructor constructor = c.getConstructor(new Class[] {int.class});
			constructor.setAccessible(true);
			s = (Sudoku) constructor.newInstance(9);

			Method mRemoveCells = c.getDeclaredMethod("removeCells", new Class[] {});
			
			mRemoveCells.invoke(s, null);
			
			Field cellsField = Sudoku.class.getDeclaredField("cells");
			cellsField.setAccessible(true);
			
			HashMap<Integer, Object> cells = (HashMap<Integer, Object>) cellsField.get(s);
			
			assertTrue(cells.size() < 81);
			// for bert: we expect after calling removeCells to be missing
			// a few cells. not standard, but technically works.

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
