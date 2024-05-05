package arraycodes;

public class SecondMaxElement 
{
	public static void main(String[] args) 
	{
		int[]ar = {6,42,9,8,20,29,42,0} ;
		
		int max = Integer.MIN_VALUE ;
		int secMax = Integer.MIN_VALUE ;
		
		for (int i = 0; i < ar.length; i++) 
		{
			if (ar[i]>max) 
			{	
				secMax = max ;
				max = ar[i] ;
			}
			else if (ar[i]>secMax && ar[i]!=max) 
			{		
				secMax = ar[i] ;
			}	
		}
		
		System.out.println(secMax);
	}
}
