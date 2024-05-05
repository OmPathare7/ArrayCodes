package arraycodes;

import java.util.Arrays;

public class ZigZagCopy {

	public static void main(String[] args) 
	{		
		int [] a = {1,5,9,2,4,8,6} ;
		int b [] = {50,40,30,10,5,3,5} ;
		
		System.out.println(Arrays.toString(zigZag(a, b)));
	}
	
	public static int[] zigZag(int[]a ,int[] b)
	{
		int ans[] = new int[a.length+b.length] ;
		
		for (int i = 0,j=0; j < ans.length; i++) 
		{
			if (i<a.length&&i<b.length) 
			{		
				ans[j] = a[i] ;
				ans[j+1] = b[i] ;	
				j+=2 ;
			}
			else if (a.length-i>0) 
			{
				ans[j] = a[i] ;
				j++ ;
			}
			else if (b.length-i>0) 
			{
				ans[j] = b[i] ;	
				j++ ;
			}
		}
		
		return ans ;
	}
}
