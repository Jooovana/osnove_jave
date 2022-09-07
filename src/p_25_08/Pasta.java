package p_25_08;

import java.util.ArrayList;

public class Pasta {

	private ArrayList <Sastojak> sastojci = new ArrayList<Sastojak>();

	public Pasta() {
	}
	
	
	public void dodajSastojak(Sastojak s) {
		this.sastojci.add(s);
	}
	
	
	public int racunajCenu() {
		int suma = 0;
		for (int i = 0; i < this.sastojci.size(); i++) {
			suma = suma + this.sastojci.get(i).getCena();
		}
		return suma;
	}
	
	public void stampaj() {
		for (int i = 0; i < sastojci.size(); i++) {
			this.sastojci.get(i).stampaj();
		}
		System.out.println("Cena je" + this.racunajCenu());
	}
	
	
	
}
