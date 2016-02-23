package ClientesPaquetes;

public class CommonPackage implements PackageType {

	private double basePrice;
	
	public CommonPackage(double aBasePrice){
		basePrice = aBasePrice;
	}
	
	public double getBasePrice(Client aClient){
		return basePrice;
	}
}
