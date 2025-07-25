package homework;

public class Student {
	private static int count = 0;
	int studentNo;
	String studentName;
	String className;

	public void studentNo() {
		count++;
		this.studentNo = count;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}
}
