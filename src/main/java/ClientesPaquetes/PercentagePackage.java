package ClientesPaquetes;

public class PercentagePackage implements PackageType {
	
	public double getBasePrice(Client aClient){
		return aClient.getAvailableBalance() *0.1;
	}

}
