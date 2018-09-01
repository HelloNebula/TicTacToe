import java.util.ArrayList;
import java.util.Scanner;
public class Game {
	// have it update every move with scanner("top right", "bottom middle")
	public static ArrayList<String> tracker = new ArrayList<String>();
	public static char marker[] = new char[2];
	public static boolean gameGoing = true;
	//
	public static void main(String[] args) {
		int scansRan = 0;
		for (int i = 0; i <= 8; i++) {
			tracker.add(" ");
		}
		Boolean X = true; // If X is true, then X is the player marker, otherwise its O
		int xChanger = 1;
		String playerMarker = "X";
		
		while(scansRan < 1000) {
			if (xChanger == 1) {
				X = true;
			}
			if (xChanger == -1) {
				X = false;
			}
			if (X) {
				playerMarker = "X";
			}
			if (!X) {
				playerMarker = "O";
			}
			Scanner sc = new Scanner(System.in);
			String move = sc.nextLine();
			if (move.equals("top left") && tracker.get(0) != "X" && tracker.get(0) != "O") {
				tracker.set(0,playerMarker);
			}
			if (move.equals("top mid") && tracker.get(1) != "X" && tracker.get(1) != "O") {
				tracker.set(1,playerMarker);
			}
			if (move.equals("top right") && tracker.get(2) != "X" && tracker.get(2) != "O") {
				tracker.set(2,playerMarker);
			}
			if (move.equals("mid left") && tracker.get(3) != "X" && tracker.get(3) != "O") {
				tracker.set(3,playerMarker);
			}
			if (move.equals("mid") && tracker.get(4) != "X" && tracker.get(4) != "O") {
				tracker.set(4,playerMarker);
			}
			if (move.equals("mid right") && tracker.get(5) != "X" && tracker.get(5) != "O") {
				tracker.set(5,playerMarker);
			}
			if (move.equals("bot left") && tracker.get(6) != "X" && tracker.get(6) != "O") {
				tracker.set(6,playerMarker);
			}
			if (move.equals("bot mid") && tracker.get(7) != "X" && tracker.get(7) != "O") {
				tracker.set(7,playerMarker);
			}
			if (move.equals("bot right") && tracker.get(8) != "X" && tracker.get(8) != "O") {
				tracker.set(8,playerMarker);
			}
			// option to clear board
			if (move.equals("Reset board")) {
				for (int i = 0; i <= 8; i++) {
					tracker.set(i, " ");
				}
			}
			
			Gameover.GameStillGoing();
			if (!gameGoing) {
				System.out.println("GG, please type 'Reset board' to start over again");
				
			}
			
			System.out.println(tracker.get(5));
			Grid.drawGrid();
			xChanger *= -1;
			scansRan ++;
		}
	}
}

