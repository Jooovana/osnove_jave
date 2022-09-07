package d_22_23;

public class ZeleniKarton {

	private String fullName;
	private String brIndexa;
	private String nazivPredmeta;
	private String imeProfesora;
	private int ocena;
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBrIndexa() {
		return brIndexa;
	}
	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}
	public String getNazivPredmeta() {
		return nazivPredmeta;
	}
	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}
	public String getImeProfesora() {
		return imeProfesora;
	}
	public void setImeProfesora(String imeProfesora) {
		this.imeProfesora = imeProfesora;
	}
	public int getOcena() {
		return ocena;
	}
	public void setOcena(int ocena) {
		this.ocena = ocena;
	}
	public ZeleniKarton(String fullName, String brIndexa, String nazivPredmeta, String imeProfesora, int ocena) {
		super();
		this.fullName = fullName;
		this.brIndexa = brIndexa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesora = imeProfesora;
		this.ocena = ocena;
	}
	
	public boolean polozenIspit() {
		if(this.ocena > 5)
			return true;
		return false;
	}
	
	
	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.fullName + ", " + this.brIndexa);
		System.out.println("Profesor: "  + this.imeProfesora);
	}
	
	
	
	
	
	
	
}
