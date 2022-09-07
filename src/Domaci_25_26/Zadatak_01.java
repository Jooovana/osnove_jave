package Domaci_25_26;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		
		Student student = new Student("MB-987", "Aleksa Aleksic", "Master");

		Ispit is1 = new Ispit("Hemija", 6, "Aleksa Aleksic");
		Ispit is2 = new Ispit("Fizika", 9, "Jovana Stevanovic");
		Ispit is3 = new Ispit("Matematika", 9, "Ivona Irinic");

		student.dodajIspit(is1);
		student.dodajIspit(is2);
		student.dodajIspit(is3);

		student.stampaj();	
		
		
		
		

	}

}
