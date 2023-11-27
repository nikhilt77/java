import java.util.Scanner;

class Employee{
	
	public static void display() {
		System.out.println("Name of class is Employee");
	}
	void calcSalary() {
		System.out.println("Salary of an employee is 10000");
	}
}
class Engineer extends Employee{
	int salary;
	
	void calcSalary(int Salary) {
		this.salary=Salary;
		super.display();
		super.calcSalary();
		System.out.println("Salary of Engineer:"+salary);
	}
}
public class Inheritance2 {

	public static void main(String[] args) {
		Scanner P=new Scanner(System.in);
		Engineer e=new Engineer();
		System.out.println("Enter Salary:");
		int Salary=P.nextInt();
		e.calcSalary(Salary);

	}

}
