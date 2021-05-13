package day5Homework1.core;

import day5Homework1.entities.concretes.UserDto;

public interface GoogleAuthService {
	void registered(String email);
	void login(UserDto userDto);
	void userExist(String email);
}
