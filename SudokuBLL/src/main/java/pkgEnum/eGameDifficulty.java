package pkgEnum;

public enum eGameDifficulty {
	
	EASY(101), MEDIUM(500), HARD(1000);
	
	private int iDifficulty;
	
	private static java.util.Map<java.lang.Integer,eGameDifficulty>	lookup;

	private eGameDifficulty(int iDifficulty) {
		if (iDifficulty >= 0 && iDifficulty < 100)
			this.iDifficulty = 0;
	    else if(iDifficulty >= 100 && iDifficulty < 500) 
	    	this.iDifficulty = 101;
		else if(iDifficulty >= 500 && iDifficulty < 1000) 
			this.iDifficulty = 500;
		else if(iDifficulty >= 1000) 
			this.iDifficulty = 500;
}
	
	static eGameDifficulty get(int iDifficulty) {
		if (iDifficulty >= 0 && iDifficulty < 100)
			return null;
	    else if(iDifficulty >= 100 && iDifficulty < 500) 
	    	return EASY;
		else if(iDifficulty >= 500 && iDifficulty < 1000) 
			return MEDIUM;
		
		return HARD;
	}
	
	public int	getiDifficulty() {
		return iDifficulty;
	}
	
}
