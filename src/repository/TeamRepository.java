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
		return team;
	}
	
	public static Team getChennaiTeamDetails() {
		Team team = new Team();
		team.setcId(102);
		team.setcTeamName("Chennai");
		team.setcCaptainName("Ms Dhoni");
		team.setcCoachName("Stephen Fleming");
		team.setcnRR(8.9f);
		team.setcQualified(false);
		return team;		
	}
	
	public static Team getRCBTeamDetails() {
		Team team = new Team();
		team.setrId(103);
		team.setcTeamName("RCB");
		team.setrCaptainName("Rajat Patidar");
		team.setrCoachName("Andy flower");
		team.setrnRR(9.8f);
		team.setrisQualified(true);
		return team;
	}
	
	public static Team getPunjabKings11TeamDetails() {
		Team team = new Team();
		team.setpId(104);
		team.setpTeamName("PunjabKings11");
		team.setpCaptainName("Shreyas Iyer");
		team.setpCoachName("Rickey Ponting");
		team.setpnRR(6.7f);
		team.setpisQualified(false);
		return team;
	}
	
	public static Team getKolkattaNightRidersTeamDetails() {
		Team team = new Team();
		team.setkId(105);
		team.setkTeamName("Kolkatta knight riders");
		team.setkCaptainName("Ajinkya rahane");
		team.setkCoachName("Chandrakant pandit");
		team.setknRR(9.0f);
		team.setkisQualified(false);
		return team;
	}
	
	public static Team getSunrisersHydrabaadTeamDetails() {
		Team team = new Team();
		team.setsId(106);
		team.setsTeamName("Sunrisers Hydrabaad");
		team.setsCaptainName("Pat Cummins");
		team.setsCoachName("Danneil vettori");
		team.setsnRR(8.0f);
		team.setsisQualified(false);
		return team;
	}
	
	public static Team getRajasthanRoyalsTeamDetails() {
		Team team = new Team();
		team.setsId(107);
		team.setsTeamName("Rajasthan Royals");
		team.setsCaptainName("Sanju Samson");
		team.setsCoachName("Rahul Dravid");
		team.setsnRR(8.5f);
		team.setsisQualified(false);
		return team;
	}
	
	public static Team getDelhiCapitalsTeamDetails() {
		Team team = new Team();
		team.setDCId(108);
		team.setDCTeamName("Delhi Capitals");
		team.setDCCaptainName("Axar Patel");
		team.setDCCoachName("Hemang Badani");
		team.setDCnRR(9.5f);
		team.setDCisQualified(false);
		return team;
	}
	
	public static Team getGujratTitansTeamDetails() {
		Team team = new Team();
		team.setDCId(109);
		team.setDCTeamName("Gujraat Titans");
		team.setDCCaptainName("Shubman Gill");
		team.setDCCoachName("Aashish Nehra");
		team.setDCnRR(7.5f);
		team.setDCisQualified(false);
		return team;
	}
	
	public static Team getLukhnowSuperGiantsTeamDetails() {
		Team team = new Team();
		team.setDCId(110);
		team.setDCTeamName("Lukhnow  Super Giants");
		team.setDCCaptainName("Rishabh pant");
		team.setDCCoachName("justin Langer");
		team.setDCnRR(6.5f);
		team.setDCisQualified(false);
		return team;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
