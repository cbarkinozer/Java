package salaryCalculator;

public class Employee {
	
	String name;//Çalýþanýn adý ve soyadý
	int salary;// Çalýþanýn maaþý
	int workHours;// Haftalýk çalýþma saati
	int hireYear;//Ýþe baþlangýç yýlý
	
	public Employee(String name,int salary,int workHours,int hireYear) {
		this.name=name;
		this.salary=salary;
		this.workHours=workHours;
		this.hireYear=hireYear;
	}
	public void tax() {}
	public void bonus(){}
	public void raiseSalary(){}
	public void toString(){} 
}
