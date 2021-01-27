package question4.insurancecompany;

public enum AuthenticationStatus {

	SUCCESS(1),
   	FAIL(0);
   	
   	private int value;
	
	private AuthenticationStatus(int value) {
		
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	
	
}
