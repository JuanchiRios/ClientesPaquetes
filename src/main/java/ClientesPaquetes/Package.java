package ClientesPaquetes;

public class Package {

	private double tax;
	private PackageType packageType;
	
	public Package(PackageType aPackageType, double aTax){
		setPackageType(aPackageType);
		setTax(aTax);
		
	}
	
	public double getBasePrice(Client client) {
		return packageType.getBasePrice(client);
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double aTax) {
		tax = aTax;
	}
	
	public void setPackageType(PackageType aPackageType) {
		packageType = aPackageType;
	}

	public double getPriceFor(Client client) {
		return getBasePrice(client) * getTax();
	}

	
	
	

}
