package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.Merchant;

public class TestMerchant {

	@Test
	public void testMerchantGood() throws Exception {
		new Merchant(
				"Apple Store",
				"235 Regent Street",
				"W1B 2EL",
				"0207153 9000", 
				"appple.store.regent.street@apple.com"
				);
		assertTrue(true);
	}

    @Rule
    public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testMerchantBadPostalCode() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid postalcode");
		new Merchant(
				"Apple Store",
				"235 Regent Street",
				"W1B2EL",
				"0207153 9000", 
				"appple.store.regent.street@apple.com"
				);
		assertTrue(true);
	}

	@Test
	public void testMerchantBadPhoneNumber() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid phone number");
		new Merchant(
				"Apple Store",
				"235 Regent Street",
				"W1B 2EL",
				"02071539000", 
				"appple.store.regent.street@apple.com"
				);
		assertTrue(true);
	}

	@Test
	public void testMerchantBadEmailAddress() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
		new Merchant(
				"Apple Store",
				"235 Regent Street",
				"W1B 2EL",
				"0207153 9000", 
				"appple.store.regent.street@apple"
				);
		assertTrue(true);
	}

}
