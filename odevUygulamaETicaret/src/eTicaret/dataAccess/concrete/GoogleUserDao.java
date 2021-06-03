package eTicaret.dataAccess.concrete;

import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class GoogleUserDao implements UserDao{
	
	@Override
	public void register(User user) {
		System.out.println("Tebrikler kaydýn baþarýyla gerçekleþti.");	
	}

	@Override
	public void login(User user) {
		System.out.println("Giriþ Baþarýlý.");
	}

}
