package Domaci_25_26;

public class Igrac extends Osoba {

	private int brojIgraca;
	private String pozicija;
	private boolean kapiten;

	public Igrac() {
		super();
	}

	public Igrac(String punoIme, String jmbg, int godRodjenja, int brojIgraca, String pozicija, boolean kapiten) {
		super(punoIme, jmbg, godRodjenja);
		this.brojIgraca = brojIgraca;
		this.pozicija = pozicija;
		this.kapiten = kapiten;
	}

	public int getBrojIgraca() {
		return brojIgraca;
	}

	public void setBrojIgraca(int brojIgraca) {
		this.brojIgraca = brojIgraca;
	}

	public String getPozicija() {
		return pozicija;
	}

	public void setPozicija(String pozicija) {
		this.pozicija = pozicija;
	}

	public boolean isKapiten() {
		return kapiten;
	}

	public void setKapiten(boolean kapiten) {
		this.kapiten = kapiten;
	}

	@Override
	public void stampaj() {
		super.stampaj();
		System.out.println("Broj koji nosi na ledjima: " + this.brojIgraca);
		System.out.println("Pozicija na kojoj igra: " + this.pozicija);
		if (this.isKapiten() == true) {
			System.out.println("Kapiten!");

		}
		System.out.println();
	
	
	
	
	
	
	
}
