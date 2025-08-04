package homework.question1;

public class Run {

	public static void main(String[] args) {
		String str ="김철수,25,동작구,남\n홍길동,27,관악구,남\n이영희,29,강서구,여";
		String[] persons = str.split("\n");
		persons = str.split(",");
		
		for (int i = 0; i < 3; i++) {
			System.out.println(persons[i]);
		}
		
		
		
	}	
}
