package question4.insurancecompany.Insurance;

import java.util.Date;

public class ResidenceInsurance extends Insurance{

	public ResidenceInsurance(String insuranceName, double insuranceSalary, Date insuranceStartDate,
			Date insuranceEndDate) {
		super(insuranceName, insuranceSalary, insuranceStartDate, insuranceEndDate);
		 }

	@Override
	public void calculate() {
	
		double result = super.insuranceSalary * 0.6 ;
		System.out.println("Konut sigortası ücreti: "+result);
	}

	
}
