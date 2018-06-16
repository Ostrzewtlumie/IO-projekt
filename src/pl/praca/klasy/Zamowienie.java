package pl.praca.klasy;

import java.util.UUID;

public class Zamowienie {

    int uniqueID;
    static int ID = 1;
    protected String payment;

	public Zamowienie(String payment) {
		this.payment = payment;
		uniqueID = ID;
		ID++;
	}

	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public int getUniqueID() {
		return uniqueID;
	}

	@Override
	public String toString() {
		return "Zamowienie [  uniqueID=" + uniqueID +"payment=" + payment + "]";
	}
	
	
}
