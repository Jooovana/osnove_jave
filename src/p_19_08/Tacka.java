package p_19_08;

public class Tacka {

	private int x;
	private int y;
	
	public Tacka() {
		
	}
	
	public Tacka(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public String getX() {
		return x;
	}

	public void setX(String x) {
		this.x = x;
	}

	public String getY() {
		return y;
	}

	public void setY(String y) {
		this.y = y;
	}
	
	public void stampaj() {
		System.out.println("(" + x + ", " + y + ")");
	}
	
	
	
	
	
	
}
