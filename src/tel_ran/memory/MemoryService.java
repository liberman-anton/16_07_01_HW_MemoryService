package tel_ran.memory;

public class MemoryService {
	public static int getMaxLongs(){
		int nLongs = Integer.MAX_VALUE;
		int leftSide = 0;
		int rightSide = nLongs;
			while (leftSide <= rightSide) {
				try {
					long[] arrayLongs = new long[nLongs];
					leftSide = nLongs + 1;					
				} catch (Throwable e) {
					rightSide = nLongs - 1;
				}	
				nLongs = (leftSide + rightSide)/2;
			}
		return nLongs;
	}
}
