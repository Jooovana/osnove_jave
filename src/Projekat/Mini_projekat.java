package Projekat;

import java.util.Scanner;

public class Mini_projekat {

	public static void main(String[] args) {
		
		Player j = new Player("Jovana Stevanovic");
		Player a = new Player("Aleksa Aleksic");
		XandOGame game = new XandOGame();
		
		game.startGame();
		
		while (!game.isGameOver() && !game.isWinnerX() && !game.isWinnerO()) {
			Scanner s = new Scanner(System.in);
			
			System.out.println("Make a move: ");
			int pozicija = s.nextInt();
		}
			
			
		
		
		
		
		
		
		
		
		

	}

}
