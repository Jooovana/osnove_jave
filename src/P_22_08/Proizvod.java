package P_22_08;

public class Proizvod {

	private String nazivProizvoda;
	private Kupac kupac;
	private int cena;
	
	
	
	public Proizvod(String nazivProizvoda, Kupac kupac, int cena) {
		this.nazivProizvoda = nazivProizvoda;
		this.kupac = kupac;
		this.cena = cena;
	}



	public String getNazivProizvoda() {
		return nazivProizvoda;
	}



	public Kupac getKupac() {
		return kupac;
	}



	public int getCena() {
		return cena;
	}
	
	
	public double cenaProizvoda() {
		return this.cena * 1.9 * (100 - this.kupac.getClanska_Karta().getPopust() / 100);
	}
	
	
	
	
	
	
}
