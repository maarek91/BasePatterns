package behavior.template;

public abstract class WebsiteTemplate {
	public void showPage() {
		System.out.println("Header");
		showWebContent();
		System.out.println("Footer");
	}
	
	public abstract void showWebContent();
}
