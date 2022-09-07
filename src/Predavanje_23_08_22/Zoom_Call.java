package Predavanje_23_08_22;

public class Zoom_Call {

	private String link;
	private String pass;
	private Korisnik host;
	private Korisnik guest;
	
	
	
	public Zoom_Call(String link, String pass, Korisnik host) {
		this.link = link;
		this.pass = pass;
		this.host = host;
	}
	
	
	
	public Korisnik getGuest() {
		return guest;
	}
	public void setGuest(Korisnik guest) {
		this.guest = guest;
	}
	public String getLink() {
		return link;
	}
	public String getPass() {
		return pass;
	}
	public Korisnik getHost() {
		return host;
	}
	
	
	public void stampaj() {
		System.out.println(this.link);
		System.out.println(this.pass);
		this.host.stampaj();
		System.out.println();
	}
	
	
	
	
	
	
	
	
	
}
