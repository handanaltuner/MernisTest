

package tr.gov.nvi.tckimlik.WS;

import java.rmi.RemoteException;

//import java.rmi.RemoteException;

public class Main {

	public static void main(String[] args) throws RemoteException{
	

		
		
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		boolean result = kpsPublic.TCKimlikNoDogrula(
				
				Long.parseLong("450XXXXXXXXX"),
				"HANDAN",
					"ALTUNER",
					1985);
		System.out.println("dogrulama : " + (result ? "baþarýlý" : "baþarýsýz"));
				
				
	}

}
