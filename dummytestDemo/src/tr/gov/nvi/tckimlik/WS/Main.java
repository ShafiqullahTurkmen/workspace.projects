package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{

KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong("99378141170"), "SHAFIQULLAH", "TURKMEN", 1992);
		
		System.out.println("Doğrulama : " + (result ? "başarılı" : "başarısız"));
	}

}
