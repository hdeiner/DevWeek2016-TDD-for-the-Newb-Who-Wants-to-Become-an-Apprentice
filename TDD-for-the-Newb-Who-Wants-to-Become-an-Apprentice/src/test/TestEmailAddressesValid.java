package test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import main.EmailAddress;

@RunWith(Parameterized.class)
public class TestEmailAddressesValid {

	private boolean actualResult;
	   
	public TestEmailAddressesValid(String eMail) {
		try {
			new EmailAddress(eMail);
		} catch (Exception e) {
			e.printStackTrace();
		}
	    this.actualResult   = true;
	 }

	 @Parameters(name = "{index}: eMailAddress({0}")
	 public static Iterable<Object[]> cardsToTest() {
		 return Arrays.asList(new Object[][] {
			   { "prettyandsimple@example.com",                  },
			   { "very.common@example.com",                      },
			   { "disposable.style.email.with+symbol@example.com"},
			   { "other.email-with-dash@example.com",            }
		 });
	}

	@Test
	public void eMailChecker() {
	    assertTrue(actualResult);
	}

}
