package odevUygulamaInterfaces;

public class Main {

	public static void main(String[] args) {
		
		Customer[] customers = {new OracleCustomer(), new MySqlCustomer()};
		CustomerManager customerManager = new CustomerManager(customers);
		customerManager.add();
		
	}

}
