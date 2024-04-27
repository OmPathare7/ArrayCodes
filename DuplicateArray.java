package arraycodes;

import java.util.Arrays;

public class DuplicateArray 
{

	public static void main(String[] args) 
	{
		String [] names = {"Raju","Kaju","Juju","Moju","Janu"} ;	
		String [] dupNames = new String[names.length] ;
		
		
		for (int i = 0; i < names.length; i++) 
		{
			dupNames[i] = names[i] ;
		}	
		System.out.println(Arrays.toString(dupNames));
	}
}
