package question4.insurancecompany.User;

import question4.insurancecompany.account.Account;

public class Enterprise extends Account{

	@Override
	public void addInsurancePolicy() {

        System.out.println("Kurumsal Müşteri Hesabı!");
		
	}

	@Override
	public int compareTo(Account o) {
	
		return 0;
	}

}
