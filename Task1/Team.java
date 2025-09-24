class Team{
	private String team;
	private int rank;
	private String player;


	public Team (String team){
			this.team = team;
	}

	public void setRank(int rank){
			this.rank = rank;

	}
	
	@Override
	public String toString(){
			return "Hold: "+this.team+" Rang: "+this.rank;
	}
}