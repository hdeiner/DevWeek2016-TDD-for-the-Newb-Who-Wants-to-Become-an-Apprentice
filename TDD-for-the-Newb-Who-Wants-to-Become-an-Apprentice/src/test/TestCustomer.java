package test;
import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.Customer;

public class TestCustomer {

	@Test
	public void testCustomerGood() throws Exception {
		new Customer(
				"Howard Deiner c/o The Stafford",
				"16-18 St James's Place",
				"SW1A 1NJ",
				"+44 0207493 0111", 
				"howard.deiner@deinersoft.com",
				"5367352413352239"
				);
		assertTrue(true);
	}

    @Rule
    public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testCustomerBadPostalCode() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid postalcode");
		new Customer(
				"Howard Deiner c/o The Stafford",
				"16-18 St James's Place",
				"SW1A XX1NJ",
				"+44 0207493 0111", 
				"howard.deiner@deinersoft.com",
				"5367352413352239");
		assertTrue(true);
	}

	@Test
	public void testCustomerBadPhoneNumber() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid phone number");
		new Customer(
				"Howard Deiner c/o The Stafford",
				"16-18 St James's Place",
				"SW1A 1NJ",
				"+1 203 243 1515", 
				"howard.deiner@deinersoft.com",
				"5367352413352239");
		assertTrue(true);
	}

	@Test
	public void testCustomerBadEmailAddress() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
		new Customer(
				"Howard Deiner c/o The Stafford",
				"16-18 St James's Place",
				"SW1A 1NJ",
				"+44 0207493 0111", 
				"howard.deiner.deinersoft.com",
				"5367352413352239");
		assertTrue(true);
	}

	@Test
	public void testCustomerBadCreditCard() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid credit card digits");
		new Customer(
				"Howard Deiner c/o The Stafford",
				"16-18 St James's Place",
				"SW1A 1NJ",
				"+44 0207493 0111", 
				"howard.deiner@deinersoft.com",
				"9367352413352239");
		assertTrue(true);
	}


}
