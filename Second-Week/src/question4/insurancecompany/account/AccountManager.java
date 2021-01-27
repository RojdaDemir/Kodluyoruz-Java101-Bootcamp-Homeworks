package question4.insurancecompany.account;

import java.util.Set;
import java.util.TreeSet;

import question4.insurancecompany.InvalidAuthenticationException;

public class AccountManager {

	private Account account;
	private Set<Account> accountSet;
	
	public AccountManager() {
		
		this.accountSet =  new TreeSet<Account>();
	}
	
	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Set<Account> getAccountSet() {
		return accountSet;
	}

	public void setAccountSet(Set<Account> accountSet) {
		this.accountSet = accountSet;
	}

	
	public Account login(String email, String sifre) {
		
		for(Account account: accountSet) {
			
			try {
				
				account.loginStatus(email, sifre);
			}
			catch(InvalidAuthenticationException e){
				
				e.printStackTrace();
			}
		}
	       	
		return account;
	}
	  	
}

