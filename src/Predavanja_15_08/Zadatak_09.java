package Predavanja_15_08;

import java.util.Scanner;

public class Zadatak_09 {

	public static void main(String[] args) {
		Scanner s = new Scanner();
		
		System.out.println("Unesi vrednost u evrima: ");
		s
	}

	
	public static double menjacnica(double iznos, String valuta) {
		if(valuta == "RSD") {
			return iznos * 117.5;
		} else if (valuta == "USD") {
			return iznos * 1.1 ; 
		} else {
			return iznos * 62.98;
	}}}
	
	
	
