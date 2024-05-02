package arraycodes;

public class PalindromeArray {

	public static void main(String[] args) {
		
		int [] ar = {1,2,2,3,2,1} ;
		
		System.out.println(checkPalidrome(ar));
	}
	
	public static boolean checkPalidrome(int[]ar)
	{
		boolean flag = false ;
		for (int i = 0,j=ar.length-1; i <j; i++,j--) {
			
			if (ar[i]!=ar[j]) {
				
				flag = true ;
				break ;
			}
		}
		
		return !flag ;
	}
}
