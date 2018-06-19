package pl.praca.klasy;

import java.util.List;
import java.util.UUID;

public class Pracownik extends Osoba {

	int uniqueID;
	static int ID = 1;
	
	public Pracownik(String name, String secondName, String addres, String password) {
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
		return "Pracownik [uniqueID=" + uniqueID + ", name=" + name + ", secondName=" + secondName + ", addres="
				+ addres + "]";
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
	
	public void addCustomer(Klient customer, List<Klient> customersList)
    {
        customersList.add(customer);
    }

	public void deleteCustomer(String string, List<Klient> customersList) {
		
		for(Klient klient: customersList)
		{
			if(klient.getSecondName().equals(string))
			{
				customersList.remove(klient);
			}
		}
	}

	public void showCustomers(List<Klient> customersList) {
		for(Klient klient: customersList)
		{
			System.out.println(klient.toString());
		}
		
	}
	
	
	
}
