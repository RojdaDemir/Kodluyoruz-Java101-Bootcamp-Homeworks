package question4.shape;

import java.util.Scanner;

public class Shape {

	private static Scanner input;

	public static void main(String[] args) {
	
		 
   	    String answer = null;
		
	     do {
	    	 
	    	 int choice = showMenu();
	 		
	 		 triangleOperations(choice);
	 		
	    	 System.out.println("İşleme devam etmek istiyor musunu? (E/H)");
	         answer = input.next();
	    	 
	     }
		
	     while(answer.toUpperCase().equals("E"));
		
         System.out.println("İşlem sonlanmıştır.");	     
	     
		input.close();
		
	}
	
	private static int showMenu() {
		
		input = new Scanner(System.in);
		
		StringBuilder builder = new StringBuilder();
		builder.append("1-Dik Üçgen ");
		builder.append("2-Üçgen");
		builder.append("3-Ters Dik Üçgen ");
		builder.append("4-Ters Üçgen");
		
		System.out.println(builder.toString());
		System.out.println("Yapmak istediğiniz seçimi giriniz:");
		int choice= input.nextInt();
		return choice;
		
	}
	
	private static void triangleOperations(int choice) {
		
		switch(choice) {
		
		  case 1: verticalTriangle();
		          break;
		
		  case 2: triangle();
		          break;
		          
		  case 3: reverseVertigalTriangle();
		          break;
		          
		  case 4: reverseTriangle();
		          break;
		  
		  default: System.out.println("Lütfen doğru bir seçim yapınız.");
		          break;
		}
		
	}	
		
	  private static void verticalTriangle() {
		  
		  String star = "*";
		  for(int i = 1 ; i <=10 ; i++) {
				
				System.out.println(star);
				star = star + "*";
			}		  
	  }
	  
	  private static void triangle() {
		
		   
		   for(int i=0 ; i<=10 ; i++) {
			   
			   for(int j=0 ; j <= 10-i ; j++) {
				   
				   System.out.print(" ");
			   }
			   
			   for(int k=0 ; k < 2*i-1; k++) {
				   System.out.print("*");
			   }
			   
			   System.out.print("\n");
		   }
		   
	  }
	  
	  private static void reverseVertigalTriangle() 
	  {
		
		  for(int i = 10 ; i >= 0 ; i--) {
	            for(int j = 0 ; j < i; j++){
	                System.out.print("*");
	            }
	            System.out.print("\n");
	        }
            
	  }
		
	  private static void reverseTriangle() {
		  
		  for(int i=0; i<10; i++)
		  {
	            for(int j=0;j<=i;j++)
	            {
	                System.out.print(" ");
	            }   
	            for(int k = 2*10-1; k >= (2*i+1); k--){
	                System.out.print("*");
	                
	            }
	                System.out.println();   

	        }
		  
		  
	  }
	  
}
	  
