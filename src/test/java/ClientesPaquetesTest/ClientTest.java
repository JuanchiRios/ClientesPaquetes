package ClientesPaquetesTest;

import static org.junit.Assert.*;
import ClientesPaquetes.*;
import ClientesPaquetes.Package;

import org.junit.*;

public class ClientTest {
	
	private Client juan = new Client(2000);
	private static final double DELTA = 1e-15;
	private Package package1 = new Package(500,1.25);
	private Package package2 = new Package(1995,1.10);
	
	@Test
	public void getAvailableBalanceTest() {
		assertEquals(juan.getAvailableBalance(),2000, DELTA);

	}
	
	@Test
	public void buyPackageWithSufficientAmountTest() {
		juan.buyPackage(package1);
		assertEquals(juan.getAvailableBalance(),1375, DELTA);

	}
	
	@Test(expected=InsufficientBalanceException.class)
	public void buyPackageWithInsufficientAmountTest(){
		juan.buyPackage(package2);
		assertEquals(juan.getAvailableBalance(),2000, DELTA);

	}


}
