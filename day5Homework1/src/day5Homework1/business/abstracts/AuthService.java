package day5Homework1.business.abstracts;

import day5Homework1.entities.concretes.User;
import day5Homework1.entities.concretes.UserDto;

public interface AuthService {
	void register(User user);
	
	void login(UserDto userDto);
	
	boolean userExist(String email);
}
