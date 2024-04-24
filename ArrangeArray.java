package arraycodes;

import java.util.Arrays;

public class ArrangeArray //------------------- positives to right negatives to left
{
	public static void main(String[] args) 
	{
		int [] ar = {2,9,-1,-11,8,10,-9,2,-6} ;
		for (int i = 0,j=ar.length-1; i <j;) 
		{
			if (ar[i]<0 && ar[j]>=0) 
			{
				i++ ;
				j-- ;
			}
			else if (ar[i]<0 && ar[j]<=0) 
			{
				i++ ;
			}
			else if (ar[i]>0 && ar[j]>=0) 
			{
				j-- ;
			}
			if (ar[i]>0 && ar[j]<=0 && i<j) 
			{
				int temp = ar[i] ;
				ar[i] = ar[j] ;
				ar[j] = temp ;
				i++ ;
				j-- ;
			}
		}
		System.out.println(Arrays.toString(ar));
	}
	
	
}

