package eTicaret.business.concrete;

import eTicaret.business.abstracts.SendVerificationService;
import eTicaret.entities.concretes.User;

public class SendVerificationEmail implements SendVerificationService{
	
	//Loglama sistemi yerine keyfi olarak farkl�l�k yapt�m ayn� sistemi log yap�s�yla kurabilirsiniz :)
	
	@Override
	public void sendEmail(User user) {
		System.out.println(user.getEmail() + " adresine do�rulama e postas� g�nderildi. Kayd�n�z�n tamamlanmas� i�in l�tfen hesab�n�z� onaylay�n.");
	}

}
