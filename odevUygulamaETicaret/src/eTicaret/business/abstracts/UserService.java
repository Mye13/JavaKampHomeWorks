package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface UserService {
	
	void register(User user);

	void login(User user);
}
