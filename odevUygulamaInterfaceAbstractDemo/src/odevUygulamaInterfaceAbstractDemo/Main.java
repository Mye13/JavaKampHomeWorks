package odevUygulamaInterfaceAbstractDemo;

import java.sql.Date;
import java.time.LocalDate;
import java.util.Calendar;

import Abstract.BaseCustomerManager;
import Adapters.MernisServiceAdapter;
import Concrete.NeroCustomerManager;
import Concrete.StarbucksCustomerManager;
import Entities.Customer;


public class Main {

	public static void main(String[] args) {
 
		Customer customer2 = new Customer(2, "Ali", "Veli", LocalDate.of(1988, 8, 1), "12345678910");
		
		BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		customerManager.save(customer2);
		//customerManager.save(customer2);
	}

}
