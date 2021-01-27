package question4.insurancecompany.Insurance;

import java.util.Date;

public class CarInsurance extends Insurance {

	public CarInsurance(String insuranceName, double insuranceSalary, Date insuranceStartDate, Date insuranceEndDate) {
		super(insuranceName, insuranceSalary, insuranceStartDate, insuranceEndDate);
	}

	@Override
	public void calculate() {
		
		double result = super.insuranceSalary * 0.3;
		System.out.println("Özel araç sigorta ücreti: "+result);
		
	}

	
}
