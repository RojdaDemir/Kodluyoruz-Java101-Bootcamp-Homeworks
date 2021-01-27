package question4.insurancecompany.account;

import java.util.List;

import question4.insurancecompany.AuthenticationStatus;
import question4.insurancecompany.InvalidAuthenticationException;
import question4.insurancecompany.Insurance.Insurance;
import question4.insurancecompany.User.User;

public abstract class Account implements Comparable<Account> {

	private AuthenticationStatus authenticationStatus;
	private User user;
	private List<Insurance> customInsuranceList;
	
	public List<Insurance> getCustomInsuranceList() {
		return customInsuranceList;
	}

	public void setCustomInsuranceList(List<Insurance> customInsuranceList) {
		this.customInsuranceList = customInsuranceList;
	}
	
	
	public AuthenticationStatus getAuthenticationStatus() {
		return authenticationStatus;
	}

	public void setAuthenticationStatus(AuthenticationStatus authenticationStatus) {
		this.authenticationStatus = authenticationStatus;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public final void showUserInfo() {
		
		StringBuilder builder = new StringBuilder();
	    builder.append(this.user.getIsim());
	    builder.append(" ");
	    builder.append(this.user.getSoyisim());
	    builder.append(" ");
	    builder.append(this.user.getEmail());
	    builder.append(" ");
	    builder.append(this.user.getSifre());
	    builder.append(" ");
	    builder.append(this.user.getMeslek());
	    builder.append(" ");
	    builder.append(this.user.getYas());
	    builder.append(" ");
	    builder.append(this.user.getAdresListesi());
	    builder.append(" ");
	    builder.append(this.user.getSistemeSonGirisTarihi());
	    
	    builder.toString();
			
	}
	
	 public boolean loginStatus(String email, String sifre) throws InvalidAuthenticationException {
		
			
		 if( this.user.getEmail().equals(email)  &&  this.user.getSifre().equals(sifre) ) {
			 
			 System.out.println("Giriş başarılıdır.");
			 
			 return AuthenticationStatus.SUCCESS.equals(this.authenticationStatus);
			 
		   }
		 
		 else {
			 
			throw new InvalidAuthenticationException("Giriş hatalıdır.");
			
		 }      
		 	 
	 }
	 
	 public int userStatus() 
	 {
		 return authenticationStatus.getValue();
	 }
		 
	public abstract void addInsurancePolicy();
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((authenticationStatus == null) ? 0 : authenticationStatus.hashCode());
		result = prime * result + ((customInsuranceList == null) ? 0 : customInsuranceList.hashCode());
		result = prime * result + ((user == null) ? 0 : user.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		if (authenticationStatus != other.authenticationStatus)
			return false;
		if (customInsuranceList == null) {
			if (other.customInsuranceList != null)
				return false;
		} else if (!customInsuranceList.equals(other.customInsuranceList))
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}
}
