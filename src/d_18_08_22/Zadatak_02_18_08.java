package d_18_08_22;

public class Zadatak_02_18_08 {

	public static void main(String[] args) {
		
		FB_Post one =new FB_post();
		FB_Post two =new FB_Post();
		
		one.nazivPostavljaca = "Zara";
		one.nazivPrimaoca = "Jovana Stevanovic";
		one.text = "Postovani u toku je sezonsko snizenje";
		one.brLajkova = 2;
		one.brDeljenja = 0;
		
		two.nazivPostavljaca = "Isidora Miladinovic";
		two.nazivPrimaoca = "Marija Markovic";
		two.text = "Molimo Vas, izmirite svoja dugovanja.";
		two.brLajkova = 10;
		two.brDeljenja = 5;
		
		one.like();
		one.like();
		one.dislike();
		one.share();
		one.print();
		
		two.likes();
		two.likes();
		two.dislike();
		two.shares();
		two.print();
	}

}
	}

}
