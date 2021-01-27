package question2.multiplication;

public class MultiplicationApplication {

	public static void main(String[] args) 
	{
		
		int[][] matrice1 = 
				 {
			       new int[] {1, 2, 3, 4 },
			       new int[] {4, 5, 7, 8 },
			       new int[] {5, 8, 2, 3 },
			       new int[] {2, 6, 8, 2 },
			       new int[] {1, 7, 0, 9 },
		         };
		
		int[][] matrice2 = 
			    {
				  new int[] {3, 8},
				  new int[] {2, 2},
				  new int[] {7, 9},
				  new int[] {5, 1},	
			    };
		
		System.out.println("İlk matris : ");
		printMatrice(matrice1);
		
		System.out.println("İkinci matris: ");
		printMatrice(matrice2);
		
		int[][] newMatrice = multiplication(matrice1, matrice2);
		System.out.println("Çarpım sonucu: ");
		printMatrice(newMatrice);

	}
	
	private static int[][] multiplication(int[][] matrice1, int[][] matrice2)
	{
	
        int result[][]=new int [matrice1.length][matrice2[0].length];

        
         for(int i = 0; i < matrice1.length; i++)
         {

            for(int j=0; j< matrice2[0].length;j++)
            {
            
                result[i][j] = 0;
                for(int k=0 ;k < matrice2.length; k++)
                {

                   result[i][j] = result[i][j] + matrice1[i][k] * matrice2[k][j];

                }
                        
            }
          
        }
         return result;
    }
	
	
	 private static void printMatrice(int[][] matrice) 
	 {
		 
		 for(int i = 0 ; i < matrice.length; i++) 
		 {
			 
			 for(int j = 0 ; j < matrice[0].length ; j++) 
			 {
			
				 System.out.print(matrice[i][j]+" ");
			 }
			 System.out.println();
		 }
		 
	 }
				
}
	

   