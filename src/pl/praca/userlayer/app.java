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
	
	public static void main(String[] args) {
		
		Klient defaultCustomer = new Klient("Jan","Kowalski","adres","haslo");
		Pracownik  defaultWorker = new Pracownik("Wojciech","Nowak","adres","haslo1");
		Kierownik defaultManager = new Kierownik("Rychu","Ken","adres","haslo2");
		intializeUsersInDatabases(defaultCustomer,defaultWorker,defaultManager);
		
		int whoIsLogged = checkLoginData();
		
		switch(whoIsLogged)
		{
			case 1:
				userLogic(defaultCustomer);
				break;
			case 2:
				workerLogic(defaultWorker);
				break;
			case 3:
				managerLogic(defaultManager);
				break; 
		}
	}

	private static void intializeUsersInDatabases(Klient defaultCustomer, Pracownik defaultWorker, Kierownik defaultManager) {
		
		
		
		customersList.add(defaultCustomer);
		customersData.put(defaultCustomer.getSecondName(),  defaultCustomer.getPassword());
		
		
		workersList.add(defaultWorker);
		workesData.put(defaultWorker.getSecondName(), defaultWorker.getPassword());
		

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
			
			System.out.println("Niepoprawne dane");
		}
		
	}
	
	private static void userLogic(Klient defaultCustomer) {
		List<Zamowienie> ordersList = new ArrayList<>();
		int nrZamowienia;
		
		System.out.println("Witam kliencie " + defaultCustomer.getName());	
		
		
		
		System.out.println("1.Dodaj zamowienie");

		System.out.println("2.Usun zamowienie");
		
		System.out.println("3.Wypisz zamowienia");
		
		Scanner input = new Scanner(System.in);
		int choosenOption = input.nextInt();
		
		switch(choosenOption)
		{
		case 1:
			defaultCustomer.addOrder(new Zamowienie("Gotowka"), ordersList);
			break;
		case 2:
			System.out.println("Podaj id zamowienia do usuniecia:");
		    input = new Scanner(System.in);
			nrZamowienia = input.nextInt();
			defaultCustomer.deleteOrder(nrZamowienia,ordersList);
			break;
		case 3:
			defaultCustomer.showOrders(ordersList);
			break; 
		}
		
		/* do zaimlementowania
		checkOrder();
		*/
	}

	private static void workerLogic(Pracownik defaultWorker) {	
		/* do zaimlementowania
		 changeChart();
		 */
		System.out.println("Witam pracowniku " + defaultWorker.getName());
		

		System.out.println("1.Dodaj klienta");

		System.out.println("2.Usun klienta");
		
		System.out.println("3.Wypisz klientow");
		
		Scanner input = new Scanner(System.in);
		int choosenOption = input.nextInt();
		
		switch(choosenOption)
		{
		case 1:
			defaultWorker.addCustomer(new Klient("Adam", "Nowak", "Lesna", "pass"), customersList);
			break;
		case 2:
			System.out.println("Podaj id zamowienia do usuniecia:");
		    input = new Scanner(System.in);
		    String secondNameToDelete = input.nextLine();
		    defaultWorker.deleteCustomer(secondNameToDelete, customersList);
			break;
		case 3:
			defaultWorker.showCustomers(customersList);
			break; 
		}
	}

	private static void managerLogic(Kierownik defaultManager) {
		System.out.println("witam kierowniku " + defaultManager.getName());

		System.out.println("1.Dodaj pracownika");

		System.out.println("2.Usun pracownika");
		
		System.out.println("3.Wypisz pracownikow");

		Scanner input = new Scanner(System.in);
		int choosenOption = input.nextInt();
		
		switch(choosenOption)
		{
		case 1:
			defaultManager.addWorker(new Pracownik("Olek","Kowal","Polna","password"), workersList);
			break;
		case 2:
			System.out.println("Podaj id zamowienia do usuniecia:");
		    input = new Scanner(System.in);
		    String secondNameToDelete = input.nextLine();
		    defaultManager.deleteWorker(secondNameToDelete, workersList);
			break;
		case 3:
			defaultManager.showWorkers(workersList);
			break; 
		}
		/* do zaimlementowania
		
		 */
		
	}

}
