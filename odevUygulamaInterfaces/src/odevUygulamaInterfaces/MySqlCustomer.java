package odevUygulamaInterfaces;

public class MySqlCustomer implements Customer {

	@Override
	public void add() {
		System.out.println("MySql veritaban� eklendi");
	}

}
