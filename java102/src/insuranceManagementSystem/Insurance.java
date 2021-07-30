package insuranceManagementSystem;

import java.util.Date;

public abstract class Insurance {
	private String insuranceName;
	private double insurancePrice;
	private Date insuranceDate;
	public abstract void calculate();
	
	public String getInsuranceName() {
		return insuranceName;
	}


	public void setInsuranceName(String insuranceName) {
		this.insuranceName = insuranceName;
	}


	public double getInsurancePrice() {
		return insurancePrice;
	}


	public void setInsurancePrice(double insurancePrice) {
		this.insurancePrice = insurancePrice;
	}


	public Date getInsuranceDate() {
		return insuranceDate;
	}


	public void setInsuranceDate(Date insuranceDate) {
		this.insuranceDate = insuranceDate;
	}


	
}
