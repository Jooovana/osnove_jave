package d_22_23;

public class Knjiga {

	private String ISBN;
	private String naziv;
	private int godina;
	private Autor autor;
	
	
	public Knjiga(String iSBN, String naziv, int godina, Autor autor) {
		super();
		ISBN = iSBN;
		this.naziv = naziv;
		this.godina = godina;
		this.autor = autor;
	}


	public String getISBN() {
		return ISBN;
	}


	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}


	public String getNaziv() {
		return naziv;
	}


	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}


	public int getGodina() {
		return godina;
	}


	public void setGodina(int godina) {
		this.godina = godina;
	}


	public Autor getAutor() {
		return autor;
	}


	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	
	
	public void stampaj() {
	System.out.println(this.ISBN);
	System.out.println(this.naziv + " - " + this.godina);
	System.out.println("Autor je: " + this.autor);
		
	}
	
	
	
	
	
	
	
}
