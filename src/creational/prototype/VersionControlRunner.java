package creational.prototype;

public class VersionControlRunner {
public static void main(String[] args) {
	Project master = new Project(1, "name", "sorce code = 1");
	
	System.out.println(master);
	
	ProjectFactory factory = new ProjectFactory(master);
	Project masterClone = factory.cloneProject();
	System.out.println(masterClone);
}
}
