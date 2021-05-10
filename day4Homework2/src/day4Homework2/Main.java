package day4Homework2;

import java.time.LocalDate;

import day4Homework2.abstracts.BaseCustomerManager;
import day4Homework2.abstracts.CustomerService;
import day4Homework2.concrete.CustomerCheckManager;
import day4Homework2.concrete.NeroCustomerManager;
import day4Homework2.concrete.StarbucksCustomerManager;
import day4Homework2.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "Mustafa", "Yeþil", LocalDate.of(1999, 7, 06), "12345678910"));

	}

}