package behavior.iterator;

public class JavaDeveloperRunner {
	 public static void main(String[] args) {
		String [] skills = {"Java", "Spring", "Hibernate", "PostgreSQL"};
		
		JavaDeveloper javaDeveloper = new JavaDeveloper("Alex Markelov", skills);
		
		Iterator iterator = javaDeveloper.getIterator();
		
		System.out.println("Developer " + javaDeveloper.getName());
		System.out.println("Skills ");
		
		while (iterator.hasNext()) {
			System.out.println(iterator.next().toString());
		}
	}
}
