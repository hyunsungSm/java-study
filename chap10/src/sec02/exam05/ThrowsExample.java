package sec02.exam05;

public class ThrowsExample {

	// main()을 호출하는 JVM 쪽으로 예외를 떠넘기기
	// => 콘솔에 예외 내용을 출력하고 프로그램 종료
//	public static void main(String[] args) throws ClassNotFoundException{
	public static void main(String[] args){
		try {
			findClass();
		} catch (ClassNotFoundException e) { // e: 예외 객체
			System.out.println("클래스가 존재하지 않습니다.");
			
			// 다양한 예외 출력 방법
			System.out.println(e.getMessage()); // 예외 메시지 출력(예외 객체를 만들 때 매개값으로 사용한 메시지)
			System.out.println(e.toString()); // 예외 클래스 이름과 메시지를 함께 출력
			System.out.println(e); // toString() 생략 가능
			e.printStackTrace(); // 호출 스택을 추적하여 콘솔에 출력(개발 시에만 디버깅 용도로 사용)
		}
	}

	// 직접 처리하지 않고 "호출한 쪽에서 다양한 방식으로 처리할 수 있도록" 예외 떠넘기기
	// 이렇게 하면 호출한 쪽에서 더 적절한 방식으로 대응할 수 있음(예: 로그 남기기, 사용자에게 알림, 재시도 등)
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
}
