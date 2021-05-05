package com.abc.demointro;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )  throws RemoteException {
    	KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("99378141170"), "Shafiqullah", "Turkmen", 1992);
		
		boolean nresult = kpsPublic.TCKimlikNoDogrula(Long.parseLong("28861499108"), "Engin", "Demiroğ", 1985);

		
		System.out.println("Doğrulama : " + (result ? "başarılı" : "başarısız"));  
		
		System.out.println("Doğrulama : " + (nresult ? "başarılı" : "başarısız"));  

		
		
		}
    
 
}
