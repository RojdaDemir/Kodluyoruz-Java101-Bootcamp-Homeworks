package question7.threads;

import java.util.ArrayList;
import java.util.List;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadOperations {

	public static void main(String[] args) {

		List<Integer> numberList = new ArrayList<Integer>();
 		 
		for(int i = 1 ; i <= 10000 ; i++) {
			
			numberList.add(i);
	  	}
		
	   ThreadPoolExecutor executor = (ThreadPoolExecutor) Executors.newFixedThreadPool(4);
		
		int firstValue = 0, lastValue=2500;
		
		
		for(int i=1; i <= 4 ; i++) {
			
			OddEvenNumbers oddEvenNumbers = new OddEvenNumbers(numberList.subList(firstValue, lastValue));
		
			firstValue += 2500;
			lastValue += 2500;
			
			executor.execute(oddEvenNumbers);
		
		}
		
		executor.shutdown();
		
	   while (!executor.isTerminated()) {

        }
		
		OddEvenNumbers oddEvenNumber = new OddEvenNumbers();
		
		//Her çalıştırdğımda farklı sonuçlar veriyor sebebini anlayamadım.Threadlerden dolayı mı? :(
		//Debug as yapıp adım adım gittiğimde doğru çıkıyor.
		
        System.out.println("Çift Sayılar");
        System.out.println(oddEvenNumber.getEvenList().size());
        System.out.println(oddEvenNumber.getEvenList());
		

        System.out.println("Tek Sayılar");
        System.out.println(oddEvenNumber.getOddList().size());
        System.out.println(oddEvenNumber.getOddList());
		   
 
	  }
	
}
