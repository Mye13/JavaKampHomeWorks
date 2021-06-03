package odevUygulamaKodlamaio;

public class UserManager {

	public void add(User user) {
		System.out.println("Kiþi sisteme eklendi :" + " " + user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Kiþi sistemden silindi :" + " " + user.getFirstName());
	}

	public void update(User user) {
		System.out.println("Kiþi sistemde güncellendi :" + " " + user.getFirstName());
	}

}
