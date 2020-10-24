package creational.factory;



public class Program {

	public static void main(String[] args) {
		DeveloperFactory df = createDeveloperBySpeciality("php");
		Developer developer = df.createDeveloper();
		developer.writeCode();
	}
	
	static DeveloperFactory createDeveloperBySpeciality(String speciality) {
		if(speciality.equalsIgnoreCase("java")) {
			return new JavaDeveloperFactory();
		}
		else if(speciality.equalsIgnoreCase("c++")) {
			return new CppDeveloperFactory();
		}
		else if(speciality.equalsIgnoreCase("php")) {
			return new PhpDeveloperFactory();		
		} else {
			throw new RuntimeException(speciality + " is unknown speciality."); 
		}
	}
}
