package d_05_06_09_22;

public class D_06_09_22 {

	public static void main(String[] args) {
	SuperKartica kartica = new SuperKartica();
	
	Korpa korpica = new Korpa();
	
	korpica.dodajAmbalazu(new Tetrapak("849", "Mleko", 100, 140, true, 150));
	
	korpica.dodajAmbalazu(new Tetrapak("645", "Sok", 180, 220, false, 120));	
		
	korpica.dodajAmbalazu(new StaklenaAmbalaza("563", "Koka Kola", 100, 120, 30, true, 129));
		
	System.out.println("Sadrzaj korpe: " );
	for (int i = 0; i < korpica.getAmbalaze().size(); i++) {
		
		korpica.getAmbalaze().get(i).print();
	}
		
	korpica.izbaciAmbalazu("645");	

	
	System.out.println("Sadrzaj korpe: " );
	for (int i = 0; i < korpica.getAmbalaze().size(); i++) {
		
		korpica.getAmbalaze().get(i).print();
	}
	}
}
