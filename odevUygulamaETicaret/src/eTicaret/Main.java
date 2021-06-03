package eTicaret;

import eTicaret.business.abstracts.UserService;
import eTicaret.business.concrete.EmailUserManager;
import eTicaret.business.concrete.GoogleUserManager;
import eTicaret.business.concrete.SendVerificationEmail;
import eTicaret.dataAccess.concrete.EmailUserDao;
import eTicaret.dataAccess.concrete.GoogleUserDao;
import eTicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {

//		üyelik sonucunu bildiren e posta loglama yapýlacak

		User user1 = new User();
		user1.setFirstName("Ali");
		user1.setLastName("Tarak");
		user1.setEmail("ali@gmail.com");
		user1.setPassword("qwer1234");
		
		User user2 = new User();
		user2.setFirstName("Veli");
		user2.setLastName("Aslan");
		user2.setEmail("Veli@gmail.com");
		user2.setPassword("asdf5678");
	
		UserService userManager = new EmailUserManager(new EmailUserDao(), new SendVerificationEmail());
		userManager.register(user1);
//		userManager.register(user2);
		userManager.login(user1);
		
		UserService userManager2 = new GoogleUserManager(new GoogleUserDao());
		userManager2.register(user1);
		userManager2.login(user2);
	}

}
