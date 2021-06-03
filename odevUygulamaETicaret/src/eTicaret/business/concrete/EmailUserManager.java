package eTicaret.business.concrete;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import eTicaret.business.abstracts.SendVerificationService;
import eTicaret.business.abstracts.UserService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class EmailUserManager implements UserService{

	private UserDao userDao;
	private SendVerificationService sendVerificationService;
	
	public EmailUserManager(UserDao userDao, SendVerificationService sendVerificationService) {
		super();
		this.userDao = userDao;
		this.sendVerificationService = sendVerificationService;
	}

	private ArrayList<String> emails = new ArrayList<String>();
	private ArrayList<String> passwords = new ArrayList<String>();

	@Override
	public void register(User user) {

		String emailType = "^[\\w\\-]([\\.\\w])+[\\w]+@([\\w\\-]+\\.)+[A-Z]{2,4}$";
		Pattern pattern = Pattern.compile(emailType, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(user.getEmail());
		
		if (user.getFirstName().isEmpty() || user.getLastName().isEmpty() || user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Bütün alanlarýn doldurulmasý zorunludur!");
		} else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Kullanýcý adý ve soyadý kýsýmlarý en az 2 karakterden oluþmalýdýr!");
		} else if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden oluþmalýdýr!");
		} else if (matcher.matches() == false) {
			System.out.println("Girdiðiniz e posta adresi hatalýdýr! Örnek e posta adresi : Ornek123@gmail.com");
		} else {
			for (String email : emails) {
				if (user.getEmail() == email) {
					System.out
							.println("Girdiðiniz e posta adresi kullanýmdadýr! Lütfen baþka bir e posta adresi girin.");
					return;
				}
			}
			this.sendVerificationService.sendEmail(user);
			boolean verification = true;
			if(verification) {
				emails.add(user.getEmail());
				passwords.add(user.getPassword());
				this.userDao.register(user);
			}else {
				System.out.println("Sisteme giriþ yapabilmek için kaydýnýzý onaylamanýz gerekiyor!");
			}
				
			
		}
	}

	@Override
	public void login(User user) {
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Eposta ve parola alanlarýnýn iksininde doldurulmasý zorunludur!");
		} else {
			for (String email : emails) {
				if (user.getEmail() == email) {
					for(String password : passwords) {
						if(user.getPassword() == password) {
							System.out.println("Giriþ baþarýlý.");
							//System.out.println("Kullanýcý e posta adresi : " + user.getEmail()); Bu iki satýr kullanýcý epostasý ve þifresi gerçekten 
							//System.out.println("Kullanýcý þifresi : " + user.getPassword());     eþleþiyormu yani doðru eposta ve ona ait þifre testi için.
							return;
						}
					}
				}
			}
			System.out.println("Gidiðiniz bilgiler hatalýdýr!");
		}
	}

}
