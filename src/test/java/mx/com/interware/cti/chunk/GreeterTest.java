package mx.com.interware.cti.chunk;

import org.junit.Assert;
import org.junit.Test;

//import junit.framework.TestCase;

public class GreeterTest {// extends TestCase {

	@Test
	public void sayHelloTest() {
		Greeter test = new Greeter();

		String name = "Axis";
		String expected = "Hello there Axis!";
		String actual = test.sayHello(name);
		Assert.assertEquals(expected, actual);
	}

}
