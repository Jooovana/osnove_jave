package Predavanje_23_08_22;

public class Zadatak_02 {

	public static void main(String[] args) {
		
		
		
	FizickoLice jovana = new FizickoLice("Jovana Stevanovic", "23534", "43545", true);	
		
		
	FizickoLice pera = new FizickoLice("pera",
			"74747",
			"435",
			false);	
		
	Ugovor u = new Ugovor("424", "jovana", "joks", 344, "dragoljuba");	
	u.setKupac(pera);
	u.stampaj();
		
		
		
		
		

	}

}
