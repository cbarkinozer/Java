package insuranceManagementSystem;

import java.util.Date;

public abstract class Insurance {
	private String insuranceName;
	private double insurancePrice;
	private Date insuranceDate;
	
	
	public abstract void calculate();
}
