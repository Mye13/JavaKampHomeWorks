package odevUygulamaKodlamaio;

public class UserManager {

	public void add(User user) {
		System.out.println("Ki�i sisteme eklendi :" + " " + user.getFirstName());
	}

	public void delete(User user) {
		System.out.println("Ki�i sistemden silindi :" + " " + user.getFirstName());
	}

	public void update(User user) {
		System.out.println("Ki�i sistemde g�ncellendi :" + " " + user.getFirstName());
	}

}
