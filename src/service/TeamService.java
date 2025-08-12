package service;

import entity.Team;
import repository.TeamRepository;

public class TeamService {

	
	public void printTeamDetails() {
		Team team = TeamRepository.getMITeamDetails();
			
			System.out.println(team.getId());
			System.out.println(team.getTeamName());
			System.out.println(team.getCaptainName());
			System.out.println(team.getCoachName());
		System.out.println(team.getnRR());
			System.out.println(team.isQualified());
     }
	
	public void printCSKTeamDetails() {
		Team team = TeamRepository.getChennaiTeamDetails();
		System.out.println(team.getcId());
		System.out.println(team.getcTeamName());
		System.out.println(team.getcCaptainName());
		System.out.println(team.getcCoachName());
		System.out.println(team.getcnRR());
		System.out.println(team.cisQualified());
	}
		
		public void printRCBTeamDetails() {
			Team team = TeamRepository.getRCBTeamDetails();
			System.out.println(team.getrId());
			System.out.println(team.getrTeamName());
			System.out.println(team.getrCaptainName());
			System.out.println(team.getrCoachName());
			System.out.println(team.getrnRR());
			System.out.println(team.risQualified());
		}
		
		public void printPunjaabKings11TeamDetails() {
			Team team = TeamRepository.getPunjabKings11TeamDetails();
			System.out.println(team.getpId());
			System.out.println(team.getpCaptainName());
			System.out.println(team.getpCoachName());
			System.out.println(team.getpnRR());
			System.out.println(team.pisQualified());
			}
		
		public void printKolkattaNightRidersTeamDetails() {
			Team team = TeamRepository.getKolkattaNightRidersTeamDetails();
				System.out.println(team.getkId());
				System.out.println(team.getkTeamName());
				System.out.println(team.getkCaptainName());
				System.out.println(team.getkCoachName());
				System.out.println(team.getknRR());
				System.out.println(team.kisQualified());
			}
		
		public void printSunrisersHydrabaadTeamDetails() {
			Team team = TeamRepository.getSunrisersHydrabaadTeamDetails();
				System.out.println(team.getsId());
				System.out.println(team.getsTeamName());
				System.out.println(team.getsCaptainName());
				System.out.println(team.getsCoachName());
				System.out.println(team.getsnRR());
				System.out.println(team.sisQualified());
			}
		
		public void printRajasthanRoyalsTeamDetails() {
			Team team = TeamRepository.getRajasthanRoyalsTeamDetails();
				System.out.println(team.getRRId());
				System.out.println(team.getRRTeamName());
				System.out.println(team.getRRCaptainName());
				System.out.println(team.getRRCoachName());
				System.out.println(team.getRRnRR());
				System.out.println(team.RRisQualified());
			}
		
		public void printDelhiCapitalsTeamDetails() {
			Team team = TeamRepository.getDelhiCapitalsTeamDetails();
				System.out.println(team.getDCId());
				System.out.println(team.getDCTeamName());
				System.out.println(team.getDCCaptainName());
				System.out.println(team.getDCCoachName());
				System.out.println(team.getDCnRR());
				System.out.println(team.DCisQualified());
			}
		
		public void printGujratTitansTeamDetails() {
			Team team = TeamRepository.getGujratTitansTeamDetails();
				System.out.println(team.getGTId());
				System.out.println(team.getGTTeamName());
				System.out.println(team.getGTCaptainName());
				System.out.println(team.getGTCoachName());
				System.out.println(team.getGTnRR());
				System.out.println(team.GTisQualified());
			}
		
		public void printLukhnowSuperGiantsTeamDetails() {
			Team team = TeamRepository.getLukhnowSuperGiantsTeamDetails();
				System.out.println(team.getLSGId());
				System.out.println(team.getLSGTeamName());
				System.out.println(team.getLSGCaptainName());
				System.out.println(team.getLSGCoachName());
				System.out.println(team.getLSGnRR());
				System.out.println(team.LSGisQualified());
			}
			
		}

	
	
	

