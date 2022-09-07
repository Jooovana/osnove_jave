package p12_08_22;

public class Auto_predavanje_16_08 {

	public String vozac;
	public String marka;
	public int brojVrata;
	public double potrosnja;
	public int brzina;
	public int godinaProizvodnje;
	public int kubikaza;
	public int mesecRegistracije;
	public int maxBrzina;
	
	
	
	public void stampaj() {
		System.out.println(this.vozac);
		System.out.println(this.marka + "-" + brojVrata + "-ro vrata");
		System.out.println("Potrosnja" + this.potrosnja);
		System.out.println("Trenutna brzina" + this.brzina);
	}
	
	public boolean prekoracenje(int dozvoljenaBrzina) {
	if(this.brzina > dozvoljenaBrzina) {
		return true;
	}else {
		return false;
	}
	}
	
	public int kazna(int dozvoljenaBrzina) {
		if(this.brzina > dozvoljenaBrzina) {
			return(this.brzina - dozvoljenaBrzina) * 1000;
			
		}
		return 0;
	}
	
	public boolean oldTimer() {
		if (this.godinaProizvodnje < 1950) {
			return true;
		}else {
			return false;
	}
	
	}
	
	public void dodajGas() {
		this.brzina = this.brzina + 10;
		if(this.brzina > this.maxBrzina ) {
			this.brzina = this.maxBrzina;
		}
	}
	
	
	public void stampajTablu() {
		int brojJedinica = this.brzina * 100 / this.maxBrzina;
		for (int i = 0; i < 100; i++) {
		if (i < brojJedinica) {
			System.out.println("|");
		}
		}
	}
	
}