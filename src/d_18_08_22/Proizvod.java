package d_18_08_22;

public class Proizvod {

	public String naziv;
		public double cena;
		public double tezina;
		
		public void stampaj() {
		System.out.println(this.naziv + " " + this.cena + " " + this.tezina + "grama");
		}
		public void povecajCenu(double povecanje) {
			this.cena = this.cena + povecanje;
		}
		public double vratiCenuSaPopustom (int popust) {
		return this.cena - ((this.cena / 100) * popust);
		}
		public int Postarina() {
		if(this.tezina > 0 && this.tezina <= 100) {
			return 200;
		}else if(this.tezina >= 101 && this.tezina <= 500) {
			return 400;
		}else {
			return 1000;
		}
		}
	}