package homework;

import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		int[] student = {152, 180, 165, 158, 171};
		
		int height = 0;
		int temp = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = i+1; j < student.length; j++) {
				if (student[i] > student[j]) {
					temp = student[i];
					student[i] = student[j];
					student[j] = temp;
				}
				height= student[i];
			}
			System.out.print(height + " ");
		}
	}

}
