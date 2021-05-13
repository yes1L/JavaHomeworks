package day5Homework1;

import day5Homework1.business.concretes.AuthManager;
import day5Homework1.business.concretes.UserManager;
import day5Homework1.core.GoogleAdapters;
import day5Homework1.dataAccess.concretes.HibernateUserDao;
import day5Homework1.entities.concretes.User;
import day5Homework1.entities.concretes.UserDto;

public class Main {

	public static void main(String[] args) {
		User user1 = new User();
		user1.setId(1);
		user1.setFirstName("Mustafa");
		user1.setLastName("Yeþil");
		user1.setEmail("mustafa@gmail.com");
		user1.setPassword("12345");
		
		User user2 = new User();
		user2.setId(2);
		user2.setFirstName("Rabia");
		user2.setLastName("Gül");
		user2.setEmail("rabia@gmail.com");
		user2.setPassword("54722");
		
		User user3 = new User();
		user3.setId(3);
		user3.setFirstName("Engin");
		user3.setLastName("Demiroð");
		user3.setEmail("engin@gmail.com");
		user3.setPassword("12458");
		
		User user4 = new User();
		user4.setId(4);
		user4.setFirstName("Berkay");
		user4.setLastName("Meke");
		user4.setEmail("berkay@gmail.com");
		user4.setPassword("58172");
		
		UserManager userManager = new UserManager(new HibernateUserDao(), new GoogleAdapters());
		userManager.add(user1);
		
		AuthManager authManager = new AuthManager(new UserManager(new HibernateUserDao(), new GoogleAdapters()));
		
		userManager.getAll();
		
		UserDto userDto = new UserDto();
		userDto.setEmail("mustafa518@hotmail.com");
		userDto.setPassword("374201");
		
		authManager.login(userDto);
		
		UserDto userDto2 = new UserDto();
		
		userDto2.setEmail("rabia42@gmail.com");
		userDto2.setPassword("547");
	}

}
