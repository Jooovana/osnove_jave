package d_05_06_09_22;

public class Magacioner extends Radnik {

		public Magacioner(String punoIme) {
			super(punoIme);
		}
		
		private double prosecnaPlataSektori () {
			int zbirPlata = 0;
			for ( int i = 0; i < this.sektori.size(); i++ ) {
				zbirPlata += this.sektori.get(i).getPlata();
			}
			return  zbirPlata / this.sektori.size() * 0.5;
		}

		@Override
		public double plata() {
			
			return this.prosecnaPlataSektori() * this.sektori.size();
		}
	

}