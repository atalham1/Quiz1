package pkgCore;

public class StatCalc {
	
	public static double getBA(float Hits, float AtBats) {
		return (Hits/AtBats);
	}
	
	public static double getOBP(float Hits, float Walks, float AtBats) {
		return (((Hits + Walks)/AtBats)* 100);
	}
	
	public static double getTB(float Singles, float Doubles, float Triples, float HR) {
		return (Singles + (2 * Doubles) + (3* Triples) + (4 * HR));
	}
	
	public static double getSLG(double TB, float AtBats){
		return ((TB/AtBats)*100);
	}
	
	public static double getOBS(double SLG, double OBP) {
		return (SLG + OBP);
	}
}
