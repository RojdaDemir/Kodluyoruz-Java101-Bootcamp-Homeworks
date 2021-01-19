package question5.oddandevencontrol;

import question3.meaning.Mean;

public class Control {

	public static void main(String[] args) {
	
		int[] array = new int[100];
		Mean.newArray(array);
		Mean.printArray(array);
		
		int[] arrayEven = new int[100];
		int[] arrayOdd = new int[100];
		
		int evenCounter = 0;
		int oddCounter = 0;
		
		for(int i=0 ; i < array.length; i++) 
	    {
		     
		     	
			if(array[i] % 2 == 0)
			{  
			    arrayEven[evenCounter] = array[i];
			    evenCounter++;
			}
			else {
			      	arrayOdd[oddCounter] = array[i];
			      	oddCounter++;
			     }
		}
	 
		System.out.println("Çift Sayılar");
		Mean.printArray(arrayEven);
		
		System.out.println("Tek sayılar");
		Mean.printArray(arrayOdd);

	}
}

	
	
