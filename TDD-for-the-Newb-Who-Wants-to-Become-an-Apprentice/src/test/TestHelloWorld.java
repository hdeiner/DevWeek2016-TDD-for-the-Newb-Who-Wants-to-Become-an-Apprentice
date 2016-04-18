package test;

import static org.junit.Assert.*;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import main.HelloWorld;

public class TestHelloWorld {

	@Test
	public void respondToHello() throws Exception {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("world", helloWorld.respondTo("hello"));
	}

	@Test
	public void respondToBernie() throws Exception {
		HelloWorld helloWorld = new HelloWorld();
		assertEquals("Sanders", helloWorld.respondTo("Bernie"));
	}

	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void respondToXYZZY() throws Exception {
		HelloWorld helloWorld = new HelloWorld();
	    thrown.expect(Exception.class);
	    thrown.expectMessage("invalid stimulus");
		assertEquals("XYZZY", helloWorld.respondTo("XYZZY"));
	}
}