package homework.question2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LotteryController {
	Set<Lottery> lottery = new HashSet<Lottery>();
	Set<Lottery> win = new HashSet<Lottery>();
	
	public boolean insertObject(Lottery l) {
		return lottery.add(l);
	}
	
	public boolean deleteObject(Lottery l) {
		boolean result;
		result = lottery.remove(l);
		
		if (result == true && win != null) {
			win.remove(l);
		}
		return result;
	}
	
	public Set<Lottery> searchObject(){
		return lottery;
	}
	
	public Set<Lottery> winObject(){
		if (lottery.size() < 4) {
			return null;
		}
		
		List<Lottery> lotteryList = new ArrayList<Lottery>(lottery);
		
		lotteryList.removeAll(win);
		
		int index = 4 - lottery.size();
		
		if (index > 0 && lotteryList.size() >= index) {
			Collections.shuffle(lotteryList);
			for (int i = 0; i < index; i++) {
				win.add(lotteryList.get(i));
			}
		}
		return win;
	}
	
	public Set<Lottery> sortedWinObject(){
		// 1. 이름을 오름차순으로 정렬
		// 이름이 같으면 번호로 오름차순 정렬
		// 정렬의 결과를 반환
		// 이때, 미리 만들어진 win을 가지고 정렬
		List<Lottery> winList = new ArrayList<Lottery>(win);
		Collections.sort(winList);
		return win;
	}
	
	public boolean searchWinner(Lottery l) {
		// 1. win에 해당 객체가 있는지 확인
		// 2. 결과 boolean을 리턴
		return win.contains(l);
	}

}
