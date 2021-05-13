package day5Homework1.dataAccess.concretes;

import java.util.ArrayList;
import java.util.List;

import day5Homework1.dataAccess.abstracts.UserDao;
import day5Homework1.entities.concretes.User;

public class HibernateUserDao implements UserDao{
	
	private List<User> users = new ArrayList<User>();
	
	public HibernateUserDao() {
		User user1 = new User(1,"Mustafa","Yeþil","yesil@gmail.com","12345",true);
		User user2 = new User(2,"Rabia","Gül","rabia@gmail.com","54722",true);
		users.add(user1);
		users.add(user2);
	}

	@Override
	public void add(User user) {
		System.out.println("Added by Hibernate : " + user.getFirstName());
		
	}

	@Override
	public void delete(User user) {
		System.out.println("Deleted by Hibernate : " + user.getFirstName());
		
	}

	@Override
	public void update(User user) {
		System.out.println("Updated by Hibernate : " + user.getFirstName());
		
	}

	@Override
	public User getByEmail(String email) {
		for(User user : users) {
			if(user.getEmail()==email) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User getByEmailandPassword(String email, String password) {
		for(User user : users) {
			if(user.getEmail()==email&&user.getPassword()==password) {
				return user;
			}
		}
		return null;
	}

	@Override
	public void join(User user) {
		System.out.println("User joined : " + user.getFirstName());
		
	}

}
