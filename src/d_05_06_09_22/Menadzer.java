package d_05_06_09_22;

public class Menadzer extends Radnik {

	public Menadzer(String punoIme) {
		super(punoIme);
	
	}

	@Override
	public double plata() {
		int zbirPlata = 0;
		for ( int i = 0; i < this.sektori.size(); i++ ) {
			zbirPlata += this.sektori.get(i).getPlata();
		}
		return zbirPlata;
	}

}
