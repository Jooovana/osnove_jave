package domaci_16_08;

public class zadatak01_15_08 {

	public static void main(String[] args) {

	//Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
	
		int a = 20;
		stampajVrednostZa10Vecu(a);
		a = 30;
		stampajVrednostZa10Vecu(a);
		
		
		
	}
	public static void stampajVrednostZa10Vecu(int a) {
		a = a + 10;
		System.out.println("Vrednost a uvecana za 10 je: " + a);
	}
}
