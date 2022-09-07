package p_25_08;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Sastojak s1 = new Sastojak("Slanina", 120);
		Sastojak s2 = new Sastojak("parmezan", 100);
		Sastojak s3 = new Sastojak("pene", 200);
		Sastojak s4 = new Sastojak("pavlaka", 70);
		Sastojak s5 = new Sastojak("kecap", 20);
		
		Pasta karbonara = new Pasta();
		karbonara.dodajSastojak(s1);
		karbonara.dodajSastojak(s2);
		karbonara.dodajSastojak(s3);
		karbonara.dodajSastojak(s4);
		karbonara.dodajSastojak(s5);
		
		karbonara.stampaj();
		
		
		

	}

}
