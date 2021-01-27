package question4.insurancecompany.Insurance;

import java.util.Date;

public abstract class Insurance {

	protected String insuranceName;
	protected double insuranceSalary;
	protected Date insuranceStartDate;
	protected Date insuranceEndDate;

	public Insurance(String insuranceName, double insuranceSalary, Date insuranceStartDate, Date insuranceEndDate) {
		
		this.insuranceName = insuranceName;
		this.insuranceSalary = insuranceSalary;
		this.insuranceStartDate = insuranceStartDate;
		this.insuranceEndDate = insuranceEndDate;		
	}
    
	public String getInsuranceName() {
		return insuranceName;
	}

	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}

	public double getInsuranceSalary() {
		return insuranceSalary;
	}

	public void setInsuranceSalary(double insuranceSalary) {
		this.insuranceSalary = insuranceSalary;
	}

	public Date getInsuranceStartDate() {
		return insuranceStartDate;
	}

	public void setInsuranceStartDate(Date insuranceStartDate) {
		this.insuranceStartDate = insuranceStartDate;
	}

	public Date getInsuranceEndDate() {
		return insuranceEndDate;
	}

	public void setInsuranceEndDate(Date insuranceEndDate) {
		this.insuranceEndDate = insuranceEndDate;
	}

	public abstract void calculate();
	
}
