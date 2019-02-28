package pkgHelper;

public class LatinSquare {

	private int[][] LatinSquare;
	
	public LatinSquare() {
		// "don't do anything in the constructor"
	}
	
	public LatinSquare(int[][] puzzle) {
		this.LatinSquare = puzzle;
	}
	
	public boolean ContainsZero() {
		
		for(int[] row : this.LatinSquare) {
			for(int col : row) {
				if(col == 0)
					return true;
			}
		}
		
		return false;
		
	}
	
	public static boolean doesElementExist(int[] arr, int iValue) {
		
		for(int x : arr) {
			if(x == iValue)
				return true;
		}
		
		return false;
		
	}
	
	public int[] getColumn(int iCol) {
		int[] product = new int[this.LatinSquare.length];
		
		for(int i = 0; i < this.LatinSquare.length; i++) {
			product[i] = this.LatinSquare[i][iCol];
		}
		
		return product;
	}
	
	public int[] getRow(int iRow) {
		return this.LatinSquare[iRow];
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) {
		
		for(int i : arr1) {
			boolean missing = true;
			
			for(int j : arr2) {
				if(i == j)
					missing = false;
			}
			
			if(missing)
				return false;
		}
		
		return true;
		
	}
	
	public static boolean hasDuplicates(int[] arr) {
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] == arr[j] && i != j)
					return true;
			}
		}
		
		return false;
		
	}

	public boolean isLatinSquare() {
		// Each row and column doesn't contain duplicates.
		for(int i = 0; i < this.LatinSquare.length; i++) {
			if(hasDuplicates(getRow(i)) || hasDuplicates(getColumn(i)))
				return false;
			
		}
		
		// If each element in the first row is found in every other row 
		int[] firstRow = this.LatinSquare[0];
		
		for(int i = 0 ; i < this.LatinSquare.length; i++) {
			if(!hasAllValues(firstRow, this.LatinSquare[i]))
				return false;
		}
		
		// If each element in the first column is found in every other column
		int[] firstColumn = getColumn(0);
		
		for(int i = 0; i < this.LatinSquare.length; i++) {
			if(!hasAllValues(firstColumn, getColumn(i)))
				return false;
		}
		
		return true;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
}
