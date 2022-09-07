package P_22_08;

public class FacabookPost {

	private String opis;
	private Korisnik korisnik;
	
	public FacabookPost(String opis, Korisnik korisnik) {
		this.opis = opis;
		this.korisnik = korisnik;
	}

	public String getOpis() {
		return opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public Korisnik getKorisnik() {
		return korisnik;
	}

	public void setKorisnik(Korisnik korisnik) {
		this.korisnik = korisnik;
	}
	
	
	
	
	
	
}
