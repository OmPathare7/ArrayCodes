package arraycodes;

import java.util.Arrays;

public class ReverseArrays {

	public static void main(String[] args) {
		
		
		int [] ar = {5,6,8,9} ;
		
		reverseArray(ar);
		
		System.out.println(Arrays.toString(ar));
		
		System.out.println(Arrays.toString(newReverseArray(ar)));
		
		System.out.println(Arrays.toString(ar));
		
		
		
	}
	
	public static void reverseArray(int[]ar)
	{
		for (int i = 0,j=ar.length-1; i < j; i++,j--) {
			
			int temp = ar[j] ;
			ar[j] = ar[i] ;
			ar[i] = temp ;
			
		}
	}
	public static int[] newReverseArray(int[]ar)
	{
		int [] rev = new int[ar.length];
		
		for (int i = 0; i < ar.length; i++) {
			
			rev[i] = ar[ar.length-1-i] ;
		}
		
		return rev ;
	}
}
