
import java.time.LocalDate;

import abstracts.BaseCustomerManager;
import adapters.MernisServiceAdapter;
import concrete.NeroCustomerManager;
import concrete.StarbucksCustomerManager;
import entities.Customer;

public class Main {

	public static void main(String[] args) throws Exception {
		BaseCustomerManager customerManager = new NeroCustomerManager(new MernisServiceAdapter());

		customerManager.save(new Customer(1, "Gürhan", "Tekoðlu", LocalDate.of(2000, 11, 30), "12345678901"));
		System.out.println();
	}

}
