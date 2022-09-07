package Projekat;

public class Player {

	
	
	private String imeIprezime;

	public String getImeIprezime() {
		return imeIprezime;
	}

	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}

	public Player(String imeIprezime) {
		super();
		this.imeIprezime = imeIprezime;
	}
	
	public void stampaj() {
		System.out.println(this.imeIprezime);
	}
	
	
	
	
	
	
	
	
}
