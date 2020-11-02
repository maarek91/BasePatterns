package behavior.chain;

public class EmailNotifaier extends Notifaier {

	public EmailNotifaier(int priority) {
		super(priority);
	}

	@Override
	public void write(String message) {
		System.out.println("Sending email: " + message);
	}
}
