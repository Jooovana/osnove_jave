package domaci_16_08;

import java.util.Scanner;

public class zadatak_03_15_08 {

	public static void main(String[] args) {
	
//3.Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru. METODA NISTA NE STAMPA.
	//	ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
	//			ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj a: ");
		int a = s.nextInt();
		System.out.print("Unesite broj b: ");
		int b = s.nextInt();
		int rez = spajanjeBrojeva(a , b);
		System.out.println("nova vrednost je: " + rez);
		
		
		
		
		
		
		
	}

}
