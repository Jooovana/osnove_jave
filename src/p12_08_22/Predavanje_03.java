package p12_08_22;

public class Predavanje_03 {

	public static void main(String[] args) {

		Auto auto = new Auto();
		auto.marka = "BMW";
		auto.vozac = "Jovana";
		auto.brzina = 100;
		auto.potrosnja = 5.0;
		auto.brojVrata = 5;
		auto.mesecRegistracije = 5;
		auto.kubikaza = 2000;
		auto.godinaProizvodnje = 1990;
		auto.maxBrzina = 140;
		
		auto.dodajGas();
		
		
		auto.stampaj();
		
		if(auto.prekoracenje(50) == true) {
			System.out.println("Desilo se prekoracenje");
			System.out.println("Kazna" + auto.kazna(50));
			
		}else {
			System.out.println("Nije prekoraceno.");
		}
	

	
	if(auto.oldTimer() == true) {
		System.out.println("Jeste old timer");
	}else {
	System.out.println("Nije oldtimer.");
	
	
	
}}
}