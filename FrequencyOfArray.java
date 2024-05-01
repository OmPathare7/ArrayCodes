package arraycodes;

public class FrequencyOfArray {

	public static void main(String[] args) 
	{	
		int [] ar = {2,5,3,5,78,3,4,7,2,67,3,2,5} ;
		
		int count [] = new int[ar.length] ;
		
		for (int i = 0; i < ar.length; i++) {
			
			int ct = 0 ;
			
			for (int j = i+1; count[i]!=-1&& j < ar.length; j++) {
				
				if (ar[i]==ar[j]) {
					
					ct++ ;
					
					count[j] = -1 ;
				}
			}
			
			if (count[i]!=-1) {
				
				count[i] = ct ;
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			
			if (count[i]!=-1) 
			{
				System.out.println(ar[i]+" is repeated "+count[i]+" "
						+ "times");
			}
		}
	}
}
