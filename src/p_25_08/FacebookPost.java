package p_25_08;

import java.util.ArrayList;

public class FacebookPost {

	private String imeIprezimeKorisnika;
	private String tekst;
	private ArrayList<Reakcija>reakcija = new ArrayList<Reakcija>();
	
	
	public FacebookPost(String imeIprezimeKorisnika, String tekst) {
		super();
		this.imeIprezimeKorisnika = imeIprezimeKorisnika;
		this.tekst = tekst;
	}
	
	public void reaguj(Reakcija reakcija) {
		this.reakcija.add(reakcija);
	}

	public String getImeIprezimeKorisnika() {
		return imeIprezimeKorisnika;
	}

	public void setImeIprezimeKorisnika(String imeIprezimeKorisnika) {
		this.imeIprezimeKorisnika = imeIprezimeKorisnika;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public ArrayList<Reakcija> getReakcija() {
		return reakcija;
	}
	
	
	private int brojiReakcije(String tipReakcije) {
		int brojac = 0;
		
		for (int i = 0; i < this.reakcija.size(); i++) {
			if(this.reakcija.get(i).getTip().equals(tipReakcije)) {
				
			}
		}
	}
	
	
	
	
}
