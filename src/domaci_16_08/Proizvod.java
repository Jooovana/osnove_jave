package domaci_16_08;

public class Proizvod {

	//	Napisati klasu Proizvod koja ima atribute
	//	naziv proizvoda (String)
	//	cenu proizvoda (double)
	//	težinu proizvoda u gramima. (double)
	//		i metode:
	//	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
	//	konvertuj - metoda konvertuje tezinu u kilograme i tone. Metoda kao parametar prima jedinicu u koju zelimo da konvertujemo, a metoda vraca sracunatu vrednost. Jedinica moze biti “kg” ili “t”
	//	Primer: ako proizvod ima 1200 grama i pozovemo metodu sa parametrom kg, metoda vraca 1.200
	//	Primer: ako proizvod ima 12000 grama i pozovemo metodu sa parametrom t, metoda vraca 0.012


		//U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati metode
	
	
	public String naziv;
	public double cena;
	public double tezina;
	
	
	public void stampa() {
		System.out.println(this.naziv + ", " + this.cena + " rsd, " + this.tezina + "g");
	}
	public double konvertuj (String weight) {
		if (weight.equals("kg")) {
			return this.tezina / 1000;
		}else {
			return this.tezina / 1000000;
		}
}
	
	
	
	
	
	
	
}
