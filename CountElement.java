package arraycodes;

import java.util.Scanner;

public class CountElement 
{
	public static void main(String[] args) //---------------------element repetead count
	{
		Scanner sc=  new Scanner(System.in) ;
		System.out.println("Enter the element to search: ");
		
		int element  = sc.nextInt() ;
		int [] ar = {2,5,23,56,2,5,3,56,7,2,2,2} ;
		
		System.out.println("Element repeated "+count(ar, element)+" times");
	}
	
	public static int count(int[]a , int element)
	{
		int count = 0 ;
		for (int i = 0; i < a.length;i++)
		{		
			if (a[i]==element) 
			{	
				count++ ;
			}
		}
		return count ;
	}
}
