package pl.praca.userlayer;
import pl.praca.klasy.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class app {
	static Map <String, String> customersData = new HashMap<>();
	static Map <String, String> workesData = new HashMap<>();
	static Map <String, String> managersData = new HashMap<>();
	
	static List<Klient> customersList = new ArrayList<>();
	static List<Pracownik> workersList = new ArrayList<>();
	static List<Kierownik> ordersList = new ArrayList<>();
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

	private static void intializeUsersInDatabases() {
		
		Klient defaultCustomer = new Klient("Jan","Kowalski","adres","haslo");
		
		customersList.add(defaultCustomer);
		customersData.put(defaultCustomer.getSecondName(),  defaultCustomer.getPassword());
		
		Pracownik  defaultWorker = new Pracownik("Wojciech","Nowak","adres","haslo1");
		workersList.add(defaultWorker);
		workesData.put(defaultWorker.getSecondName(), defaultWorker.getPassword());
		
		Kierownik defaultManager = new Kierownik("Rychu","Ken","adres","haslo2");
		managersData.put(defaultManager.getSecondName(), defaultManager.getPassword());

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
			for(Map.Entry<String, String> entry :  customersData.entrySet())
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
	
	private static void userLogic() {
		System.out.println("witam uzytkowniku");	
		/* do zaimlementowania
		addOrder();
		deleteOder();
		chechOrder();
		showOrders();
		*/
	}

	private static void workerLogic() {	
		/* do zaimlementowania
		 addCustomer();
		 deleteCustomer();
		 showCustomers();
		 changeChart();
		 
		 */
		System.out.println("witam pracowniku");
		
	}

	private static void managerLogic() {
		System.out.println("witam kierowniku");
		
		/* do zaimlementowania
		 addWorker();
		 deleteWorker();
		 shoWorkers();
		 */
		
	}

}
