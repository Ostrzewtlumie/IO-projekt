package pl.praca.klasy;

import java.util.UUID;

public class Towar {

	int uniqueID;

	static int ID = 1;
	protected double price;

	public Towar(double d) {
		this.price = d;
		uniqueID = ID;
		ID++;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	@Override
	public String toString() {
		return "Towar [uniqueID=" + uniqueID + ", price=" + price + "]";
	}
			
	
}
