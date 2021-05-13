package day5Homework1.business.concretes;

import day5Homework1.business.abstracts.AuthService;
import day5Homework1.business.abstracts.UserService;
import day5Homework1.entities.concretes.User;
import day5Homework1.entities.concretes.UserDto;
import day5Homework1.core.Regex;

public class AuthManager implements AuthService{
	
	private UserService userService;
	

	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userCheckIfNull(user)&&userExist(user.getEmail())&&checkIfPassword(user.getPassword())
				&&Regex.emailValidate(user.getEmail())) {
			userService.add(user);
		}else {
			System.out.println("Registered is failed");
		}
		
	}

	@Override
	public void login(UserDto userDto) {
		User user = userService.getByMail(userDto.getEmail());
		
		if(user != null && user.getPassword().equals(userDto.getPassword()) && loginNullControl(userDto)) {
			System.out.println("Login successful");
		}else {
			System.out.println("Login is failed");
		}
		
	}

	@Override
	public boolean userExist(String email) {
		if(userService.getByMail(email) != null) {
			System.out.println("User already exist");
			return false;
		}
		return true;
	}
	
	public boolean userCheckIfNull(User user) {
		if(user != null &&! user.getFirstName().isEmpty() &&! user.getLastName().isEmpty()
				&&! user.getEmail().isEmpty() &&! user.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}
	
	public boolean checkIfPassword(String password) {
		if(password.length() < 6) {
			System.out.println("Password must be equals or grater than 6");
			return false;
		}
		return true;
	}

	public boolean loginNullControl(UserDto userDto) {
		if(!userDto.getEmail().isEmpty()&&!userDto.getPassword().isEmpty()) {
			return true;
		}
		return false;
	}

}
