package Domaci_25_26;

public class Zadatak_26_08 {

	public static void main(String[] args) {
		
		Igrac ig1 = new Igrac("Marko Markovic", "87575654", 1985, 10, "Napadac", true);
		Igrac ig2 = new Igrac("Djordje Djordjevic", "398273984", 1997, 21, "Napadac", false);

		ig1.stampaj();
		ig2.stampaj();

		Trener tr1 = new Trener("Predrag Djordjevic", "098696987", 1996);
		Trener tr2 = new Trener("Miroslav Markovic", "892347283", 1987);

		tr1.setGodIskustva(17);
		tr1.setTipTrenera("Kondicioni");
		tr2.setGodIskustva(12);
		tr2.setTipTrenera("Glavni");

		tr1.stampaj();
		tr2.stampaj();
	
		
		
		
		
		
		
		
		

	}

}
