package P_22_08;

public class Zadatak_01 {

	public static void main(String[] args) {
		
		Film film = new Film("Inception", 2012);	
		
		Reziser reziser = new Reziser("boba", 20);
		
		film.setReziser(reziser);

	}

}
