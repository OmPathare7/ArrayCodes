package arraycodes;

public class MissingElement {

	public static void main(String[] args) {
		
		int [] ar = {9,7,2,1,5,4,8,6} ;
		
		int max = Integer.MIN_VALUE , sum = 0 ;
		
		for (int i = 0; i < ar.length; i++) {
		
			if (ar[i]>max) {
				
				max = ar[i] ;
			}
			
			sum+=ar[i] ;
		}
		
		int naturalSum = max*(max+1)/2 ;
		
		System.out.println("The missing element is: "+(naturalSum-sum));
	}
}
