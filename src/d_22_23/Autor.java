package d_22_23;

public class Autor {

	
	private String imeiPrezime;

	public Autor(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}


	public String getImeiPrezime() {
		return imeiPrezime;
	}


	public void setImeiPrezime(String imeiPrezime) {
		this.imeiPrezime = imeiPrezime;
	}
	
	
	public void stampaj() {
		System.out.println(this.imeiPrezime);
	}
	
	
	
	
	
	
}
