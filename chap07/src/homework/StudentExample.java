package homework;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
		
		s1.studentNo();
		s2.studentNo();
		s3.studentNo();
		
		s1.setStudentName("김철수");
		s2.setStudentName("홍길동");
		s3.setStudentName("이영희");
		
		s1.setClassName("A");
		s2.setClassName("F");
		s3.setClassName("B");
		
		System.out.println(s1.studentNo + " " + s1.getStudentName() + " " + s1.getClassName());
		System.out.println(s2.studentNo + " " + s2.getStudentName() + " " + s2.getClassName());
		System.out.println(s3.studentNo + " " + s3.getStudentName() + " " + s3.getClassName());
	}

}
