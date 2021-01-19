package question3.meaning;


public class Mean {

	
	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		newArray(array);
		printArray(array);		
		double resultAverage = average(array); 

		System.out.println("Dizinin ortalaması: "+resultAverage);
		
	}
	 
	public static int[] newArray(int[] array1) {
		
		
		
		for(int i=0 ; i< array1.length; i++) {
			
	           array1[i]= (int)(Math.random()*100);
			
		}
	   return array1;
		
	}
	
	public static void printArray(int[] array) {
		
		for(int i=0 ; i< array.length ; i++) {
			System.out.print(array[i]+" ");
		}
		System.out.println();
	}
	
	private static double average(int[] array) {
		
		double sum = 0.0;
		
		for(int i = 0 ; i < array.length ; i++) {
			
			sum = sum + array[i];
		}
		
		double averageValue = sum / array.length;
		return averageValue;
	}
	
}
