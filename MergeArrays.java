package arraycodes;

import java.util.Arrays;

public class MergeArrays {

	public static void main(String[] args) {
		
		
		int [] a = {9,8,7,6,5,4} ;
		
		int [] b = {10,11,12,14} ;
		
		System.out.println(Arrays.toString(merge(a, b)));
		
		
	}
	
	public static int[] merge(int[] a, int [] b)
	{
		int [] ans = new int[a.length+b.length] ;
		
		for (int i = 0; i < ans.length; i++) {
			
			if (i<a.length) {
				
				ans[i] = a[i] ;
			}
			else
			{
				ans[i] = b[i-a.length] ;
			}
		}
		
		return ans ;
	}
}

