package pl.praca.userlayer;
import pl.praca.klasy.*;

public class app {

	public static void main(String[] args) {
		
		Osoba customer = new Klient("Wojtek","Kowalski","Szczecin");
		
		Osoba worker = new Pracownik("Michal", "Nowak", "Warszawa");
		
		Osoba manager = new Kierownik("Tomasz", "Plot", "Wroclaw");
		
		Zamowienie order = new Zamowienie("Gotowka");
		
		Towar article = new Towar(123.12);
		

		Osoba secondCustomer = new Klient("Wojtek","Kowalski","Szczecin");
		
		System.out.println(customer.toString());
		
		System.out.println(worker.toString());
		
		System.out.println(manager.toString());
		
		System.out.println(order.toString());
		
		System.out.println(article.toString());
		

		System.out.println(secondCustomer.toString());
	}

}
