package d_18_08_22;

public class Zadatak_domaci_01_18_08 {

	public static void main(String[] args) {
		
	Proizvod p = new Proizvod();
	
		p.naziv = "Televizor";
		p.cena = 1000.23;
		p.tezina = 2000.12;
		
	Proizvod r = new Proizvod();
	r.naziv = "Fen za kosu";
	r.cena = 1000.33;
	r.tezina = 1300.0;

	p.stampaj();
	r.stampaj();
	
	double povecanje = 300.0;
	p.povecajCenu();
	
	double povecanje = 200.0;
	r.povecajCenu();
	
	p.stampaj();
	r.stampaj();
	
	int popust = 50;
	System.out.println("Cena " + p.naziv + "ako je popust" + popust);
	
	popust = 20;
	System.out.println("Cena " + r.naziv + "ako je popust" + popust););
	}

}
