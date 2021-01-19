package question7.inheritance;


public class SalesReport extends Report{

	
	private String[] authorizedDepartments;
	
	public String[] getAuthorizedDepartments() {
		
		return this.authorizedDepartments;
	}
	
	public void setAuthorizedDepartments(String[] _authorizedDepartments) {
		
		this.authorizedDepartments = _authorizedDepartments;
	}
	
	
}
