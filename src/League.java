import java.util.ArrayList;

public class League <T extends Team> implements Comparable<Team> {
	
	String leaguename;
	ArrayList<T> arr=new ArrayList<>();
	
	public League(String leaguename) {
		this.leaguename=leaguename;
	}
	
	public String getLeagueName() {
		return this.leaguename;
	}
	
	
	public void addTeam(T team) {
		if(arr.contains(team)) {
			System.out.println("Team "+team.getname() +" already present in the League.");
		}else {
			arr.add(team);
			System.out.println("Team " + team.getname()+" successfully added in the League.");
		}
	}
	
	public int leagueSize() {
		int size=arr.size();
		return size;
	}
	
	

	@Override
	public int compareTo(Team team) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	

}
