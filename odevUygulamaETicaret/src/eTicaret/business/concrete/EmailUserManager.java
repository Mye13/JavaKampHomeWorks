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
			System.out.println("B�t�n alanlar�n doldurulmas� zorunludur!");
		} else if (user.getFirstName().length() < 2 || user.getLastName().length() < 2) {
			System.out.println("Kullan�c� ad� ve soyad� k�s�mlar� en az 2 karakterden olu�mal�d�r!");
		} else if (user.getPassword().length() < 6) {
			System.out.println("Parola en az 6 karakterden olu�mal�d�r!");
		} else if (matcher.matches() == false) {
			System.out.println("Girdi�iniz e posta adresi hatal�d�r! �rnek e posta adresi : Ornek123@gmail.com");
		} else {
			for (String email : emails) {
				if (user.getEmail() == email) {
					System.out
							.println("Girdi�iniz e posta adresi kullan�mdad�r! L�tfen ba�ka bir e posta adresi girin.");
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
				System.out.println("Sisteme giri� yapabilmek i�in kayd�n�z� onaylaman�z gerekiyor!");
			}
				
			
		}
	}

	@Override
	public void login(User user) {
		if (user.getEmail().isEmpty() || user.getPassword().isEmpty()) {
			System.out.println("Eposta ve parola alanlar�n�n iksininde doldurulmas� zorunludur!");
		} else {
			for (String email : emails) {
				if (user.getEmail() == email) {
					for(String password : passwords) {
						if(user.getPassword() == password) {
							System.out.println("Giri� ba�ar�l�.");
							//System.out.println("Kullan�c� e posta adresi : " + user.getEmail()); Bu iki sat�r kullan�c� epostas� ve �ifresi ger�ekten 
							//System.out.println("Kullan�c� �ifresi : " + user.getPassword());     e�le�iyormu yani do�ru eposta ve ona ait �ifre testi i�in.
							return;
						}
					}
				}
			}
			System.out.println("Gidi�iniz bilgiler hatal�d�r!");
		}
	}

}
