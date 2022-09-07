package P_22_08;

public class Zadatak_03 {

	public static void main(String[] args) {
		
		Clanska_Karta Biblioteka = new Clanska_Karta(10, "45345");
		Kupac jovana = new Kupac();
		jovana.setName("Jovana Stevanovic");
		jovana.setClanska_Kartica(Biblioteka);
		jovana.stampaj();
		
		

	}

}
