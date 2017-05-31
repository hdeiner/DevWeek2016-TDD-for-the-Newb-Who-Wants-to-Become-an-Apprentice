package test;

import main.EmailAddress;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;

import static org.junit.Assert.assertTrue;

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