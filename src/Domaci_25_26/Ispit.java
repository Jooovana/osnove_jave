package Domaci_25_26;

public class Ispit {

	private String predmet;
	private int ocena;
	private String punoImeProfa;

	public Ispit(String predmet, int ocena, String punoImeProfa) {
		super();
		this.predmet = predmet;
		this.ocena = ocena;
		this.punoImeProfa = punoImeProfa;
	}

	public String getPredmet() {
		return predmet;
	}

	public void setPredmet(String predmet) {
		this.predmet = predmet;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public String getPunoImeProfa() {
		return punoImeProfa;
	}

	public void setPunoImeProfa(String punoImeProfa) {
		this.punoImeProfa = punoImeProfa;
	}

	public boolean polozio() {
		if (this.ocena >= 6 && this.ocena <= 10) {
			return true;
		}
		return false;
	}

	public void stampaj() {
		System.out.println(this.predmet + " - " + this.punoImeProfa + " - " + this.ocena);
		System.out.println();
	
	
	
	
	
	
	
	
	
	
}
