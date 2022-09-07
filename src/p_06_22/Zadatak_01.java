package p_06_22;

import java.util.ArrayList;

public class Zadatak_01 {

	public static void main(String[] args) {
		
	ArrayList<Proizvod> proizvodi = new ArrayList<Proizvod>();
	
	Proizvod p1 = new IcePoint("vanila", true);
	Proizvod p2 = new IcePoint("cokolada", false);
	Proizvod p3 = new IcePoint("jagoda", true);
	Proizvod p4 = new IcePoint("stracatela", true);
	Proizvod p4 = new Pica(70);
	Proizvod p5 = new Pica(100);
	proizvodi.add(p1);
	proizvodi.add(p2);
	proizvodi.add(p3);
	proizvodi.add(p4);
	proizvodi.add(p5);
	Dodatak d1 = new Dodatak("pecurke", 50);
	Dodatak d2 = new Dodatak("mocarela", 150);
	Dodatak d3 = new Dodatak("kajmak", 190);
	Dodatak d4 = new Dodatak("banana", 50);
	Dodatak d5 = new Dodatak("krem", 90);
	Dodatak d6 = new Dodatak("jagoda", 80);
	Dodatak d7 = new Dodatak("vanila", 100);
	Dodatak d8 = new Dodatak("senf", 20);
	
	
	p1.ubaciDodatak(d5);
	p2.ubaciDodatak(d3);
	p1.ubaciDodatak(d1);
	p2.ubaciDodatak(d2);
	p5.ubaciDodatak(d8);

		

	}

}
