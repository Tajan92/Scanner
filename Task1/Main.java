import java.util.ArrayList;

class Main{
	
public static void main(String[] args){
	ArrayList<Team> teams = new ArrayList<>();
	
	teams.add(new Team("FCK"));
	teams.add(new Team("FCM"));
	teams.add(new Team("BIF"));
	teams.add(new Team("AGF"));
	teams.add(new Team("OB"));
	teams.add(new Team("FCN"));

	teams.get(2).setRank(4);
	teams.get(0).addPlayer("Bo");

for (Team t : teams){
	System.out.println(t);
	}
}

}