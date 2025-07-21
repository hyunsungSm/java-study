package homeworkRepetition;

public class homework6 {

	public static void main(String[] args) {
		int height = 5;
		
		for (int i = 1; i <= height; i++) {
			
			for(int j = 1; j <= height - i; j++) {
				System.out.print(" ");
				
			}
				for (int h = 1; h <= 2 * i - 1; h++) {
					System.out.print("*");
			}
			System.out.println();
		}
	}

}
