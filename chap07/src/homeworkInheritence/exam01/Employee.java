package homeworkInheritence.exam01;

public class Employee extends Person{
	private int salary;
	private String dept;

	
	public Employee(String name, int age, double height, double weight, int salary, String dept) {
		super(age, height, weight);
		this.dept = dept;
		this.salary = salary;
	}
	
	
	
}
