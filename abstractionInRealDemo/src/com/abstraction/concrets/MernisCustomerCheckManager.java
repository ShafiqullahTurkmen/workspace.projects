package com.abstraction.concrets;

import java.rmi.RemoteException;

import com.abstraction.abstracts.ICustomerIDCheckService;
import com.abstraction.entities.Customer;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisCustomerCheckManager implements ICustomerIDCheckService{

	
	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

		try {
			return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getDateOfBirthInYear());
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		} catch (RemoteException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return false;
		}
	}

}
