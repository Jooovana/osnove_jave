package Predavanja_15_08;

public class Zadatak_05 {

	public static void main(String[] args) {

		stampajApsolutnuVrednost(5);
	}

	
	public static void stampajApsolutnuVrednost(int n) {
		if( n < 0) {
			n = n * (-1);
		}
		System.out.println("Apsolutna vrednost je " + n);
	}
	
	
	}
