package d_05_06_09_22;

public class zadatak_1 {

	public static void main(String[] args) {
			// TODO Auto-generated method stub
//			Zadatak  
//			Kreirati klasu Sektor koja ima:
//			 naziv sektora
//			 platu koja je za taj sektor
	//
//			Kreirati abstraktnu klasu Radnik koja ima:
//			 ime i prezime
//			 niz sektora u kojima radi
//			 abstraktnu metodu koja vraca platu radnika
//			 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
	//
//			Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//			 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
	//
//			Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//			 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//			 suma plata svih sektor / broj sektora * 0.5
//			 override uje metodu za platu, tako da se plata racuna po formuli:
//			(prosecna plata za sve sektore u kojima radi) * (broj sektora).
	//
//			U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog

			Menadzer pera = new Menadzer("Pera Peric");
			Magacioner jovana = new Magacioner("Jovana Stevanovic");
			
			Sektor prodaja = new Sektor("prodaja", 100000);
			Sektor nabavka = new Sektor("nabavka", 120000);
			Sektor marketing = new Sektor("marketing", 200000);
			
			pera.zaposliUSektor(prodaja);
			pera.zaposliUSektor(nabavka);
			pera.zaposliUSektor(marketing);
			
			jovana.zaposliUSektor(prodaja);
			jovana.zaposliUSektor(nabavka);
			
			System.out.println("Radnik:" + pera.punoIme);
			System.out.print("Sektori u kojima radi: ");
			for( int i = 0; i < pera.sektori.size(); i++ ) {
				System.out.print(pera.sektori.get(i).getNaziv() + ", ");
			}
			
			System.out.println("Plata: " + pera.plata());
			System.out.println();
			System.out.println("Radnik:" + jovana.punoIme);
			System.out.print("Sektori u kojima radi: ");
			for( int i = 0; i < jovana.sektori.size(); i++ ) {
				System.out.print(jovana.sektori.get(i).getNaziv() + ", ");
			}
			
			System.out.println("Plata: " + jovana.plata());
			
			
		}
		
		
		
		
		
	}


