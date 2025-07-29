package homeworkInheritence.exam01;

public class Run {

	public static void main(String[] args) {
		Person[] person = new Person[3];
		person[0] = new Student();
		person[1] = new Student();
		person[2] = new Student();

		for (Person s : person) {
			System.out.println("=== " + s.getName() + " ===");
		}
	}

}
