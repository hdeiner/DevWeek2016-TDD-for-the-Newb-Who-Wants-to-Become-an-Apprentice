package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.Customer;
import main.Merchant;
import main.Order;

public class TestOrder {

	@Test
	public void testHowardPurchaseAtAppleStore() throws Exception {
		Merchant merchant = new Merchant(
				"Apple Store",
				"235 Regent Street",
				"W1B 2EL",
				"0207153 9000", 
				"appple.store.regent.street@apple.com"
				);

		Customer customer = new Customer(
				"Howard Deiner c/o The Stafford",
				"16-18 St James's Place",
				"SW1A 1NJ",
				"+44 0207493 0111", 
				"howard.deiner@deinersoft.com",
				"5367352413352239"
				);
		Order order = new Order(merchant, customer);
		assertEquals(0.6, order.getMerchantToCustomerDistance(), 0.1);
	}

}
