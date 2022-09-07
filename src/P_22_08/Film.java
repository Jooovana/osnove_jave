package P_22_08;

public class Film {

	
	private String naziv;
	private int godina;
	private Reziser reziser;
	
	
	public Film(String naziv, int godina, Reziser reziser) {
		this.naziv = naziv;
		this.godina = godina;
		this.reziser = reziser;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public int getGodina() {
		return godina;
	}


	public void setGodina(int godina) {
		this.godina = godina;
	}


	public Reziser getReziser() {
		return reziser;
	}


	public void setReziser(Reziser reziser) {
		this.reziser = reziser;
	}
	
	public void stampaj() {
		System.out.println("Rezirao je:" + this.reziser +", ");
	}
	
	
	
	
	
	
	
	
	
}
