package day4Homework2.concrete;

import day4Homework2.CustomerCheckService;
import day4Homework2.entities.Customer;

public class CustomerCheckManager implements CustomerCheckService{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		return true;
	}

}
