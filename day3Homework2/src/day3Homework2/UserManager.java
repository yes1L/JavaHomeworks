package day3Homework2;

public class UserManager {
	public void login(User user) {
		System.out.println(user.getFirstName()+": Giriþ yaptý");
	}
	
	public void logout(User user) {
		System.out.println(user.getFirstName()+": Çýkýþ yaptý");
	}
}