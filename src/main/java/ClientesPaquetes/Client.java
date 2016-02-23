package ClientesPaquetes;

import org.junit.experimental.max.MaxCore;

public class Client {

	public Client(double anAvailableBalance) {
		setAvailableBalance(anAvailableBalance);
	}

	private double availableBalance;

	public double getAvailableBalance() {
		return availableBalance;
	}

	public void setAvailableBalance(double anAvailableBalance) {
		availableBalance = Math.max(0, anAvailableBalance);
	}

	public void spendMoney(double amount) {
		if (getAvailableBalance() < amount)
			throw new InsufficientBalanceException("Insufficient balance, deposit more money please");
		
		double newBalance = getAvailableBalance() - amount;
		setAvailableBalance(newBalance);
	}

	public void buyPackage(Package aPackage) {
		spendMoney(aPackage.getPriceFor(this));
	}

}
