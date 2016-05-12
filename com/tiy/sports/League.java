package com.tiy.sports;

public class League {

	Player[] nbaPlayers = new Player[4];

	Referee[] nbaRefs = new Referee[6];

	public String teamname;
	public String court;
	public String color;

	public League(){
		teamname = "Cavs";
		court = "BlackTop";
		color = "Blue";

	}



	public League(String inputTeamName, String inputCourt, String inputColor) {
		teamname = inputTeamName;
		court = inputCourt;
		color = inputColor;

	//nbaPlayers[0] = new Player ("Michale Jordan");
	//nbaPlayers[1] = new Player ("Allen Iverson");
	//nbaPlayers[2] = new Player ("Kobe Bryant");
	//nbaPlayers[3] = new Player ("Lebron James");

	}


	public void print() {
		System.out.println(teamname + court + color);
	}
	

}