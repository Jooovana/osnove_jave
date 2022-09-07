package Predavanje_23_08_22;

import java.util.ArrayList;

public class Zadatak_03 {

	public static void main(String[] args) {
	
	ArrayList<Sastojak> sastojci = new ArrayList<Sastojak>();	
		
	Sastojak krem = new Sastojak("Krem", 170);	
		
	Sastojak dzem = new Sastojak("Dzem", 200);	
		
	Sastojak pavlaka = new Sastojak("Oetker", 300);	
		
	sastojci.add(krem);
	sastojci.add(dzem);
	sastojci.add(pavlaka);
	}

}
