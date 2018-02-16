// Project by: Alex Talham

package pkgCore;

import java.util.Scanner;

public class Stats {
	private static float AtBats;
	private static float Hits;
	private static float Doubles;
	private static float Triples;
	private static float HR;
	private static float Runs;
	private static float Walks;
	private static float Singles;
	public static String pname;
	
	public static void main(String[] args) {
		Stats playerInfo = new Stats();
		playerInfo.getInfo();
		
		double SLG = StatCalc.getSLG(StatCalc.getTB(Singles, Doubles, Triples, HR), AtBats);
		double OBP = StatCalc.getOBP(Hits,Walks,AtBats);
		
		System.out.println(pname + " Stats");
		System.out.println("Batting Average: " + StatCalc.getBA(Hits,AtBats));
		System.out.println("On Base Percentage: " + OBP);
		System.out.println("Total Bases: " + StatCalc.getTB(Singles, Doubles, Triples, HR));
		System.out.println("Slugging Percentage: " + SLG);
		System.out.println("On Base + Slugging Percentage: " + StatCalc.getOBS(SLG,OBP));
	}



	public void getInfo() {
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the Player's Name: ");
		pname = sc.nextLine();
	
		System.out.println("Enter the At Bats: ");
		AtBats = sc.nextInt();

		System.out.println("Enter the Hits: ");
		Hits = sc.nextInt();
	
		System.out.println("Enter the Doubles: ");
		Doubles = sc.nextInt();
	
		System.out.println("Enter the Triples: ");
		Triples = sc.nextInt();
	
		System.out.println("Enter the Home Runs: ");
		HR = sc.nextInt();
	
		System.out.println("Enter the Runs: ");
		Runs = sc.nextInt();
	
		System.out.println("Enter the Walks: ");
		Walks = sc.nextInt();
		
		Singles = Hits - (Triples + Doubles + HR);
	}
}
