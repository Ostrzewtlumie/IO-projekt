package pl.praca.klasy;

import java.util.List;
import java.util.UUID;

public class Kierownik extends Osoba {

	int uniqueID;
	static int ID = 1;
	protected String stats;
	
	

	public Kierownik(String name, String secondName, String addres, String password) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.secondName = secondName;
		this.addres = addres;
		this.password = password;
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

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return password;
	}

	@Override
	public void setPassword(String password) {
		this.password = password;		
	}

	public void addWorker(Pracownik pracownik, List<Pracownik> workersList) {
	      workersList.add(pracownik);

	}

	public void deleteCustomer(String string, List<Pracownik> workersList) {
		
		for(Pracownik pracownik: workersList)
		{
			if(pracownik.getSecondName().equals(string))
			{
				workersList.remove(pracownik);
			}
		}
		
		
	}

	public void showWorkers(List<Pracownik> workersList) {
		for(Pracownik pracownik: workersList)
		{
			System.out.println(pracownik.toString());
		}
		
	}
	


}
