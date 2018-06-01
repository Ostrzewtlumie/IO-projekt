package pl.praca.klasy;

import java.util.UUID;

public class Zamowienie {

	protected String payment;
	protected String uniqueID = UUID.randomUUID().toString();
	
	public Zamowienie(String payment) {
		this.payment = payment;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getUniqueID() {
		return uniqueID;
	}

	@Override
	public String toString() {
		return "Zamowienie [payment=" + payment + ", uniqueID=" + uniqueID + "]";
	}
	
	
}
