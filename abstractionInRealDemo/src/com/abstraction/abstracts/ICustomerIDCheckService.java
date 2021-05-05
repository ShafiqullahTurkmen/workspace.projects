package com.abstraction.abstracts;

import com.abstraction.entities.Customer;

public interface ICustomerIDCheckService {
	
	public boolean checkIfRealPerson(Customer customer);

}
