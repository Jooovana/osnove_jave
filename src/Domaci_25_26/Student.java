package Domaci_25_26;

import java.util.ArrayList;

public class Student {

	private String brIndexa;
	private String fullName;
	private String tipStudija;
	
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(String brIndexa, String fullName, String tipStudija) {
		super();
		this.brIndexa = brIndexa;
		this.fullName = fullName;
		this.tipStudija = tipStudija;
	}

	public String getBrIndexa() {
		return brIndexa;
	}

	public void setBrIndexa(String brIndexa) {
		this.brIndexa = brIndexa;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}
	
	public double racunajProsek() {
		double prosek = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if(this.ispiti.get(i).polozio() == true) {
				prosek = this.ispiti.get(i).getOcena();
			}
		}
		return prosek / this.ispiti.size();
	}
	
	public void stampaj() {
		System.out.println(this.brIndexa + " " + this.fullName + " " + this.tipStudija);
	}
	
	
	
	
	
}
