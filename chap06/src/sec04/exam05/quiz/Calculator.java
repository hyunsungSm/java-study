package sec04.exam05.quiz;

public class Calculator {
	int begin;
	int end;
	int total;
	
	
	int getEvenTotal(int begin, int end) {
		for(begin = 0; begin <= end; begin++) {
			if (begin % 2 == 0) {
				total += begin;
				
			}	
		}
		return total;
	}
}
