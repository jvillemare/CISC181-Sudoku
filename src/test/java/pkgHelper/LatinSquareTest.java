package pkgHelper;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class LatinSquareTest {

	@Test
	public void test() {
		//fail("Not yet implemented");
	}
	
	@Test
	public void makeLatinSquareTest1() {
		LatinSquare ls = new LatinSquare();
		
		assertEquals(true, ls instanceof Object);
	}
	
	@Test
	public void containsZeroTest1() {
		
		int[][] data1 = {{1, 2}, {3, 4}};
		int[][] data2 = {{5, 6}, {0, 8}};
		
		LatinSquare noZeros  = new LatinSquare(data1);
		LatinSquare hasZeros = new LatinSquare(data2);
		
		assertEquals(false, noZeros.ContainsZero());
		assertEquals(true, hasZeros.ContainsZero());
		
		
	}
	
	@Test
	public void doesElementExistTest1() {
		
		int[] arr1 = {0, 1, 2, 3, 4, 5};
		int iValue = 2;
		
		assertEquals(true, LatinSquare.doesElementExist(arr1, iValue));
		assertEquals(false, LatinSquare.doesElementExist(arr1, 6));
		
	}
	
	@Test
	public void getColumnTest1() {
		
		int[][] latinSquare1 = {{1, 2},{3, 4}};
		int[] col1 = {1, 3};
		
		LatinSquare c = new LatinSquare(latinSquare1);
		
		assertEquals(true, Arrays.equals(col1, c.getColumn(0)));
		
	}
	
	@Test
	public void getLatinSquareTest1() {
		// TODO: Yisi will make this test.
		
		int[][] LS1 = {{1, 2},{3, 4}};
		LatinSquare data3 = new LatinSquare(LS1);
		assertEquals(LS1, data3.getLatinSquare());
		
	}
	
	@Test
	public void getRowTest1() {
		// TODO: Yifan will make this test.
		
		int[][] latinSquare1 = {{1, 2},{3, 4}};
		int[] row1 = {1, 2};
		
		LatinSquare c = new LatinSquare(latinSquare1);
		
		assertEquals(true, Arrays.equals(row1, c.getRow(0)));
	}
	
	@Test
	public void hasAllValuesTest1() {
		
		int[] arr1 = {0, 1, 2, 3};
		int[] arr2 = {3, 2, 1, 0};
		
		int[] arr3 = {1, 2, 3, 4};
		int[] arr4 = {1, 2, 4, 3};
		
		assertEquals(true, LatinSquare.hasAllValues(arr1, arr2));
		assertEquals(true, LatinSquare.hasAllValues(arr3, arr4));
		
	}
	
	@Test
	public void hasAllValuesTest2() {
		
		int[] arr1 = {1, 2};
		int[] arr2 = {2, 3};
		
		assertEquals(false, LatinSquare.hasAllValues(arr1, arr2));
		
	}
	
	@Test
	public void hasDuplicatesTest() {
		
		int[] noDuplicates  = {0, 1, 2, 3, 4, 5, 6, 7};
		int[] hasDuplicates = {0, 1, 2, 3, 3, 4, 5, 6};
		
		assertEquals(false, LatinSquare.hasDuplicates(noDuplicates));
		assertEquals(true,  LatinSquare.hasDuplicates(hasDuplicates));
		
	}
	
	@Test
	public void isLatinSquareTest1() {
		
		int[][] lsa1 = {{1, 2},{2, 2}};
		int[][] lsa2 = {{2, 1},{2, 1}};
		
		LatinSquare ls1 = new LatinSquare(lsa1);
		LatinSquare ls2 = new LatinSquare(lsa2);
		
		assertEquals(false, ls1.isLatinSquare());
		assertEquals(false, ls2.isLatinSquare());
		
	}
	
	@Test
	public void isLatinSquareTest2() {
		
		int[][] lsa3 = {{1, 2},{2, 3}};
		LatinSquare ls3 = new LatinSquare(lsa3);
		assertEquals(false, ls3.isLatinSquare());
		
	}
	
	@Test
	public void isLatinSquareTest3() {
		
		int[][] lsa3 = {{3, 2},{2, 1}};
		LatinSquare ls3 = new LatinSquare(lsa3);
		assertEquals(false, ls3.isLatinSquare());
		
	}
	
	@Test
	public void isLatinSquareTest4() {
		
		int[][] lsa3 = {{1, 2},{2, 1}};
		LatinSquare ls3 = new LatinSquare(lsa3);
		assertEquals(true, ls3.isLatinSquare());
		
	}
	
	@Test
	public void setLatinSquareTest1() {
		// TODO: Yisi will make this test.
		
		int[][] latinSquare1 = {{1, 2},{3, 4}};
		
		LatinSquare c = new LatinSquare();
		
		c.setLatinSquare(latinSquare1);
		
		assertEquals(latinSquare1, c.getLatinSquare());
		
	}

}
