package creational.abstractFactory.website;

import creational.abstractFactory.ProjectManager;

public class WebSitePM implements ProjectManager {
	@Override
	public void manageProject() {
		System.out.println("WebSite PM manages website");
	}
}
