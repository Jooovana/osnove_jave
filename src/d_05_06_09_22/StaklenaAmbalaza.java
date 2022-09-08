package d_05_06_09_22;

public class StaklenaAmbalaza extends Ambalaza {

	private int kaucija;
	private boolean placanjeKaucije;
	private int osnovnaCena;
	
	
	public StaklenaAmbalaza(String barkod, String naziv, int neto, int bruto, int kaucija, boolean placanjeKaucije, int osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.kaucija = kaucija;
		this.placanjeKaucije = placanjeKaucije;
		this.osnovnaCena = osnovnaCena;
	}
	public int getKaucija() {
		return kaucija;
	}
	public void setKaucija(int kaucija) {
		this.kaucija = kaucija;
	}
	public boolean isPlacanjeKaucije() {
		return placanjeKaucije;
	}
	public void setPlacanjeKaucije(boolean placanjeKaucije) {
		this.placanjeKaucije = placanjeKaucije;
	}
	public int getOsnovnaCena() {
		return osnovnaCena;
	}
	public void setOsnovnaCena(int osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}
	@Override
	public double cenaArtikla() {
		if(this.placanjeKaucije == true) {
			return this.osnovnaCena * 1.2 + this.kaucija;
		} else 
			return  this.osnovnaCena * 1.2;
	}
	@Override
	public void print() {
		System.out.println("Naziv " + this.naziv);
		System.out.println("Barkoda" + this.barkod);
		System.out.println("Tezina " + this.bruto);
		System.out.println("Cena " + this.osnovnaCena);
		if(this.placanjeKaucije == true) {
			System.out.println("Kaucija se placa.");
			System.out.println("Kacucija je " + this.kaucija);
		}else {
			System.out.println("Kaucija se ne placa.");
		}
		
	}
	
	
	
	
	
	
	
}
