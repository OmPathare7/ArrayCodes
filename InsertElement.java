package arraycodes;

public class InsertElement {
	
	public static void main(String[] args) {
		
		int[] ar = {10,9,8,7,6} ;
		
		try
		{
			int ans [] = insert(ar,100,50);
			
			for (int i = 0; i < ans.length; i++) {
				
				System.out.print(ans[i]+",");
			}
		}
		catch (NullPointerException e) {
			
			System.out.println("Element could not be inserted as the given index was out or range");
		}
	}
	
	public static int[] insert(int[]ar,int index,int element)
	{
		if (index>=0 && index<ar.length) {
			
			int [] updated = new int[ar.length+1] ;
			
			for (int i = 0,j=0; i < ar.length;) {
				
				if (j==index) {
					
					updated[j] = element ;
					j++ ;
				}
				else if (j<index || j>index) {
					
					updated[j] = ar[i] ;
					
					j++;
					i++ ;
				}
			}
			
			return updated ;
		}
		else
		{
			return null ;
		}
	}
}

