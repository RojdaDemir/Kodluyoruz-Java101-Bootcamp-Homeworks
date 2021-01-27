package question7.threads;

import java.util.ArrayList;
import java.util.List;


public class OddEvenNumbers implements Runnable{

	private Object LOCK = new Object();
	private List<Integer> liste;
	private static List<Integer> oddList = new ArrayList<Integer>();
    private static List<Integer> evenList = new ArrayList<Integer>();
	
    
    public OddEvenNumbers(){
    	
    	
    }
	
	public OddEvenNumbers(List<Integer> numbers) {
		
		this.liste = numbers;
	}
	
	@Override
	public void run() {
		
		StringBuilder builder = new StringBuilder();
		builder.append(Thread.currentThread().getName());
		System.out.println(builder.toString());
        		
		synchronized (LOCK) {
		
		  for(int i = 0 ; i < this.liste.size() ; i++)
		   {
			
			if(this.liste.get(i) % 2 == 0) {
				
			    evenList.add(this.liste.get(i));
			
			}
			else 
			{
				oddList.add(this.liste.get(i));
			}
		  }
		
		}
		ThreadSleep.sleep(200);
		
	}
	
	public List<Integer> getOddList() {
		return oddList;
	}

	public List<Integer> getEvenList() {
		return evenList;
	}


}


		
		
	
	



