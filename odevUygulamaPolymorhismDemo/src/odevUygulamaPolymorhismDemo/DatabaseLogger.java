package odevUygulamaPolymorhismDemo;

public class DatabaseLogger extends BaseLogger {

	public void log(String mesage) {
		System.out.println("Veritabanına loglandı. " + mesage);
	}

}
