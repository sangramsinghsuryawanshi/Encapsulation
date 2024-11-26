/*
 * 1. Create a Java program to manage employee data for a small company. The program should allow adding employees and calculating the average salary of employees in a specific department.

Define a class Employee with the following attributes:

String name - the name of the employee.

String department - the department to which the employee belongs (e.g., "HR", "IT", "Sales").

double salary - the salary of the employee.

Include the following methods:

Constructor to initialize name, department, and salary.

getDepartment() - returns the department of the employee.

getSalary() - returns the salary of the employee.

toString() - returns the string representation of the employee in the format: Name: [name], Department: [department), Salary: [salary].

In the Main class:

Define an array of Employee objects. Use this array to store details of a few employees (at least 5).

Write a method calculateAverage Salary(String department) that takes a department name as input and returns the average salary of employees in that department. If there are no employees in the department, return 0.

Display the details of all employees and the average salary for a specific department entered by the user.

Example output:

Employees:

Name: Alice, Department: IT, Salary: 70000

Name: Bob, Department: HR, Salary: 50000

Name: Carol, Department: IT, Salary: 75000

Name: David, Department: Sales, Salary: 60000

Name: Eve, Department: Sales, Salary: 62000

Enter department to calculate average salary: IT

Average Salary in IT: 72500.0
 */
package encapsulationPackage;
import java.util.*;
public class AverageSalary 
{
	private String name;
	private String department;
	private double salary;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	public AverageSalary(String name, String department, double salary) {
		super();
		this.name = name;
		this.department = department;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "AverageSalary [name=" + name + ", department=" + department + ", salary=" + salary + "]";
	}
	public static double returnAvg(String dep,List<AverageSalary> li)
	{
		double average=0;
		int cnt=0;
		for(AverageSalary avg:li)
		{
			if(dep.equals(avg.getDepartment()))
			{
				average+=avg.getSalary();
				cnt++;
			}
		}
		for(AverageSalary avg:li)
		{
			System.out.println(avg);
		}
		return average/cnt;
	}
	public static void main(String[] args) 
	{
		AverageSalary avgSal1 = new AverageSalary("Sangramsingh", "IT", 400000.20);
		AverageSalary avgSal2 = new AverageSalary("Raj", "Sales", 300000.50);
		AverageSalary avgSal3 = new AverageSalary("Harshavrdhan", "Sales", 450000.70);
		AverageSalary avgSal4 = new AverageSalary("Tejas", "IT", 500000.20);
		AverageSalary avgSal5 = new AverageSalary("Satyam", "HR", 400000.20);
		AverageSalary avgSal6 = new AverageSalary("Omkar", "HR", 500000.50);
		AverageSalary avgSal7 = new AverageSalary("Aditya", "IT", 200000.70);
		System.out.println(avgSal1.toString());
		List<AverageSalary> li = new ArrayList<>();
		li.add(avgSal1);
		li.add(avgSal2);
		li.add(avgSal3);
		li.add(avgSal4);
		li.add(avgSal5);
		li.add(avgSal6);
		li.add(avgSal7);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter department Name: ");
		String dep = sc.next();
		System.out.println("------------------------------");
		System.out.println("Average Salary in "+dep+": "+returnAvg(dep, li));
		sc.close();
	}
}
