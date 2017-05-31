package test;

import main.PhoneNumber;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class TestPhoneNumbers {

    @Test
    public void testTheStafford1() throws Exception {
        new PhoneNumber("+44 07710 377981");
        assertTrue(true);
    }

    @Test
    public void testTheStafford2() throws Exception {
        new PhoneNumber("07710 377981");
        assertTrue(true);
    }

    @Test
    public void testCentralHallWestminster1() throws Exception {
        new PhoneNumber("+44 0207654 3851");
        assertTrue(true);
    }

    @Test
    public void testCentralHallWestminster2() throws Exception {
        new PhoneNumber("0207654 3851");
        assertTrue(true);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testBadPhoneNumber() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid phone number");
        new PhoneNumber("02076543851");
    }

}