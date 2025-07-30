package sec02.exam06;

public class UserServiceExample {

	public static void main(String[] args) {
		UserService userService = new UserService();
		
		try {
			userService.registerUser(10);
			userService.registerUser(-5);			
		} catch (InvalidAgeException e) {
			System.out.println("예외 발생: " + e.getMessage());
		}
	}

}
