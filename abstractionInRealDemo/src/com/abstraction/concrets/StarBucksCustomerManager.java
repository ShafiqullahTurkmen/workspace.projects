package com.abstraction.concrets;

import com.abstraction.abstracts.ICustomerDalService;
import com.abstraction.abstracts.ICustomerIDCheckService;
import com.abstraction.abstracts.ICustomerService;
import com.abstraction.entities.Customer;

public class StarBucksCustomerManager implements ICustomerService {

	private ICustomerIDCheckService checkCustomer;
	private ICustomerDalService     customerDal;
	
	
	
	
	public StarBucksCustomerManager(ICustomerIDCheckService checkCustomer, ICustomerDalService customerDal) {
		super();
		this.checkCustomer = checkCustomer;
		this.customerDal = customerDal;
	}




	@Override
	public void add(Customer customer) {

		if (checkCustomer.checkIfRealPerson(customer)) {
			customerDal.add(customer);
		} else {
			System.out.println("Invalid Person to add: " + customer.getFirstName() + " " + customer.getLastName());
		}
	}

}
