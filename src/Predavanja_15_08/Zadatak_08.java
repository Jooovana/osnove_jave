package Predavanja_15_08;

public class Zadatak_08 {

	public static void main(String[] args) {
		if (jePravougli(3, 4, 6) == true) {
			System.out.println("Je pravougli");
		} else {
			System.out.println("Nije pravougli.");
		}

	}

	public static boolean jePravougli (int a, int b, int c) {
		
		return a * a + b * b == c * c;
	}
	
	
}
