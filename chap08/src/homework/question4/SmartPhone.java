package homework.question4;

public abstract class SmartPhone implements CellPhone, TouchDisplay{
	private String name;
	
	public SmartPhone(String name) {
		this.name = name;
	}
	
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public abstract void printMaker();
}
