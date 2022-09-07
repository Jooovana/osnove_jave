package Predavanje_23_08_22;

public class Korisnik {

	private String punoIme;
	private String licenca;
	
	public Korisnik() {
		this.licenca = "basic";
	}
	
	
	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}
	public String getLicenca() {
		return licenca;
	}
	
	public void pretplatiSe(int suma) {
		if(suma == 100) {
			this.licenca = "pro";
		}else if (suma == 150) {
			this.licenca = "premium";
		}
	}
	
	
	public void ponistiPretplatu() {
		this.licenca = "basic";
	}
	
	
	public int maxPoziv() {
		if(this.licenca.equals("basic")) {
			return 40;
		} else if (this.licenca.equals("pro")) {
			return 240;
		} return 1440;
	}
	
	public void stampaj() {
		System.out.println(this.punoIme);
	}
	
	
}
