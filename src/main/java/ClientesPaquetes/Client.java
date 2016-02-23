package ClientesPaquetes;

public class Client {
	
	public Client(double anAvailableBalance){
		setAvailableBalance(anAvailableBalance);
	}
	
	private double availableBalance;

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double anAvailableBalance) {
		availableBalance = anAvailableBalance;
	}

}
