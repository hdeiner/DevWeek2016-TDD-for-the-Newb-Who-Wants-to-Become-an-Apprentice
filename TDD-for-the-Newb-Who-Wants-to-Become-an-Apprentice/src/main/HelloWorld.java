package main;

public class HelloWorld {
	
	public String respondTo(String stimulus) throws Exception {
		String response = "";
		if (stimulus.equals("hello")) {
			response = "world";
		}
		if (stimulus.equals("Bernie")) {
			response = "Sanders";
		}
		if (response.length() == 0) {
			Exception e = new Exception("invalid stimulus");
			throw e;
		}
		return response;
	}

}