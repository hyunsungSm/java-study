package sec03.exam04.quiz;

// Quiz
// 다른 생성자를 호출하는 this()를 써서 리팩토링 해보세요.

public class Animal {
	String kind;
	int age;

	public Animal(int age){
		this("사람", age);
//		this.kind = "사람";
//		this.age = age;
	}
	
	public Animal(String kind){
		this(kind, 1);
//		this.kind = kind;
//		this.age = 1;
	}
	
	public Animal(String kind, int age){
		this.kind = kind;
		this.age = age;
	}
	
	// 출력 메소드
    public void info() {
        System.out.println(kind + ": " + age + "살");
    }
}
