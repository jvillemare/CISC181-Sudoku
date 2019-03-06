package pkgGame;

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
	
}
