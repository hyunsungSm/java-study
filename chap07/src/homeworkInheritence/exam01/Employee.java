package homeworkInheritence.exam01;

public class Employee extends Person {
	private int salary;
	private String dept;
	
	public Employee() {
	}
	
	public Employee(String name, int age, double height, double weight, int salary, String dept){
		this.dept = dept;
		this.salary = salary;
	}
	
	
	
	
}
