package homeworkField;

public class Homework2 {
	private String name;
	private String address;
	protected String phone;
	protected double height;
	protected double weight;
	
	void person(String phone, double height, double weight){
		this.phone = phone;
		this.height = height;
		this.weight = weight;
		System.out.println("전화번호: " + phone + " 키: " + height + " 몸무게: " + weight);
	}

}
