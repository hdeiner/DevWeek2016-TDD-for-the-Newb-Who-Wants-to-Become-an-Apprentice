package main;

public class PhoneNumber {
	private String number;
	
	public PhoneNumber(String number) throws Exception {
		if ( !number.matches("^(\\+44 ){0,1}(0[0-9]{2,7} )([0-9]{1,7})$")) {
			Exception e = new Exception("Invalid phone number");
			throw e;
		}
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
}
