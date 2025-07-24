package sec05.exam06;

public class Earth {
	// 불변의 값 상수 만들기
	// 관례적으로 모두 대문자로 작성, 단어와 단어 사이는 언더바로 연결
	static final double EARTH_RADIUS = 6400;
	static final double EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	static final double EARTH_AREA;
	
	// 생성자에서 초기화 할 수 없음
	// 이유? 생성자는 객체 생성 시 호출되어 초기화 하기 때문
//	public Earth() {
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	}
	
	// (참고만) 선언 시 초기화를 안했을 경우 static 블록에서 초기화 가능
//	static {
//		EARTH_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
//	}
	
}
