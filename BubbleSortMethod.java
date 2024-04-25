package arraycodes;

import java.util.Arrays;
public class BubbleSortMethod 
{
	public static void bubbleSort(int[]ar)
	{
		for (int i = 0; i < ar.length-1; i++) 
		{	
			for (int j = 0; j < ar.length-1-i; j++) 
			{		
				if (ar[j]>ar[j+1]) 
				{
					int temp = ar[j] ;
					ar[j] = ar[j+1] ;
					ar[j+1] = temp ;	
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int [] a = {-11,-9,-6,-1,3,1,2,8,11} ;
		bubbleSort(a);
		System.out.println(Arrays.toString(a));
	}
	
}
