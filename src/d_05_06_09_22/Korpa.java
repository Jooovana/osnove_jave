package d_05_06_09_22;

import java.util.ArrayList;

public class Korpa {

	private ArrayList<Ambalaza> ambalaze = new ArrayList<Ambalaza>();
	
	
	
	
	public ArrayList<Ambalaza> getAmbalaze() {
		return ambalaze;
	}

	public void setAmbalaze(ArrayList<Ambalaza> ambalaze) {
		this.ambalaze = ambalaze;
	}

	public void dodajAmbalazu(Ambalaza ambalaza) {
		this.ambalaze.add(ambalaza);}
		
	public void izbaciAmbalazu(String barkod) {
		for (int i = 0; i < this.ambalaze.size(); i++) {
			if(this.ambalaze.get(i).getBarkod().equals(barkod)) {
				this.ambalaze.remove(i);
			}
		}
	}
		
	private double cenaAmbalazePopust(int popust) {
		double suma = 0;
		for (int i = 0; i < this.ambalaze.size(); i++) {
			suma += this.ambalaze.get(i).cenaArtikla();
			
		}
		return suma - popust;
		
	}
	
	
	
	
}
