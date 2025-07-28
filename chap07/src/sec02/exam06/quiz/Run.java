package sec02.exam06.quiz;

public class Run {
	// Quiz
//	구현 클래스 설명
//	1. SchoolMember(부모 클래스)
//		+ void introduce(): "안녕하세요, 학교 구성원입니다." 표준 출력
//	2. Staff(자식 클래스)
//	    + void introduce(): "안녕하세요, 직원입니다." 표준 출력
//	    + void work(): "일하는 중입니다." 표준 출력
//	3. Student(자식 클래스)
//	    + void introduce(): "안녕하세요, 학생입니다." 표준 출력
//	    + void study(): "공부하는 중입니다."표준 출력
//	4. Teacher(자식 클래스)
//	    + void introduce(): "안녕하세요, 선생님입니다." 표준 출력
//	    + void teach(): "수업을 하고 있습니다." 표준 출력
//	5. Run
//	    길이 3의 SchoolMember 객체를 담는 배열 생성
//	    0번 인덱스에는 Student, 1번 인덱스는 Teacher, 2번 인덱스는 Staff 객체 추가
//	    for each문으로 모든 구성원 소개글 출력 및
//	    각 객체의 타입에 맞게 work(), study(), teach() 메소드 호출
//	
//	[출력]
//	안녕하세요, 학생입니다.
//	공부하는 중입니다.
//	안녕하세요, 선생님입니다.
//	수업을 하고 있습니다.
//	안녕하세요, 직원입니다.
//	일하는 중입니다.
	
	public static void main(String[] args) {
		SchoolMember[] schoolMembers = new SchoolMember[3];
		schoolMembers[0] = new Student();
		schoolMembers[1] = new Teacher();
		schoolMembers[2] = new Staff();
		
		// 모든 구성원 소개
		for (SchoolMember s : schoolMembers) {
			s.introduce();
			if (s instanceof Student student) {
				student.study();
			} else if(s instanceof Teacher teacher) {
				teacher.teach();
			} else if(s instanceof Staff staff){
				staff.work();
			}
		}
	}

}
