package pkgHelper;

import static org.junit.Assert.*;

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
		// TODO: Aris will make this test.
	}
	
	@Test
	public void getLatinSquareTest1() {
		// TODO: Yisi will make this test.
	}
	
	@Test
	public void getRowTest1() {
		// TODO: Yifan will make this test.
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
		// TODO: Aris will make this test.
	}
	
	@Test
	public void isLatinSquareTest2() {
		// TODO: Yifan will make this test.
	}
	
	@Test
	public void isLatinSquareTest3() {
		// TODO: Aris will make this test.
	}
	
	@Test
	public void isLatinSquareTest4() {
		// TODO: Yifan will make this test.
	}
	
	@Test
	public void setLatinSquareTest1() {
		// TODO: Yisi will make this test.
	}

}
