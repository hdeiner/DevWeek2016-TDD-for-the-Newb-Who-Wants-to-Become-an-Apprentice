package test;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.EmailAddress;

public class TestEmailAddressesInvalid {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNoAtCharacter() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress("Abc.example.com");
    }

    @Test
    public void testOnlyOneAtIsAllowedOutsideQuotationMarks() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress("A@b@c@example.com");
    }

    @Test
    public void testNoSpecialCharactersInLocalPartOutsideQuotes() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress("a\"b(c)d,e:f;g<h>i[j\\k]l@example.com");
    }

    @Test
    public void testQuotedStringsMustBeDotSeperatedOrOnlyElementOfLocalPart() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress("just\"not\"right@example.com");
    }

    @Test
    public void testSpacesQuotesAndBackslashesMayOnlyBeWithinQuotedStringsPreceededByBackslash() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress("this is\"not\\allowed@example.com");
    }

    @Test
    public void testDoubleDotAfterAtSign() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress("john.doe@example..com");
    }

    @Test
    public void testLeadingSpace() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress(" john.doe@example.com");
    }

    @Test
    public void testTrailingSpace() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid eMail Address");
        new EmailAddress(" john.doe@example.com");
    }
}