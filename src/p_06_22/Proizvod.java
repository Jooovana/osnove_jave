package p_06_22;

import java.util.ArrayList;

public class Proizvod {

	protected ArrayList<Dodatak> dodaci = new ArrayList<Dodatak>();

	public Proizvod() {
		super();
	}

	public ArrayList<Dodatak> getDodaci() {
		return dodaci;
	}

	public void setDodaci(ArrayList<Dodatak> dodaci) {
		this.dodaci = dodaci;
	}
	
	public void ubaciDodatak(Dodatak dodatak) {
		this.dodaci.add(dodatak);
	}
	
	public double cenaSvihDodataka() {
		
	}		
		
	
	
	
	
	
	
	
	
	
	
	
	
	}
	
	

