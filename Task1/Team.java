import java.util.ArrayList;

class Team{
	private String team;
	private int rank;
	private ArrayList<String> player;


	public Team (String team){
			this.team = team;
			this.player = new ArrayList<>();
	}

	public void setRank(int rank){
			this.rank = rank;

	}
	public void addPlayer(String player){
			this.player.add(player);
	}

	@Override
	public String toString(){
			return "Team: "+this.team+" Rank: "+this.rank+"\n"+" Player: "+this.player;
	}

}