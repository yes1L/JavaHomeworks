package day4Homework2.abstracts;

import day4Homework2.entities.Customer;

public abstract class BaseCustomerManager implements CustomerService{

	@Override
	public void save(Customer customer) {
		System.out.println("Saved to db : " + customer.getFirstName());
	}

}
