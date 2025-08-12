package main;

import service.TeamService;

public class Test {

	public static void main(String[] args) {

		TeamService service = new TeamService();
		service.printTeamDetails();
		System.out.println(".........................................................................");
	    service.printCSKTeamDetails();
		System.out.println(".........................................................................");

		service.printRCBTeamDetails();
		System.out.println(".........................................................................");
		
		service.printPunjaabKings11TeamDetails();
		System.out.println(".........................................................................");


		service.printKolkattaNightRidersTeamDetails();
		System.out.println("...............................................................................");
		
		service.printSunrisersHydrabaadTeamDetails();
		System.out.println("...............................................................................");
		
		service.printRajasthanRoyalsTeamDetails();
		System.out.println("................................................................................");
		
		service.printDelhiCapitalsTeamDetails();
		System.out.println("................................................................................");
		
		service.printGujratTitansTeamDetails();
		System.out.println("................................................................................");
		
		service.printLukhnowSuperGiantsTeamDetails();
		System.out.println("................................................................................");

System.out.println("githun");


	}
}
