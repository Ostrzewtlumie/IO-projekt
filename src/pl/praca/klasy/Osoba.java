package pl.praca.klasy;

public abstract class Osoba {

	
	protected String name;
	
	protected String secondName;
	
	protected String addres;
	
	protected String password;
	
	public abstract String getName();

	public abstract void setName(String name);
	
	public abstract  String getSecondName();

	public abstract  void setSecondName(String secondName);

	public abstract  String getAddres();

	public abstract  void setAddres(String addres);

	public abstract  String getPassword();

	public abstract void setPassword(String password);
	
	

	
}
