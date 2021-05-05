package com.abstraction.maindemo;

import com.abstraction.abstracts.ICustomerDalService;
import com.abstraction.abstracts.ICustomerIDCheckService;
import com.abstraction.abstracts.ICustomerService;
import com.abstraction.concrets.MernisCustomerCheckManager;
import com.abstraction.concrets.MsSqlCustmerDalManager;
import com.abstraction.concrets.StarBucksCustomerManager;
import com.abstraction.entities.Customer;

public class Main {

	public static void main(String[] args) {
		
		//Müşteri bigileri
		Customer customer = new Customer(1, "Engin", "Demiroğ", "28861499108", 1985);
		
		//Müşteri bilgilerini doğrulama Servisi
		ICustomerIDCheckService checkCustomer = new MernisCustomerCheckManager();
		
		//Veritabanı 
		ICustomerDalService customerDal   = new MsSqlCustmerDalManager();
		
		//Muşteri kayd yapan şirket
		ICustomerService  customerManager = new StarBucksCustomerManager(checkCustomer, customerDal);
		customerManager.add(customer);
		
		
	}

}
