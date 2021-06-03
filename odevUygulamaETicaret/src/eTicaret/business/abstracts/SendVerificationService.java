package eTicaret.business.abstracts;

import eTicaret.entities.concretes.User;

public interface SendVerificationService {
	
	void sendEmail(User user);
	
}
