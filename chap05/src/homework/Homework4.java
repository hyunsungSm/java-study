package homework;

import java.util.Arrays;

public class Homework4 {

	public static void main(String[] args) {
		int count = 0;
		int lotto[] = new int[6];
		int num = 0;
		boolean dupli = false;
		
		while (count < 6) {
			num = (int) (Math.random() * 45 +1);
			for (int i = 0; i < count; i++) {
				if (lotto[i] == num) {
					dupli = true;
					break;
				}
			}
			if (!dupli) {
				lotto[count] = num;
				count++;
			}
		}
		
		Arrays.sort(lotto);
		
		for (int n : lotto) {
			System.out.print(n + " ");
		}
		
	}

}
