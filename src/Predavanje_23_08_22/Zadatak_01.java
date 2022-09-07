package Predavanje_23_08_22;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Korisnik jovana = new Korisnik();		
		jovana.setPunoIme("Jovana Stevanovic");
		jovana.pretplatiSe(100);
		
		System.out.println(jovana.getLicenca());
		
		
		Zoom_Call call = new Zoom_Call("nkj","huiou", "jj");
	}

}
