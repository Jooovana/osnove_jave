package d_22_23;

public class Racun {

	private int brojRacuna;
	private String imeiPrezimeOsobe;
	private int stanje;
	
	
	
	public int getBrojRacuna() {
		return brojRacuna;
	}
	public void setBrojRacuna(int brojRacuna) {
		this.brojRacuna = brojRacuna;
	}
	public String getImeiPrezimeOsobe() {
		return imeiPrezimeOsobe;
	}
	public void setImeiPrezimeOsobe(String imeiPrezimeOsobe) {
		this.imeiPrezimeOsobe = imeiPrezimeOsobe;
	}
	public int getStanje() {
		return stanje;
	}
	
	public int stanjenaRacunu() {
		
	}
	
	
	public void stampaj() {
		System.out.println(this.imeiPrezimeOsobe + " - " + this.brojRacuna);
		System.out.println("Stanje na racunu je: " + this.stanje + "rsd");
	}
	
	
	
	
}
