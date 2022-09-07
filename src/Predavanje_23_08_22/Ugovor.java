package Predavanje_23_08_22;

public class Ugovor {

	
	private String date;
	private FizickoLice kupac;
	private FizickoLice prodavac;
	private double cena;
	private String adresaNekretnine;
	
	
	public Ugovor(String date, FizickoLice kupac, FizickoLice prodavac, double cena, String adresaNekretnine) {
		this.date = date;
		this.kupac = kupac;
		this.prodavac = prodavac;
		this.cena = cena;
		this.adresaNekretnine = adresaNekretnine;
	}
	
	public double procenatZarade() {
		if(this.kupac.isDaLijekupovanaNekretnina()) {
			return 0.02;
		
	} else {
		return 0.03;
	}
	
	return this.kupac.isDaLijekupovanaNekretnina() ? 0.02 : 0.03;
	
	}
	
	public double zarada() {
		return 1000 + this.cena * procenatZarade();
	}
	
	public void stampaj() {
		System.out.println(this.adresaNekretnine);
		System.out.println(this.cena);
		System.out.println(this.date);
		this.kupac.stampaj();
		if(this.kupac !=null ) {
		this.prodavac.stampaj();
	}}
	
}
