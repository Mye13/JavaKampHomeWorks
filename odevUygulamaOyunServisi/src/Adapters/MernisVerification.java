package Adapters;

import java.rmi.RemoteException;

import Abstract.GamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisVerification implements GamerCheckService {

	@Override
	public boolean CheckIsRealPerson(Gamer gamer) {

		KPSPublicSoap soapClient = new KPSPublicSoapProxy();

		boolean check = false;

		try {
			check = soapClient.TCKimlikNoDogrula(Long.parseLong(gamer.getNationaltiyId()),
					gamer.getFirstName().toUpperCase(), gamer.getLastName().toUpperCase(),
					gamer.getBirthDay().getYear());
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (RemoteException e) {
			e.printStackTrace();
		}

		return check;
	}

}
