package pl.praca.klasy;

import java.util.UUID;

public class Pracownik extends Osoba {

	String uniqueID = UUID.randomUUID().toString(); 
	
	public Pracownik(String name, String secondName, String addres) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.secondName = secondName;
		this.addres = addres;
	}
	
	public String getUniqueID() {
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
	
	
	
}
