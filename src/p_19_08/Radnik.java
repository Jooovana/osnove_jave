package p_19_08;

public class Radnik {

	private String jmbg;
	private String name;
	private int brojDece;
	private int sSS;
	private int godineStaza;
	
	public Radnik(String jmbg) {
		this.jmbg = jmbg;
	}
	
	public Radnik(String jmbg,
				String  name,
				int brojDece,
				int sSS,
				int godineStaza) {
		this.jmbg = jmbg;
		this.name = name;
		this.brojDece = brojDece;
		this.sSS = sSS;
		this.godineStaza = godineStaza;
		
	}
				
	public double minuliRad(){
		double m = 0;
		if(godineStaza < 10) {
		m = 0.05;
		} else if(godineStaza < 20) {
		m = 0.075;
		} else {
		m = 0.1;
		}}
		
		
	
		
		
		
			
	
	
	
	
	
	
	
	
}
