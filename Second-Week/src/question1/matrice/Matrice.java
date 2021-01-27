package question1.matrice;

public class Matrice 
{

	public static void main(String[] args)
	{
	
		int[][] matrice = {
			  	
			 new int[] { 1, 2, 3, 4, 5},
			 new int[] { 16, 17, 18, 19, 6},
			 new int[] { 15, 24, 25, 20, 7},
			 new int[] { 14, 23, 22, 21, 8},
			 new int[] { 13, 12, 11, 10, 9}
             				
		                   };
		
		int startRow = 0, endRow = 4;
		int startColumn = 0 , endColumn = 4;
	     
		
		
        while(startRow < endRow && startColumn < endColumn)
        {
        	
        	for(int i=startColumn ; i <=endColumn; i++) 
        	{
        		System.out.print(matrice[startRow][i]+" ");
        	}
        	
        	startRow++;
        	
        	for(int j=startRow ; j <= endRow ; j++) 
        	{
        		System.out.print(matrice[j][endRow]+" ");
        	}
        	
        	endColumn--;
        	
        	for(int k=endColumn ; k >= startColumn ; k--)
        	{
        		System.out.print(matrice[endRow][k]+" ");
        	}
        	
        	endRow--;
        	
        	for(int m = endRow ; m >= startRow ; m--) 
        	{
        	
        		System.out.print(matrice[m][startColumn]+" ");
        		
        		if(startRow == endColumn) 
        		{
        			System.out.print(matrice[startRow][endColumn]);
        		}
        	}
        	
        	startColumn++;
        }
		
	 }
}
		
		
		
		

