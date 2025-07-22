package homework;

import java.util.Arrays;

public class Homework1 {

	public static void main(String[] args) {
		int[] student = {152, 180, 165, 158, 171};
		
		int height = 0;
		int temp = 0;
		for (int i = 0; i < student.length; i++) {
			for (int j = i; j < student.length; j++) {
				if (student[i] > student[j]) {
					temp = student[j];
					student[j] = student[i];
					student[i] = temp;
				}
				height= student[i];
			}
			System.out.print(height + " ");
		}
	}

}
