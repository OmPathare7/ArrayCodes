package arraycodes;

public class SubSequence {

	public static void main(String[] args) 
	{	
		int [] ar = {1,1,4,4,5,5,5,5,8,8,0,0,0,2,1,4,4,4,4,4,4,0,0,0,0} ;
		int count []= new int[ar.length] ;
		
		int ct = 1 ;
		
		for (int i = 0; i < ar.length-1; i++) {
			
			if (ar[i]==ar[i+1]) {
				
				count[i+1] = ct++ ;
			}
			else
			{
				ct =1 ;
			}
		}
		
		int index = maxIndex(count);
		
		System.out.println("The largest subsequence character is "+ar[index]+" which is repeated "+(count[index]+1)+" times");
	}
	
	public static int maxIndex(int [] count)
	{
		int max = Integer.MIN_VALUE ;
		
		int index = 0 ;
		for (int i = 0; i < count.length; i++) {
			
			if (count[i]>max) {
				
				index = i ;
				max = count[i] ;
			}
		}
		
		return index ;
	}
	
	
	
	
	
	
	
	
	
	
}

