package com.tiy.sports;
import java.util.Scanner;

public class LeagueRunner {
	public static void main(String[] args) {
		System.out.println("Welcome to the NBA Summer League");

		League  nbaSummerLeague = new League();
		Player  lebronJames = new Player();
		Referee  newRef = new Referee();
        
        System.out.println("Lets Create a team press enter to continue");
        Scanner buildTeam = new Scanner(System.in);
        String myTeamName = buildTeam.nextLine();
        System.out.println("Whats the name of your team.." + myTeamName);
        String myCourt = buildTeam.nextLine();
        System.out.println("Whats the name of your home court in " + myCourt);
        String myColor = buildTeam.nextLine();
        System.out.println(" Whats your teams color " + myColor);
        League myTeam = new League(myTeamName, myCourt, myColor);
        System.out.println("The team name is " + myTeamName + "your teams court is" + myCourt + "your teams color is" + myColor);


		System.out.println("Welcome to the nba sumer league");
		System.out.println("Lets Pratice");




		  for (int start = 0; start < 4; start++) {

            System.out.println("(0) Dunk");
            System.out.println("(1) Pass");
            System.out.println("(2) Shoot");
            System.out.println("(3) Block");
            System.out.println("(4) layup");
            System.out.println("(5) Guard");
            
            Scanner lineScanner = new Scanner(System.in);
            String askEmory = lineScanner.nextLine();

           if (askEmory.equals("1")) {
                System.out.println("Dunk");
            }
            if (askEmory.equals("2")) {
                System.out.println("Pass");
                }
            if (askEmory.equals("3")) {
                System.out.println("Shoot");
            }
            if (askEmory.equals("4")) {
                System.out.println("Layup");
            }
            if (askEmory.equals("5")) {
                System.out.println("Guard");
            }
        }

		}
	
}