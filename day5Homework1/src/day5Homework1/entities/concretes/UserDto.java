package day5Homework1.entities.concretes;

import day5Homework1.entities.abstracts.Dto;

public class UserDto implements Dto{
	private String email;
	private String password;
	
	public UserDto() {}

	public UserDto(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
