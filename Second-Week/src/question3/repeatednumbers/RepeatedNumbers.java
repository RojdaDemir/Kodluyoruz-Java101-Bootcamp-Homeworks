package question3.repeatednumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class RepeatedNumbers 
{

	public static void main(String[] args)
	{	
		Scanner input = new Scanner(System.in);
		
	    System.out.println("1-Hazır Liste 2-Random Liste\n Seçiminizi yapınız:");
	    int choice = input.nextInt();
	
	    
		if(choice == 1) {
			
			readyList();
		}
	   
		else if(choice == 2)
		{
		    
			List<Integer> array = new ArrayList<Integer>();
			
		    System.out.println("\nDizinin kapasitesini giriniz:");
		    
		    int size = input.nextInt(); 
		   
		    for(int i= 0 ; i < size; i++) 
		    {
		    	
		    	 Random random = new Random();
		         int randomNumber = random.nextInt(10)+1;
		         array.add(randomNumber);
		    }
		    	    
		   for(int arrayValues: array)
		   {
			   
			   System.out.print(arrayValues+" ");
		   }
		   
		   System.out.println("\nTekrarlanan Sayılar");
		   repeatedNumbersFind(array);
		    
		}	
		else
			System.out.println("Doğru bir girdi giriniz.");
		
		input.close();	
	}
	
	
	
	   private static void readyList() {
		
		List<Integer> liste = new ArrayList<Integer>() ;
		
		liste.add(2);
		liste.add(4);
		liste.add(5);
		liste.add(11);
		liste.add(33);
		liste.add(2);
		liste.add(5);
		liste.add(55);
		liste.add(100);
		liste.add(1);
		liste.add(1);
	    
		Stream<Integer> stream = liste.stream();
		
	    Consumer<Integer> printer = (list) -> {
	    	
	    	System.out.print(list+" ");
	    };
	    
	    stream.forEach(printer);
	    
	    System.out.println("\nTekrarlanan Sayılar");
	     
	    repeatedNumbersFind(liste);
	    	
	   }
	   
	   private static void repeatedNumbersFind(List<Integer> liste) {
		   
		   Set<Integer> findValues = new TreeSet<Integer>();
	   
		   for(int i =0 ; i< liste.size(); i++) 
		   {
				
				for(int j = i+1 ;j < liste.size(); j++) 
				{
					 if(liste.get(i) == liste.get(j))
						 
					 {
						findValues.add(liste.get(i));
						
					 }
				}
			 }
				
		   System.out.print(findValues+" ");
		}
	  }
	   

	
	



	





