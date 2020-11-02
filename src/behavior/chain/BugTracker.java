package behavior.chain;

public class BugTracker {

	public static void main(String[] args) {
		Notifaier reportNotifaier = new SimpleReportNotifier(Priority.ROUTINE);
		Notifaier emailNotifaier = new EmailNotifaier(Priority.IMPORTANT);
		Notifaier smsNotifaier = new SMSNotifaier(Priority.ASAP);
		
		reportNotifaier.setNextNotifier(emailNotifaier);
		emailNotifaier.setNextNotifier(smsNotifaier);
		
		reportNotifaier.notifyManager("Everithing is ok", Priority.ROUTINE);
		reportNotifaier.notifyManager("Something wrong", Priority.IMPORTANT);
		reportNotifaier.notifyManager("ALARM", Priority.ASAP);
	}
}
