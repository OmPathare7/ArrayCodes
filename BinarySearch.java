package arraycodes;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
		
		System.out.println("Enter the element to search: ");
		
		int [] ar = {8,22,25,29,54,88,200,200,390,501,1000} ;
		
		int start = 0 , end = ar.length-1 , mid = (start+end)/2 ;
		
		int search = sc.nextInt() ;
		
		System.out.println(binarySearch(ar, search)+" index");
		System.out.println(binarySearch(search, ar));
		
		//System.out.println(Arrays.binarySearch(ar, search));
	}
	
	public static int binarySearch(int[]ar, int search)
	{
		Arrays.sort(ar);
		int start = 0 , end = ar.length-1, mid = (start+end)/2 ;
		while (start<=end) {
			
			if (search==ar[mid]) {
				
				return mid ;
			}
			else if (search>ar[mid]) {
				
				start = mid+1 ;
			}
			else if (search<ar[mid]) {
				
				end = mid-1 ;
			}
			
			mid = (start+end)/2;
		}
		
		return -1 ;
		
	}
	public static boolean binarySearch(int search,int[]ar)
	{
		BubbleSortMethod.bubbleSort(ar);
		int start = 0 , end = ar.length-1, mid = (start+end)/2 ;
		while (start<=end) {
			
			if (search==ar[mid]) {
				
				return true ;
			}
			else if (search>ar[mid]) {
				
				start = mid+1 ;
			}
			else if (search<ar[mid]) {
				
				end = mid-1 ;
			}
			
			mid = (start+end)/2;
		}
		
		return false ;
	}	
}
