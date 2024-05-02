package arraycodes;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		int[] ar = {1,2,54,3,4,2,2,3,2,4,5,6,4,3,2};
		
		System.out.println(Arrays.toString(removeDuplicates(ar)));
		
	}
	
	public static int[] removeDuplicates(int[]ar)
	{
		int []count = countOfElements(ar) ;
		
		int negCount = 0 ;
		
		for (int i = 0; i < count.length; i++) {
			
			if (count[i]==-1) {
				
				negCount++ ;
			}
		}
		
		int unique [] = new int[ar.length-negCount] ;
		
		for (int i = 0,j=0; i < ar.length; i++) {
			
			if (count[i]!=-1) {
				
				unique[j] = ar[i] ;
				
				j++ ;
			}
		}
		
		return unique ;
	}
	
	public static int[] countOfElements(int [] ar)
	{
		int [] count = new int[ar.length] ;
		
		for (int i = 0; i < ar.length; i++) {
			
			int ct = 0 ;
			
			for (int j =i+1; j < ar.length&&count[i]!=-1; j++) {
				
				if (ar[i]==ar[j]) {
					
					ct++ ;
					
					count[j] = -1;
				}
				
			}
			
			if (count[i]!=-1) {
				
				count[i] = ct ;
			}
		}
		
		return count ;
	}
}
