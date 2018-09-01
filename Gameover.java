
public class Gameover {

	public static void GameStillGoing() {

        /**
         * I don't know what this does. Is it checking for the game winning three in a row condition? Is this the best
		 * way to check for a win.
		 *
		 * Also the spacing of this is wrong.
		 * You shouldn't cross this line in the IDE.
		 * *************************************************************************************************************
		 * Everything past the last star needs to be on another line since its not really readable in its current
		 * state.cd
         */
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
