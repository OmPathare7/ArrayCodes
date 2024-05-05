package arraycodes;

public class UniqueArray {

	public static void main(String[] args) {
		
		int [] ar = {1,2,4,3,5,13,22,4,56} ;
		
		if (isUnique(ar)) {
			
			System.out.println("It is unique");
		}
		else
		{
			System.out.println("Not unique");
		}
	
	}
	
	public static boolean isUnique(int [] ar)
	{
		for (int i = 0; i < ar.length; i++) {
			
			for (int j = i+1; j < ar.length; j++) {
				
				if (ar[i]==ar[j]) {
					
					return false ;
					
				}
			}	
		}
		return true ;
		
	}
}

