package main;

public class TransactionEntity {
	private String name;
	private String address;
	private PostalCode postalCode;
	private PhoneNumber phoneNumber;
	private EmailAddress eMailAddress;
	
	public TransactionEntity (String name, String address, String postalCodeCharacters, String phoneNumber, String eMailAddress) throws Exception {
		this.name         = name;
		this.address      = address;
		this.postalCode   = new PostalCode(postalCodeCharacters);
		this.phoneNumber  = new PhoneNumber(phoneNumber);
		this.eMailAddress = new EmailAddress(eMailAddress);
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public PostalCode getPostalCode() {
		return postalCode;
	}

	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}

	public EmailAddress geteMailAddress() {
		return eMailAddress;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setPostalCode(PostalCode postalCode) {
		this.postalCode = postalCode;
	}

	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void seteMailAddress(EmailAddress eMailAddress) {
		this.eMailAddress = eMailAddress;
	}
}
