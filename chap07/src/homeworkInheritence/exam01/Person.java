package homeworkInheritence.exam01;

public class Person {
	public String name;
	private int age;
	private double height;
	private double weight;

	public Person(int age, double height, double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public void getInfo() {
		System.out.println("=== " + name + " ===");
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("몸무게: " + weight);
	}
}
