package eTicaret.business.concrete;

import eTicaret.business.abstracts.SendVerificationService;
import eTicaret.entities.concretes.User;

public class SendVerificationEmail implements SendVerificationService{
	
	//Loglama sistemi yerine keyfi olarak farklýlýk yaptým ayný sistemi log yapýsýyla kurabilirsiniz :)
	
	@Override
	public void sendEmail(User user) {
		System.out.println(user.getEmail() + " adresine doðrulama e postasý gönderildi. Kaydýnýzýn tamamlanmasý için lütfen hesabýnýzý onaylayýn.");
	}

}
