package odevUygulamaInterfaces;

public class CustomerManager {

	private Customer[] customers;

	public CustomerManager(Customer[] customers) {
		this.customers = customers;
	}

	public void add() {
		for (Customer customer : customers) {
			customer.add();
		}
	}

}
