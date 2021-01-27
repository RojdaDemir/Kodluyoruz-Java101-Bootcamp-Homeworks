package question7.threads;

public class ThreadSleep {

	public static void sleep(long milliSeconds) {
		
		try {
			Thread.sleep(milliSeconds);
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
