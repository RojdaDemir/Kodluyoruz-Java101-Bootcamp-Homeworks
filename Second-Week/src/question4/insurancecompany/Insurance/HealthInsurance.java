package question4.insurancecompany.Insurance;

import java.util.Date;

public class HealthInsurance extends Insurance{

	public HealthInsurance(String insuranceName, double insuranceSalary, Date insuranceStartDate,
			Date insuranceEndDate) {
		super(insuranceName, insuranceSalary, insuranceStartDate, insuranceEndDate);
		
	}

	@Override
	public void calculate() {
		
         double result = super.insuranceSalary * 0.1;
         System.out.println("Sağlık sigortası ücreti : "+ result);
         
	}

}
