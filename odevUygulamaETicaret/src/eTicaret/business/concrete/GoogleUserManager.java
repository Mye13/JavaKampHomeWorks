package eTicaret.business.concrete;

import eTicaret.business.abstracts.UserService;
import eTicaret.dataAccess.abstracts.UserDao;
import eTicaret.entities.concretes.User;

public class GoogleUserManager implements UserService{

	private UserDao userDao;

	public GoogleUserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}
	
	@Override
	public void register(User user) {
		// Google �zel ekleme kodlar�
		this.userDao.register(user);
	}

	@Override
	public void login(User user) {
		// Google �zel ekleme kodlar�	
		this.userDao.login(user);
	}

}
