package main;

public class Customer extends TransactionEntity {
	private CreditCard creditCard;
	
	public Customer (String name, String address, String postalCode, String phoneNumber, String eMailAddress, String creditCardNumber) throws Exception {
		super (name, address, postalCode, phoneNumber, eMailAddress);
		this.creditCard = new CreditCard(creditCardNumber);
	}

}
