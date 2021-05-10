package day4Homework2;

import java.time.LocalDate;

import interfaceAbstractDemo.Abstract.BaseCustomerManager;
import interfaceAbstractDemo.Abstract.ICustomerService;
import interfaceAbstractDemo.concrete.CustomerCheckManager;
import interfaceAbstractDemo.concrete.NeroCustomerManager;
import interfaceAbstractDemo.concrete.StarbucksCustomerManager;
import interfaceAbstractDemo.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new CustomerCheckManager());
		customerManager.save(new Customer(1, "Mustafa", "Yeþil", LocalDate.of(1999, 7, 06), "12345678910"));

	}

}