package encapsulationPackage;

import java.util.Scanner;

class Employee
{
	private int employee_id;
	private String employee_name;
	private int employee_salary;
	
	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getEmployee_salary() {
		return "600000";
	}
}
public class EmployeeInfo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee r = new Employee();
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter employee_id: ");
		int employee_id = sc.nextInt();
		System.out.print("\nEnter employee_name: ");
		String employee_name = sc.next();
		r.setEmployee_id(employee_id);
		r.setEmployee_name(employee_name);
		System.out.print("\nemployee_id is: "+r.getEmployee_id());
		System.out.print("\nemployee_name is: "+r.getEmployee_name());
		System.out.print("\nEmployee_salary is: "+r.getEmployee_salary());
	}
}
