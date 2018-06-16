package pl.praca.userlayer;
import pl.praca.klasy.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class app {
	static Map <String, String> usersData = new HashMap<>();

	static Map <String, String> workesData = new HashMap<>();

	static Map <String, String> managersData = new HashMap<>();
	public static void main(String[] args) {
		
		intializeUsersInDatabases();
		int whoIsLogged = checkLoginData();
		
		switch(whoIsLogged)
		{
			case 1:
				userLogic();
				break;
			case 2:
				workerLogic();
				break;
			case 3:
				managerLogic();
				break;
		}
	}

	private static void userLogic() {
		System.out.println("witam uzytkowniku");		
	}

	private static void workerLogic() {
		System.out.println("witam pracowniku");
		
	}

	private static void managerLogic() {

		System.out.println("witam kierowniku");
		
	}

	private static void intializeUsersInDatabases() {
		usersData.put("kowalski", "haslo");
		usersData.put("nowak", "haslo1");
		
		workesData.put("kowalski", "haslo2");
		workesData.put("nowak", "haslo3");
		
		managersData.put("kowalski", "haslo4");
		managersData.put("nowak", "haslo5");
		
	}

	private static int checkLoginData() {
	
		int whoIsLogging = 0;//1-klient, 2-pracownik, 3-kierownik
		while(true)
		{
			System.out.println("Podaj nazwe uzytkownika: ");
			Scanner input = new Scanner(System.in);
			String userName = input.nextLine();
			System.out.println("Podaj haslo uzytkownika: ");
			input = new Scanner(System.in);
			String userPassword = input.nextLine();
			
			for(Map.Entry<String, String> entry :  usersData.entrySet())
			{
				if(entry.getKey().equals(userName) && entry.getValue().equals(userPassword))
				{
					
					return whoIsLogging = 1;
				}
			}
			for(Map.Entry<String, String> entry :  workesData.entrySet())
			{
				if(entry.getKey().equals(userName) && entry.getValue().equals(userPassword))
				{
					return whoIsLogging = 2;
				}	
			}
			for(Map.Entry<String, String> entry :  managersData.entrySet())
			{
				if(entry.getKey().equals(userName) && entry.getValue().equals(userPassword))
				{
					return whoIsLogging = 3;
				}		
			}		
		}
		
	}

}
