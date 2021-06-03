package eTicaret.dataAccess.abstracts;

import eTicaret.entities.concretes.User;

public interface UserDao {

	void register(User user);

	void login(User user);
}
