package d_05_06_09_22;

public class Tetrapak extends Ambalaza {

	private boolean reciklaza;
	private int osnovnacena;
	
	
	public Tetrapak(String barkod, String naziv, int neto, int bruto, boolean reciklaza, int osnovnaCena) {
		super(barkod, naziv, neto, bruto);
		this.reciklaza = reciklaza;
		this.osnovnacena = osnovnaCena;
		
		
		
		
		
		
		
	}
	public boolean isReciklaza() {
		return reciklaza;
	}
	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}
	public int getOsnovnacena() {
		return osnovnacena;
	}
	public void setOsnovnacena(int osnovnacena) {
		this.osnovnacena = osnovnacena;
	}
	@Override
	public double cenaArtikla() {
		if(this.reciklaza == true) {
		return this.tezinaPakovanja() * 1.5 + this.osnovnacena;
	}else 
		return this.osnovnacena;
		}
	@Override
	public void print() {
	System.out.println("Naziv " + this.naziv);
	System.out.println("Barkoda" + this.barkod);
	System.out.println("Tezina " + this.bruto);
	System.out.println("Cena " + this.osnovnacena);
	if(this.reciklaza == true) {
		System.out.println("Ambalaza je od recikliranog materijala.");
	}else {
		System.out.println("Ambalaza nije reciklirana.");
	}
	}
	
	
	
	
	
	
	
}
