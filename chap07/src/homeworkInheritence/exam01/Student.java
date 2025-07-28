package homeworkInheritence.exam01;

public class Student extends Person{
	private int grade;
	private String major;
	
	
	public Student(String name, int age, double height, double weight, int grade, String major) {
		super(age, height, weight);
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("학년: " + grade);
		System.out.println("전공: " + major);
	}
	
}
