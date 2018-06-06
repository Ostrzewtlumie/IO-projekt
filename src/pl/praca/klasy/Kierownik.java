package pl.praca.klasy;

import java.util.UUID;

public class Kierownik extends Osoba {

	int uniqueID;

	static int ID = 1;
	protected String stats;
	
	

	public Kierownik(String name, String secondName, String addres) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.secondName = secondName;
		this.addres = addres;
		uniqueID = ID;
		ID++;
	}
	
	public String getStats() {
		return stats;
	}

	public void setStats(String stats) {
		this.stats = stats;
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
		return "Kierownik [uniqueID=" + uniqueID + ", stats=" + stats + ", name=" + name + ", secondName=" + secondName
				+ ", addres=" + addres + "]";
	}
	


}
