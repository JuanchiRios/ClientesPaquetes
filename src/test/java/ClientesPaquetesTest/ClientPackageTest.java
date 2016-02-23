package ClientesPaquetesTest;

import static org.junit.Assert.*;
import ClientesPaquetes.*;
import ClientesPaquetes.Package;

import org.junit.*;

public class ClientPackageTest {
	
	private Client juan = new Client(2000);
	private static final double DELTA = 1e-15;
	private PackageType commonType1 = new CommonPackage(500);
	private PackageType commonType2 = new CommonPackage(1995);
	private PackageType commonType3 = new CommonPackage(200);
	private Package package1 = new Package(commonType1,1.25);
	private Package package2 = new Package(commonType2 ,1.10);
	private PackageType roomType = new RoomPackage(2, 50);
	private Package mardelPackage = new Package(roomType, 1.20);
	private PackageType percentageType = new PercentagePackage();
	private Package percentagePackage = new Package(percentageType, 1.30);
	
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
	
	@Test
	public void roomPackageChangeToCommonPackageTest() {
		assertEquals(mardelPackage.getPriceFor(juan),120, DELTA);
		mardelPackage.setPackageType(commonType3);
		assertEquals(mardelPackage.getPriceFor(juan),240, DELTA);

	}
	

	@Test
	public void percetagePackageGetPriceTest() {
		juan.buyPackage(percentagePackage);
		assertEquals(juan.getAvailableBalance(),1740, DELTA);

	}

}
