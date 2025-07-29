package homework.question4;

public class Run {

	public static void main(String[] args) {
		SmartPhone[] smartPhone = new SmartPhone[2];
		smartPhone[0] = new GalaxyS24();
		smartPhone[1] = new IPhone15();
		
		for (SmartPhone phone : smartPhone) {
			phone.printMaker();
			phone.makeCall();
			phone.takeCall();
			phone.touch();
			phone.charge();
			phone.picture();
			System.out.println();
		}
	}

}
