package pl.praca.klasy;

import java.util.UUID;

public class Towar {

	protected String uniqueID = UUID.randomUUID().toString();
	protected double price;

	public Towar(double d) {
		this.price = d;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	@Override
	public String toString() {
		return "Towar [uniqueID=" + uniqueID + ", price=" + price + "]";
	}
			
	
}
