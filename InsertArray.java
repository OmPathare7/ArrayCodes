package arraycodes;

import java.util.Arrays;

public class InsertArray {

	public static void main(String[] args) {
		
		int [] ar = {1,2,3,4,5,6} ;
		
		int [] br = {10,11,12,13} ;
		
		System.out.println(Arrays.toString(insertToIndex(ar, br, 3)));
	}
	
	public static int[] insertToIndex(int[]ar,int []br ,int index)
	{
		int [] cr = new int[ar.length+br.length] ;
		
		for (int i = 0; i < cr.length; i++) {
			
			if (i<index) {
				
				cr[i] = ar[i] ;
			}
			else if (i>=index) {
				
				cr[i] = br[i] ;
			}
			else if (cr[i]>= ar[i] && ar[i]==cr.length) {
				cr[i] = ar[i-br.length] ;
			} 

			}
		
		
		return cr ;
	}
}
