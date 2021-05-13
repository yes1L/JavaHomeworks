package day5Homework1.business.abstracts;

import java.util.List;

import day5Homework1.entities.concretes.User;

public interface UserService {
	void add (User user);
	User getByMail(String email);
	List<User> getAll();
}
