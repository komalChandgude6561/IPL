package repository;

import entity.Team;

public class TeamRepository {

	
	//should return mi team details
	
	public static Team getMITeamDetails() {
		Team team = new Team();
		team.setId(101);
		team.setTeamName("Mumbai Indians");
		team.setCaptainName("Hardik Pandya");
		team.setCoachName("Jaywardhan");
     	team.setQualified(false);
		team.setnRR(2.3f);
		team.setShortName("MI");
		return team;
	}
	
	public static Team getChennaiTeamDetails() {
		Team team = new Team();
		team.setId(102);
		team.setTeamName("Chennai");
		team.setCaptainName("Ms Dhoni");
		team.setCoachName("Stephen Fleming");
		team.setnRR(8.9f);
		team.setQualified(false);
		team.setShortName("CSK");

		return team;		
	}
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setId(103);
		team.setTeamName("RCB");
		team.setCaptainName("Rajat Patidar");
		team.setCoachName("Andy flower");
		team.setnRR(9.8f);
		team.setQualified(true);
		team.setShortName("RCB");

		return team;
	}
	
	public static Team getPunjabKings11TeamDetails() {
		Team team = new Team();
		team.setId(104);
		team.setTeamName("PunjabKings11");
		team.setCaptainName("Shreyas Iyer");
		team.setCoachName("Rickey Ponting");
		team.setnRR(6.7f);
		team.setQualified(false);
		team.setShortName("pk11");

		return team;
	}
	
	public static Team getKolkattaNightRidersTeamDetails() {
		Team team = new Team();
		team.setId(105);
		team.setTeamName("Kolkatta knight riders");
		team.setCaptainName("Ajinkya rahane");
		team.setCoachName("Chandrakant pandit");
		team.setnRR(9.0f);
		team.setQualified(false);
		team.setShortName("KNR");

		return team;
	}
	
	public static Team getSunrisersHydrabaadTeamDetails() {
		Team team = new Team();
		team.setId(106);
		team.setTeamName("Sunrisers Hydrabaad");
		team.setCaptainName("Pat Cummins");
		team.setCoachName("Danneil vettori");
		team.setnRR(8.0f);
		team.setQualified(false);
		team.setShortName("SH");

		return team;
	}
	
	public static Team getRajasthanRoyalsTeamDetails() {
		Team team = new Team();
		team.setId(107);
		team.setTeamName("Rajasthan Royals");
		team.setCaptainName("Sanju Samson");
		team.setCoachName("Rahul Dravid");
		team.setnRR(8.5f);
		team.setQualified(false);
		team.setShortName("RR");

		return team;
	}
	
	public static Team getDelhiCapitalsTeamDetails() {
		Team team = new Team();
		team.setId(108);
		team.setTeamName("Delhi Capitals");
		team.setCaptainName("Axar Patel");
		team.setCoachName("Hemang Badani");
		team.setnRR(9.5f);
		team.setQualified(false);
		team.setShortName("DC");
		return team;
	}
	
	public static Team getGujratTitansTeamDetails() {
		Team team = new Team();
		team.setId(109);
		team.setTeamName("Gujraat Titans");
		team.setCaptainName("Shubman Gill");
		team.setCoachName("Aashish Nehra");
		team.setnRR(7.5f);
		team.setQualified(false);
		team.setShortName("GT");
		return team;
	}
	
	public static Team getLukhnowSuperGiantsTeamDetails() {
		Team team = new Team();
		team.setId(110);
		team.setTeamName("Lukhnow  Super Giants");
		team.setCaptainName("Rishabh pant");
		team.setCoachName("justin Langer");
		team.setnRR(6.5f);
		team.setQualified(false);
		team.setShortName("LSG");
		return team;
	}
	
}
