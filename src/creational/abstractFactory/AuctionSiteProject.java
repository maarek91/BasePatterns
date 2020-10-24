package creational.abstractFactory;

import creational.abstractFactory.website.WebSiteTeamFactory;

public class AuctionSiteProject {
	public static void main(String[] args) {
		ProjectTeamFactory projectTeamFactory = new WebSiteTeamFactory();
		Developer developer = projectTeamFactory.getDeveloper();
		Tester tester = projectTeamFactory.getTester();
		ProjectManager projectManger = projectTeamFactory.getProjectManager();
		
		System.out.println("Creating auction site...");	
		
		developer.writeCode();
		tester.testCode();
		projectManger.manageProject();
	}
}

