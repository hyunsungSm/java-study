package sec01.exam04.quiz;

import java.util.Objects;

public class Student {
	private int studentNo;
	private String name;
	private String major;
	
	
	public Student(int studentNo, String name, String major) {
		this.studentNo = studentNo;
		this.name = name;
		this.major = major;
	}
	
	@Override
	public String toString() {
		return "[학번=" + studentNo + ", 이름=" + name + ", 전공=" + major + "]";
	}
	
	
	@Override
	public boolean equals(Object obj) {
		// Early Return Pattern
		if (this == obj) return true; // 같은 참조이면 true
		if (!(obj instanceof Student)) return false; // Student 타입의 인스턴스가 아니면 false
		
		Student student = (Student) obj;
		return this.studentNo == student.studentNo && this.name.equals(student.name);
	}
	
	// 동등 객체를 판단할 때
	// equals()를 오버라이딩하면 hashCode()도 함께 오버라이딩하는 것이 일반적
	@Override
	public int hashCode() {
		return Objects.hash(studentNo, name);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Student) {
//			Student student = (Student) obj;
//			if (name.equals(student.name) && studentNo == student.studentNo) {
//				return true;
//			}
//		}
//		return false;
//	}
	
}
