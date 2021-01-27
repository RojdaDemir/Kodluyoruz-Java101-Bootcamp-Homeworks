package question4.insurancecompany;

public class InvalidAuthenticationException extends Exception{
   
	private static final long serialVersionUID = 1234567894548791789L;

	public InvalidAuthenticationException(String message) {
         
		System.out.println(message);
	}
	

	
}