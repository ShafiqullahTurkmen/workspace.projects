package com.abstraction.concrets;

import com.abstraction.abstracts.ICustomerDalService;
import com.abstraction.entities.Customer;

public class MsSqlCustmerDalManager implements ICustomerDalService {

	@Override
	public void add(Customer customer) {

		System.out.println("Muşteri adi: " + customer.getFirstName() + " " + customer.getLastName());
		System.out.println("MsSql veri tabanına kayd edildi");
	}

}
