package salaryCalculator;

public class Employee {
	
	String name;//�al��an�n ad� ve soyad�
	int salary;// �al��an�n maa��
	int workHours;// Haftal�k �al��ma saati
	int hireYear;//��e ba�lang�� y�l�
	
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
