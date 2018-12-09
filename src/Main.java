
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		League<IPLTeam> ipl=new League<IPLTeam>("ipl");
		
		League<InternationalTeams> inte=new League<InternationalTeams>("International");
		
		IPLTeam chennai=new IPLTeam("Chennai SuperKings");
		IPLTeam mumbai=new IPLTeam("Mumbai Indians");
		IPLTeam kolkata=new IPLTeam("Kolkata Knight Riders");
		
		chennai.ranking(2);
		mumbai.ranking(1);
		kolkata.ranking(3);
		
		
		ipl.addTeam(chennai);
		ipl.addTeam(mumbai);
		ipl.addTeam(kolkata);
		
		// Creating International Teams//
		InternationalTeams India=new InternationalTeams("India");
		InternationalTeams Australia=new InternationalTeams("Australia");
		InternationalTeams Newzealand=new InternationalTeams("New Zealand");
		InternationalTeams SouthAfrica=new InternationalTeams("South Africa");
		
		inte.addTeam(India);
		inte.addTeam(Australia);
		inte.addTeam(Newzealand);
		inte.addTeam(SouthAfrica);
		
		//Counting the Number of Teams in inte Lea
		System.out.println("Nos. of teams in "+ inte.getLeagueName()+" League are: "+inte.leagueSize()); 
		

	}

}
