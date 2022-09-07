package P_22_08;

public class Kupac {

	private String name;
	private Clanska_Karta kartica;
	
	
	
	public Kupac(String name, Clanska_Karta kartica) {
		this.name = name;
		this.kartica = kartica;
	}



	public Kupac() {
		
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public Clanska_Karta getKartica() {
		return kartica;
	}



	public void setKartica(Clanska_Karta kartica) {
		this.kartica = kartica;
	}
	
	
	public void stampaj() {
		System.out.println(this.name + " - " + this.kartica.getbrKartice());
	}
	
	
	
	
	
	
	
	
}
