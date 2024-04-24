package arraycodes;

public class anagramArray
{
	public static void main(String[] args) 
	{
		char[] ch1 = {'x','y','z','a','b','c'} ;
		char[] ch2 = {'c','a','b','y','z','x'} ;
		
		if (ch1.length==ch2.length) 
		{
			int i ;
			for ( i = 0; i < ch2.length; i++) 
			{
				int j ;
				for ( j = 0; j < ch2.length; j++) 
				{
					if (ch1[i]==ch2[j]) 
					{
						break ;	
					}
				}
				
				if (j==ch2.length) 
				{
					break ;
				}
			}
			
			if (i==ch1.length) 
			{
			 System.out.println("It is an anagram array!");		
			}
			else
			{
				System.out.println("It is not an anagram array!");
			}
		}
		else
		{
			System.out.println("Not an anagram array!");
		}	
		
	}
}
