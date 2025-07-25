package homework;

public class PersonExample {

	public static void main(String[] args) {
		Person person = new Person("김철수", 20);
		
		Person2 person2 = new Person2();
		
		person2.setName("김철수");
		person2.setAge(20);
			
		System.out.println(person2.getName()+ "는 " + person2.getAge() + "살 입니다.");
		
	}

}
