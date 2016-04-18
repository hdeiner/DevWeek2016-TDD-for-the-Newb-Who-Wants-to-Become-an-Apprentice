package main;

public class Merchant extends TransactionEntity {

	public Merchant (String name, String address, String postalCode, String phoneNumber, String eMailAddress) throws Exception {
		super (name, address, postalCode, phoneNumber, eMailAddress);
	}

}
