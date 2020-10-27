package structural.decorator;

public class TeamLeadDeveloper extends DeveloperDecorator {

	public TeamLeadDeveloper(Developer developer) {
		super(developer);
	}
	
	public String manageProject() {
		return "Managed project";
	}
	
	@Override
	public String makeJob() {
		return manageProject();
	}

}
