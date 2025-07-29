package homeworkInheritence.exam01;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {
	}
	
	public String getName() {
		return name;
	}
	
	public Person(int age, double height, double weight){
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	@Override
	public String toString() {
		return  "나이: " + age + "\n" + 
				"키: " + height + "\n" + 
				"몸무게: " + weight + "\n";
	}
	
}
