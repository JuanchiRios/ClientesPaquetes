package ClientesPaquetes;

public class Package {

	private int basePrice;
	private double tax;
	
	public Package(int aBasePrice, double aTax){
		setBasePrice(aBasePrice);
		setTax(aTax);
	}
	
	public int getBasePrice() {
		return basePrice;
	}
	public void setBasePrice(int aBasePrice) {
		basePrice = aBasePrice;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double aTax) {
		tax = aTax;
	}

	public double getPrice() {
		return getBasePrice() * getTax();
	}

	
	
	

}
