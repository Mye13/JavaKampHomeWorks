package eTicaret.dataAccess.concrete;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class EmailUserDao implements UserDao {

	@Override
	public void register(User user) {
		System.out.println("Tebrikler : " + user.getFirstName() + " kayd�n ba�ar�yla ger�ekle�ti.");
	}

	@Override
	public void login(User user) {
		System.out.println(user.getFirstName() + user.getLastName() + " Giri� Ba�ar�l�.");
	}

}
