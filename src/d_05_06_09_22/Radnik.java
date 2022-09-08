package d_05_06_09_22;

import java.util.ArrayList;

public abstract class Radnik {
		protected String punoIme;
		ArrayList<Sektor> sektori = new ArrayList<Sektor>();
		
		public Radnik(String punoIme) {
			super();
			this.punoIme = punoIme;
		}
		
		public abstract double plata ();
		public void zaposliUSektor ( Sektor sektor ) {
			this.sektori.add(sektor);
		}
	
	
	
	
	
}
