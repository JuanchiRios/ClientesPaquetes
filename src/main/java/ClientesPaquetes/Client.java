package ClientesPaquetes;

import java.util.ArrayList;
import java.util.List;

public class Client {

	public Client(double anAvailableBalance) {
		setAvailableBalance(anAvailableBalance);
	}

	private double availableBalance;
	private List<Package> boughtPackages = new ArrayList<Package>();

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
		boughtPackages.add(aPackage);
	}

	public double totalSpent() {
		double total = 0;
		for (Package aPackage : boughtPackages) {
			total = total + aPackage.getPriceFor(this);
		}
		return total;
	}

	public int quantityPackagesBought() {
		return boughtPackages.size();
	}

	public List<Package> getPaquetesComprados() {
		return boughtPackages;
	}

	public Package mostExpensivePackage() {
		if (boughtPackages.isEmpty()) return null;
		Package mostExpensive = boughtPackages.get(0);
		for (Package aPackage : boughtPackages) {
			if(mostExpensive.getPriceFor(this) < aPackage.getPriceFor(this)) {
				mostExpensive = aPackage;
			}
		}
		return mostExpensive;
	}

}
