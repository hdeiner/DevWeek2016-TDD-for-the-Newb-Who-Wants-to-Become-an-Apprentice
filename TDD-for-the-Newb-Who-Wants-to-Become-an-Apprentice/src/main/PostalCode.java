package main;

public class PostalCode {
	private String postalCodeCharacters;
	
	public PostalCode(String postalCodeCharacters) throws Exception {
		if ( (!postalCodeCharacters.matches("^[A-Z]{2}[0-9][A-Z] [0-9][A-Z]{2}$")) &&
			 (!postalCodeCharacters.matches("^[A-Z][0-9][A-Z] [0-9][A-Z]{2}$")) &&
		     (!postalCodeCharacters.matches("^[A-Z][0-9] [0-9][A-Z]{2}$")) &&
			 (!postalCodeCharacters.matches("^[A-Z][0-9]{2} [0-9][A-Z]{2}$")) &&
			 (!postalCodeCharacters.matches("^[A-Z]{2}[0-9] [0-9][A-Z]{2}$")) &&
			 (!postalCodeCharacters.matches("^[A-Z]{2}[0-9]{2} [0-9][A-Z]{2}$"))) {
					Exception e = new Exception("Invalid postalcode");
					throw e;
			 }
		this.postalCodeCharacters = postalCodeCharacters;
	}
	
	public String getPostalCodeCharacters() {
		return postalCodeCharacters;
	}
}
