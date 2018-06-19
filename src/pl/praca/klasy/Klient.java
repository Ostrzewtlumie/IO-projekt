package pl.praca.klasy;

import java.util.Iterator;
import java.util.List;
import java.util.UUID;

public class Klient extends Osoba {

	int uniqueID;
	static int ID = 1;
		
	public Klient(String name, String secondName, String addres, String password) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.secondName = secondName;
		this.addres = addres;
		this.password = password;
		uniqueID = ID;
		ID++;
	}
	
	public int getUniqueID() {
		return uniqueID;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public void setName(String name) {
		// TODO Auto-generated method stub
		this.name = name;
	}

	@Override
	public String getSecondName() {
		// TODO Auto-generated method stub
		return secondName;
	}

	@Override
	public void setSecondName(String secondName) {
		// TODO Auto-generated method stub
		this.secondName = secondName;
		
	}

	@Override
	public String getAddres() {
		// TODO Auto-generated method stub
		return addres;
	}

	@Override
	public void setAddres(String addres) {
		// TODO Auto-generated method stub
		this.addres = addres;
	}

	@Override
	public String toString() {
		return "Klient [uniqueID=" + uniqueID + ", name=" + name + ", secondName=" + secondName + ", addres=" + addres
				+ "]";
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;
		
	}

	public void addOrder(Zamowienie zamowienie, List<Zamowienie> ordersList) {
		System.out.println("Dodano zamowienie");
		ordersList.add(zamowienie);
	}

	public void deleteOrder( int nrZamowienia, List<Zamowienie> ordersList) {
		for (Iterator<Zamowienie> iterator = ordersList.iterator(); iterator.hasNext(); ) 
		{
			Zamowienie zamowienie = iterator.next();
			
			if(zamowienie.getUniqueID() == nrZamowienia)
			{
				System.out.println("Ususnieto Zamowienie");
				iterator.remove();
			}
		}
		
	}

	public void showOrders(List<Zamowienie> ordersList) {
		System.out.println("Lista zamowien: ");
		for(Zamowienie zamowienie: ordersList)
		{
			System.out.println(zamowienie.toString());
		}
		
	}
	


}
