package ClientesPaquetesTest;

import static org.junit.Assert.*;
import ClientesPaquetes.*;
import org.junit.*;

public class ClientTest {
	
	private Client client1 = new Client(2000);
	private static final double DELTA = 1e-15;
	
	@Test
	public void getAvailableBalance() {
		assertEquals(client1.getAvailableBalance(),2000, DELTA);

	}

}
