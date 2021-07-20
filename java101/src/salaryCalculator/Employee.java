package salaryCalculator;

public class Employee {

	String name;// �al��an�n ad� ve soyad�
	int salary;// �al��an�n maa��
	int workHours;// Haftal�k �al��ma saati
	int hireYear;// ��e ba�lang�� y�l�

	public Employee(String name, int salary, int workHours, int hireYear) {
		this.name = name;
		this.salary = salary;
		this.workHours = workHours;
		this.hireYear = hireYear;
	}

	public int tax(int salary) {
		int tax = 0;
		if (salary > 1000) {
			tax = -(salary * 3 / 100);
		}

		return tax;
	}

	public int bonus(int salary, int workHours) {
		int bonus = 0;
		if (workHours > 40) {
			bonus = (workHours - 40) * 30;
		}
		return bonus;
	}

	public int raiseSalary(int salary, int hireYear) {
		int raiseSalary = salary;
		if ((2021 - hireYear) < 10) {
			raiseSalary = (raiseSalary * 5 / 100);
		} else if ((2021 - hireYear) > 9 && (2021 - hireYear) < 20) {
			raiseSalary = (raiseSalary * 10 / 100);
		} else if ((2021 - hireYear) > 19) {
			raiseSalary = (raiseSalary * 15 / 100);
		} else {
			System.out.println("raiseSalary error!");
		}
		return raiseSalary;

	}

	public void toMyString() {
		System.out.println("Ad�: " + name);
		System.out.println("Maa��: " + salary);
		System.out.println("�al��ma saati: " + workHours);
		System.out.println("Ba�lang�� y�l�: " + hireYear);
		System.out.println("Vergi: " + -tax(salary));
		System.out.println("Bonus: " + bonus(salary, workHours));
		System.out.println("Maa� art���: " + raiseSalary(salary, hireYear));
		System.out.println("Vergi ve Bonuslar ile birlikte maa�: " + (salary + bonus(salary, workHours) - tax(salary)));
		System.out.println(
				"Toplam Maa�: " + (salary + bonus(salary, workHours) - tax(salary) + raiseSalary(salary, hireYear)));
	}
}
