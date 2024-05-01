package arraycodes;

public class MaxElement {

	public static void main(String[] args) {
		
		
		int [] ar = {5,3,6,7,35,-19,11,35,0} ;
		
		int max = Integer.MIN_VALUE ;
		
		for (int i = 0; i < ar.length; i++) {
			
			if (ar[i]>max) 
			{	
				max = ar[i] ;
			}
		}
		
		System.out.println(max);
	}
}
