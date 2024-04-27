package arraycodes;

public class CountOdd {

	public static void main(String[] args) 
	{	
		int [] ar = {2,54,5,4,6,34,5,4,4} ;	
		System.out.println(oddCount(ar));
	}
	
	public static int oddCount(int[]a)
	{
		int count = 0 ;
		for (int i = 0; i < a.length; i++) 
		{	
			if (a[i]%2!=0) 
			{
				count++ ;
			}
		}
		return count ;
	}
}
