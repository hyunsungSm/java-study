package homeworkField;

public class Homework1 {
	public String name;
	public String team;
	String grade;
	int money;
	private int bonus;
	
	
	void employee(String name, String team){
		this.name = name;
		this.team = team;
		System.out.println("이름: " + name + ", 팀: " + team);
	}

}
