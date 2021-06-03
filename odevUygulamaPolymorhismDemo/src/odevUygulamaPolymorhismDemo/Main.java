package odevUygulamaPolymorhismDemo;

public class Main {

	public static void main(String[] args) {
		
		BaseLogger[] loggers = new BaseLogger[] {new FileLogger(), new DatabaseLogger(), new EmailLogger(), new SmsLogger()};
		for (BaseLogger logger : loggers) {
			logger.log("Log mesaj�");
		}
		
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
