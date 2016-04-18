package main;

public class EmailAddress {
	private String eMail;
	
	public EmailAddress(String eMail) throws Exception {
		if ( !eMail.matches("^(?=[A-Za-z0-9][A-Za-z0-9@._%+-]{5,253}+$)[A-Za-z0-9._%+-]{1,64}+@(?:(?=[A-Za-z0-9-]{1,63}+\\.)[A-Za-z0-9]++(?:-[A-Za-z0-9]++)*+\\.){1,8}+[A-Za-z]{2,63}+$")) {
			Exception e = new Exception("Invalid eMail Address");
			throw e;
		}
		this.eMail = eMail;
	}
	
	public String getEmail() {
		return eMail;
	}

}
