package homeworkInheritence.exam01;

public class Student extends Person {
	private int grade;
	private String major;

	public void Person(){
	}
	
	public void Person(String name, int age, double height, double weight, int grade, String major){
		this.grade = grade;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return super.toString() + "학년: " + grade + "\n" +
								  "전공: " + major + "\n";
	}
}
