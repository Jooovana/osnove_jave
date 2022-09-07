package Predavanje_23_08_22;

public class FizickoLice {

	private String imeiPrezime;
	private String brojLK;
	private String jmbg;
	private boolean daLijekupovanaNekretnina;
	
	
	
	
	
	public FizickoLice(String jmbg) {
		super();
		this.jmbg = jmbg;
	}
	public FizickoLice(String imeiPrezime, String brojLK, String jmbg, boolean daLijekupovanaNekretnina) {
		this.imeiPrezime = imeiPrezime;
		this.brojLK = brojLK;
		this.jmbg = jmbg;
		this.daLijekupovanaNekretnina = daLijekupovanaNekretnina;
	}
	public String getImeiPrezime() {
		return imeiPrezime;
	}
	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}
	public String getBrojLK() {
		return brojLK;
	}
	public void setBrojLK(String brojLK) {
		this.brojLK = brojLK;
	}
	public boolean isDaLijekupovanaNekretnina() {
		return daLijekupovanaNekretnina;
	}
	public void setDaLijekupovanaNekretnina(boolean daLijekupovanaNekretnina) {
		this.daLijekupovanaNekretnina = daLijekupovanaNekretnina;
	}
	public String getJmbg() {
		return jmbg;
	}
	
	
	
	public void stampaj() {
		System.out.println(this.imeiPrezime + " , " + this.brojLK);
	}
	
	
	
	
	
	
}
