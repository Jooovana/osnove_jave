package p12_08_22;

public class Zadatak_02_Slack_message {

	public static void main(String[] args) {
		
	SlackMessage first = new SlackMessage();
	
	first.text = "Hi";
	first.author = "Jovana St";
	first.date = "16.08";
	
	SlackMessage second = new SlackMessage();	
	
	second.text = "Hello";
	second.author = "Stefan St";
	second.date = "3.9";
	
	System.out.println(first.author + "-" + first.date);
	System.out.println(first.text);
	
	System.out.println(second.author + "-" + second.date);
	System.out.println(second.text);
	
	first.stampaj();
	second.stampaj();
	
	
	}

}
