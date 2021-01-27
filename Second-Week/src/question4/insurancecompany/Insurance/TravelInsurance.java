package question4.insurancecompany.Insurance;

import java.util.Date;


public class TravelInsurance extends Insurance{

	public TravelInsurance(String insuranceName, double insuranceSalary, Date insuranceStartDate,
			Date insuranceEndDate) {
		super(insuranceName, insuranceSalary, insuranceStartDate, insuranceEndDate);

	}

	@Override
	public void calculate() {
	
		double result = super.insuranceSalary * 0.4;
		System.out.println("Seyahat sigortası ücreti : "+result);
		
	}

}
