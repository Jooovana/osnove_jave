package p12_08_22;

public class SlackMessage_01 {

	public String text;
	public String author;
	public String date;
	
	public void stampaj() {
		System.out.println(this.author);
		System.out.println(this.author + " - " + this.date);
		System.out.println(this.text);
	}
	
	
	
}
