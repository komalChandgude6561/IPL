package service;

import java.util.Scanner;

import entity.Team;
import repository.TeamRepository;

public class TeamService {

	public void selectOptions() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to the IPL portal ");
		System.out.println("Please select following options - ");
		System.out.println("1.Get all team details");
		System.out.println("2.Get team details by short name");
		System.out.println("3.Please enter id for getting  related team details: ");

		
		int input = sc.nextInt();		
		System.err.println("you have selected option: " +input);
		
		System.out.println("3.Please enter id for getting  related team details: ");

		int id = sc.nextInt();
        System.out.println("your entered  id is : "+id);
		
		switch (input) {
		case 1: {
			
			//get all team details
			System.out.println(TeamRepository.getMITeamDetails());
			System.out.println(TeamRepository.getRCBTeamDetails());
			System.out.println(TeamRepository.getPunjabKings11TeamDetails());
			System.out.println(TeamRepository.getKolkattaNightRidersTeamDetails());
			System.out.println(TeamRepository.getChennaiTeamDetails());
			System.out.println(TeamRepository.getDelhiCapitalsTeamDetails());
			System.out.println(TeamRepository.getGujratTitansTeamDetails());
			System.out.println(TeamRepository.getLukhnowSuperGiantsTeamDetails());
			System.out.println(TeamRepository.getRajasthanRoyalsTeamDetails());
			System.out.println(TeamRepository.getSunrisersHydrabaadTeamDetails());
			break;
		}
		
		//get team details by short name
		case 2:{
			System.out.println("Please enter your fav team's short name: ");
			String teamShortName = sc.next();
			System.err.println("Entered team short name is : "+teamShortName);
			getTeamByShortName(teamShortName);
			break;	
		}
		
		case 3:{
			// for get team details by  id
			//further logic should not have switch case
			
			if(id==101) {
				System.out.println(TeamRepository.getMITeamDetails());
			}
			else if(id==102) {
				System.out.println(TeamRepository.getChennaiTeamDetails());

			}
			else if(id==103) {
				System.out.println(TeamRepository.getRCBTeamDetails());

			}
			else if(id==104) {
				System.out.println(TeamRepository.getPunjabKings11TeamDetails());

			}
			else if(id==105) {
				System.out.println(TeamRepository.getKolkattaNightRidersTeamDetails());

			}
			
			else if(id==106) {
				System.out.println(TeamRepository.getSunrisersHydrabaadTeamDetails());

			}
			else if(id==107) {
				System.out.println(TeamRepository.getRajasthanRoyalsTeamDetails());

			}
			else if(id==108) {
				System.out.println(TeamRepository.getDelhiCapitalsTeamDetails());

			}
			else if(id==109) {
				System.out.println(TeamRepository.getGujratTitansTeamDetails());

			}
			else if(id==110) {
				System.out.println(TeamRepository.getLukhnowSuperGiantsTeamDetails());

			}
			else {
				System.out.println("Please enter valid id");
			}	
			break;
			
		}
		
		default:
			throw new IllegalArgumentException("Unexpected value: " + input);
		}
	}
	
	private void getTeamByShortName(String shortName) {
		//here we write a code logic to get team details by short name 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter shortName of team: ");
		String shortName1 = sc.nextLine();

		if (shortName1.equals("MI")) {
			
			System.out.println(TeamRepository.getMITeamDetails());
		}
		else if(shortName1.equals("RCB")){
			System.out.println(TeamRepository.getRCBTeamDetails());
		}
		
		else if(shortName1.equals("PK11")){
			
	     System.out.println(TeamRepository.getPunjabKings11TeamDetails());

		}

		else if(shortName1.equals("KKR")){
	
	    System.out.println(TeamRepository.getKolkattaNightRidersTeamDetails());

	}

		else if(shortName1.equals("CSK")){
	
	System.out.println(TeamRepository.getChennaiTeamDetails());
	}

		else if(shortName1.equals("DC")){
	
	System.out.println(TeamRepository.getDelhiCapitalsTeamDetails());

	
	}

		else if(shortName1.equals("GT")){
	
	System.out.println(TeamRepository.getGujratTitansTeamDetails());

	
	}

		else if(shortName1.equals("LSG")){
	
	System.out.println(TeamRepository.getLukhnowSuperGiantsTeamDetails());

	}

		else if(shortName1.equals("RR")){
	
	System.out.println(TeamRepository.getRajasthanRoyalsTeamDetails());

		
	}

		else if(shortName1.equals("SH")){
	
	System.out.println(TeamRepository.getSunrisersHydrabaadTeamDetails());

	
	}

		else{
			
			System.out.println("please enter valid team shortname");
		}
		
	}
		
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	