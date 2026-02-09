package yn;

public class Main {

	// Main method
	public static void main(String[] args) {
		System.out.println("*** MESSAGE GREETER V 1.3 ALL RIGHTS RESERVED ***");
		String message = MessageGenerator.getMessage();
		System.out.println(message);
	}
	
	// for local testing only
	private static String getDummyMessage() {
		return "TEST MESSAGE";
	}
}
