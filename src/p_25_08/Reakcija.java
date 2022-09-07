package p_25_08;

public class Reakcija {

	private String tipReakcije;
	private String imeIprezime;
	
	
	
	
	
	public String getTipReakcije() {
		return tipReakcije;
	}
	public void setTipReakcije(String tipReakcije) {
		this.tipReakcije = tipReakcije;
	}
	public String getImeIprezime() {
		return imeIprezime;
	}
	public void setImeIprezime(String imeIprezime) {
		this.imeIprezime = imeIprezime;
	}
	public Reakcija(String tipReakcije, String imeIprezime) {
		super();
		this.tipReakcije = tipReakcije;
		this.imeIprezime = imeIprezime;
	}
	
	public void stampaj() {
		System.out.println(this.imeIprezime + ", reagovao je" + this.tipReakcije);
	}
	
	
	
	
	
	
}
