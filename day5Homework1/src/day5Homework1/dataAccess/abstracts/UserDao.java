package day5Homework1.dataAccess.abstracts;

import java.util.List;

import day5Homework1.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	User getByEmail(String email);
	List<User> getAll();
	User getByEmailandPassword(String email, String password);
	
	void join(User user);
}
