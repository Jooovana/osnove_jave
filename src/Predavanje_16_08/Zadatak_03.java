package Predavanje_16_08;

public class Zadatak_03 {

	public static void main(String[] args) {
		
		Auto auto = new Auto();
		
		
	 auto.imeIPrezimeVozaca = "Jovana St";
	 auto.marka = "Audi";
	 auto.brojVrata = 3;
	 auto.potrosnjaNa100Km = 10;
	 auto.brzina = 80;
	 auto.stampaj();
	 
	if(auto.prekoracenje(50)== true)	{
		System.out.println("Desilo se prekoracenje");
	}else {
		System.out.println("Nije se desilo.");
	}
		
		
		

	}

}
