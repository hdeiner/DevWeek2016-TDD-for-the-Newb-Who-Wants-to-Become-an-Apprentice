package test;

import main.PostalCode;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertTrue;

public class TestPostalCodes {

    @Test
    public void testFormat1() throws Exception {
        new PostalCode("EC1A 1BB");
        assertTrue(true);
    }

    @Test
    public void testFormat2() throws Exception {
        new PostalCode("W1A 0AX");
        assertTrue(true);
    }

    @Test
    public void testFormat3() throws Exception {
        new PostalCode("M11 1AE");
        assertTrue(true);
    }

    @Test
    public void testFormat4() throws Exception {
        new PostalCode("B33 8TH");
        assertTrue(true);
    }

    @Test
    public void testFormat5() throws Exception {
        new PostalCode("CR2 6XH");
        assertTrue(true);
    }

    @Test
    public void testFormat6() throws Exception {
        new PostalCode("DN55 1PT");
        assertTrue(true);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testFormatInvalid() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Invalid postalcode");

        new PostalCode("XYZZY");
    }


}