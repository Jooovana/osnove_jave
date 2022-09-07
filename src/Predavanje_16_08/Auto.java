package Predavanje_16_08;

public class Auto {

	
	public String imeIPrezimeVozaca;
	public String marka;
	public int brojVrata;
	public int potrosnjaNa100Km;
	public int brzina;
	
	
	public void stampaj() {
		System.out.println(this.imeIPrezimeVozaca + " " + this.brojVrata + " -ro vrata");
		System.out.println("Sa potrosnjom od " + this.potrosnjaNa100Km + "l na 100km");
		System.out.println(this.brzina + " km/h je trenutna brzina.");
	}
	
	
	public void prekoracenje(int dozvoljenaBrzina) {
		if(this.brzina > dozvoljenaBrzina) {
			return true;
		} else {
			return false;
		}
	}
	
	public int kazna(int dozvoljenaBrzina) {
		if(this.brzina > dozvoljenaBrzina) {
			return (this.brzina - dozvoljenaBrzina) * 1000;
		}
		return 0;
	}
	
	
}
