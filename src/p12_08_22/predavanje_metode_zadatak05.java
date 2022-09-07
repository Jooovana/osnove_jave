package p12_08_22;

public class predavanje_metode_zadatak05 {

	public static void main(String[] args) {
	apsolutnaVrednost(5);
	}

	
	public static void stampajApsolutnuVrednost(int n);{
		if(n < 0) {
		  n = -1 * n;
		}
		System.out.println("Apsolutna vrednost je " + n);
	}
	
	
}
