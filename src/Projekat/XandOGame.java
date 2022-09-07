package Projekat;

import java.util.ArrayList;

public class XandOGame {

	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private String igracX;
	private String igracO;
	
	public XandOGame() {
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		
	}
	
	public XandOGame(String igracX, String igracO) {
		super();
		this.igracX = igracX;
		this.igracO = igracO;
		
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
		table.add(" ");
	}
	
	public String getIgracX() {
		return igracX;
	}
	
	public void setIgracX(String igracX) {
		this.igracX = igracX;
	}
	
	public String getIgracO() {
		return igracO;
	}
	
	public void setIgracO(String igracO) {
		this.igracO = igracO;
		}	
		
		
	public void print() {
		String prviRed = " ";
		String drugiRed = " ";
		String treciRed = " ";
		for (int i = 0; i < 3; i++) {
			prviRed = table.get(i) + " | ";
			}
		for (int i = 0; i < 6; i++) {
			drugiRed = table.get(i) + " | ";
		}
		for (int i = 6; i < 9; i++) {
			treciRed = table.get(i) + " | ";
		}
		
		System.out.println(prviRed);
		System.out.println(drugiRed);
		System.out.println(treciRed);
		}
	
	public void startGame() {
		for (int i = 0; i < table.size(); i++) {
			table.set(i, "");
		}
		this.nextPlayer = " X ";
		}
	
	public boolean isGameOver() {
		int brojPopunjenih =  0;
		for (int i = 0; i < table.size(); i++) {
			if(table.get(i) != " ") {
				brojPopunjenih = brojPopunjenih + 1;
			}
		}
		if(brojPopunjenih == table.size()) {
			return true;
		} else {
			return false;
		}
	}
	
	public void playNext() {
		if(this.nextPlayer.equals("X")) {
			this.nextPlayer = "O";
		} else {
			this.nextPlayer = "X";
		}
	}
	
	public void makeAMove(int pozicija) {
		this.table.set(pozicija, nextPlayer);
	}
	
	public boolean isWinnerX() {
		String rezultatPrviRed = this.table.get(0) + this.table.get(1) + this.table.get(2);
		String rezultatDrugiRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
		String rezultatTreciRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
		String rezultatPrviRedVertikalno = this.table.get(0) + this.table.get(3) + this.table.get(6);
		String rezultatDrugiRedVertikalno = this.table.get(1) + this.table.get(4) + this.table.get(7);
		String rezultatTreciRedVertikalno = this.table.get(2) + this.table.get(5) + this.table.get(8);
		
		String rezultatDijagonalaPrva = this.table.get(0) + this.table.get(4) + this.table.get(8);
		String rezultatDijagonalaDruga = this.table.get(2) + this.table.get(4) + this.table.get(6);
		
		if(rezultatPrviRed.equals("XXX") || rezultatDrugiRed.equals("XXX") || rezultatTreciRed.equals("XXX") || rezultatPrviRedVertikalno.equlas("XXX"
|| rezultatDrugiRedVertikalno.equals("XXX") || rezultatDrugiRedVertikalno.equals("XXX") || rezultatTreciRedVertikalno.equals("XXX") || rezultatDijagonalaPrva.equals("XXX") || rezultatDijagonalaDruga.equals("XXX")){
			return true;
					
		}else {
			return false;
		}	
			
		}
	
	public boolean isWinnerO() 
	String rezultatPrviRed = this.table.get(0) + this.table.get(1) + this.table.get(2);
	String rezultatDrugiRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
	String rezultatTreciRed = this.table.get(3) + this.table.get(4) + this.table.get(5);
	String rezultatPrviRedVertikalno = this.table.get(0) + this.table.get(3) + this.table.get(6);
	String rezultatDrugiRedVertikalno = this.table.get(1) + this.table.get(4) + this.table.get(7);
	String rezultatTreciRedVertikalno = this.table.get(2) + this.table.get(5) + this.table.get(8);
	
	String rezultatDijagonalaPrva = this.table.get(0) + this.table.get(4) + this.table.get(8);
	String rezultatDijagonalaDruga = this.table.get(2) + this.table.get(4) + this.table.get(6);
	
	
	if(rezultatPrviRed.equals("OOO") || rezultatDrugiRed.equals("OOO") || rezultatTreciRed.equals("OOO") || rezultatPrviRedVertikalno.equlas("OOO")
|| rezultatDrugiRedVertikalno.equals("OOO") || rezultatDrugiRedVertikalno.equals("OOO") || rezultatTreciRedVertikalno.equals("OOO") || rezultatDijagonalaPrva.equals("OOO") || rezultatDijagonalaDruga.equals("OOO")){
			return true;
					
		}else {
			return false;
		}	
			
		}
	
	public isValidMove(int pozicija) {
		if(pozicija >= 0 && pozicija <= 8) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public int gameScore() {
		if(isWinnerX() == true) {
			return 1;
		}
		else if(isWinnerO() == true) {
			return 2;
		}
		else {
			return 0;
		}
	}
	
	
	
	
	
	}
