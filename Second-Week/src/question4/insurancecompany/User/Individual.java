package question4.insurancecompany.User;

import question4.insurancecompany.account.Account;

public class Individual extends Account{

	@Override
	public void addInsurancePolicy() {
			
		System.out.println("Bireysel Müşteri Hesabı!");
		
	}

	@Override
	public int compareTo(Account o) {
	
		return 0;
	}

	
	
}
