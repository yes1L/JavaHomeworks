package day4Homework2.abstracts;

import day4Homework2.entities.Customer;

public interface CustomerCheckService {
	boolean checkIfRealPerson(Customer customer);
}