package domaci_16_08;

import java.util.Scanner;

public class Zadatak_01_16_08 {

	public static void main(String[] args) {
		
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

		Scanner s = new Scanner (System.in);
		Proizvod krem = new Proizvod();
		krem.naziv = "Nutella";
		krem.cena = 370.00;
		krem.tezina = 750;
		krem.stampa();
		Proizvod med = new Proizvod();
		med.naziv = "Medolino";
		med.cena = 130.0;
		med.tezina = 1000;
		med.stampa();
		System.out.print("Unesite tezinu u kg / t za proizvod krem ");
		String weight = s.next();
		System.out.println("tezina krema u odabranom parametru je " + krem.konvertuj(weight) + weight);
		System.out.print("Unesite tezinu u kg / t za proizvod med ");
		weight = s.next();
		System.out.println("tezina meda u odabranom parametru je " + med.konvertuj(weight) + weight);

		
		
		
		
		
		
		
		
		
		
	}

}
