package day4Homework2.concrete;

import day4Homework2.abstracts.BaseCustomerManager;
import day4Homework2.abstracts.CustomerCheckService;
import day4Homework2.entities.Customer;

public class StarbucksCustomerManager extends BaseCustomerManager{
	
	private CustomerCheckService customerCheckService;
	
	public StarbucksCustomerManager(CustomerCheckService customerCheckService) {
		this.customerCheckService = customerCheckService;
	}
	
	@Override
	public void save(Customer customer) {
		
		if(customerCheckService.checkIfRealPerson(customer)) {
			System.out.println("Saved to db : " + customer.getFirstName());
		}else {
			System.out.println("Müþteri kayýt edilemedi.");
		}
	}
}