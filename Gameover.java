
public class Gameover {

	public static void GameStillGoing() {
		if((Game.tracker.get(0).equals("X")&&Game.tracker.get(1).equals("X")&&Game.tracker.get(2).equals("X")) ||Game.tracker.get(0).equals("O")&& Game.tracker.get(1).equals("O")&&Game.tracker.get(2).equals("O") 
		|| (Game.tracker.get(3).equals("X")&&Game.tracker.get(4).equals("X")&&Game.tracker.get(5).equals("X")) ||Game.tracker.get(3).equals("O")&& Game.tracker.get(4).equals("O")&&Game.tracker.get(5).equals("O") 
		|| (Game.tracker.get(6).equals("X")&&Game.tracker.get(7).equals("X")&&Game.tracker.get(8).equals("X")) ||Game.tracker.get(6).equals("O")&& Game.tracker.get(7).equals("O")&&Game.tracker.get(8).equals("O")		
		|| (Game.tracker.get(0).equals("X")&&Game.tracker.get(3).equals("X")&&Game.tracker.get(6).equals("X")) ||Game.tracker.get(0).equals("O")&& Game.tracker.get(3).equals("O")&&Game.tracker.get(6).equals("O") 	
		|| (Game.tracker.get(1).equals("X")&&Game.tracker.get(4).equals("X")&&Game.tracker.get(7).equals("X")) ||Game.tracker.get(1).equals("O")&& Game.tracker.get(4).equals("O")&&Game.tracker.get(7).equals("O") 		
		|| (Game.tracker.get(2).equals("X")&&Game.tracker.get(5).equals("X")&&Game.tracker.get(8).equals("X")) ||Game.tracker.get(2).equals("O")&& Game.tracker.get(5).equals("O")&&Game.tracker.get(8).equals("O") 
		|| (Game.tracker.get(0).equals("X")&&Game.tracker.get(4).equals("X")&&Game.tracker.get(8).equals("X")) ||Game.tracker.get(0).equals("O")&& Game.tracker.get(4).equals("O")&&Game.tracker.get(8).equals("O") 
		|| (Game.tracker.get(2).equals("X")&&Game.tracker.get(4).equals("X")&&Game.tracker.get(6).equals("X")) ||Game.tracker.get(2).equals("O")&& Game.tracker.get(4).equals("O")&&Game.tracker.get(6).equals("O") 
				) {
			Game.gameGoing = false;
		}
	}
}
